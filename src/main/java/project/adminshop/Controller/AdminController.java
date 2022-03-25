package project.adminshop.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import project.adminshop.Entity.NguoiDung;
import project.adminshop.Model.DonHangDto;
import project.adminshop.Model.NguoiDungDto;
import project.adminshop.Repository.NguoiDungRepository;
import project.adminshop.Repository.VaiTroRepository;
import project.adminshop.Services.DonHangService;
import project.adminshop.Services.SanPhamService;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping(value = {"/admin","/"})
public class AdminController {

    private Object principal;

    @Autowired
    private NguoiDungRepository nguoiDungRepository;

    @Autowired
    private VaiTroRepository vaiTroRepository;

    @Autowired
    private SanPhamService sanPhamService;

    @Autowired
    private DonHangService donHangService;

    @Autowired
    private PasswordEncoder passwordEncoder;


    DateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
    DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

    @GetMapping(value = "/404")
    public String error404(Model model) {
        model.addAttribute("UserInfo", nguoiDungRepository.findByEmail(((UserDetails) principal).getUsername()) );
        model.addAttribute("title", "My Profile");
        return "/Auth/404";
    }

    @GetMapping(value = "/home")
    public String home(Model model) {
        this.principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("UserInfo", nguoiDungRepository.findByEmail(((UserDetails) principal).getUsername()));
        model.addAttribute("title", "Home");
        return "Admin/home";
    }

    //My Profile

    @RequestMapping(value = "/my-profile", method = RequestMethod.GET)
    public String myProfile(Model model) {
        model.addAttribute("UserInfo", nguoiDungRepository.findByEmail(((UserDetails) principal).getUsername()) );
        model.addAttribute("title", "My Profile");
        return "Admin/myprofile";
    }


    @RequestMapping(value ="/my-profile", method = RequestMethod.POST)
    public String updateMyProfile(@RequestParam Map<String, String> body) {
        NguoiDung nguoiDung = nguoiDungRepository.findById(Long.valueOf(body.get("id"))).get();
        nguoiDung.setHoTen(body.get("hoTen"));
        nguoiDung.setSoDienThoai(body.get("soDienThoai"));
        nguoiDung.setDiaChi(body.get("diaChi"));
        if (!nguoiDung.getPassword().equals(body.get("password"))) {
            nguoiDung.setPassword(passwordEncoder.encode(body.get("password")));
        }
        nguoiDung.setMaVaiTro(vaiTroRepository.findById(Long.valueOf(body.get("role"))).get());
        nguoiDungRepository.save(nguoiDung);
        return "redirect:/admin/my-profile";
    }

    //Brand Management

    @RequestMapping(value ="/brand", method = RequestMethod.GET)
    public String brand(Model model) {
        model.addAttribute("UserInfo", nguoiDungRepository.findByEmail(((UserDetails) principal).getUsername()) );
        model.addAttribute("title", "Brand Management");
        return "Admin/brand";
    }

    @GetMapping(value = "/product")
    public String product(Model model) {
        model.addAttribute("UserInfo", nguoiDungRepository.findByEmail(((UserDetails) principal).getUsername()));
        model.addAttribute("title", "Product Management");
        return "Admin/product";
    }

    @GetMapping(value = "/product/add")
    public String addProduct(Model model) {
        model.addAttribute("UserInfo", nguoiDungRepository.findByEmail(((UserDetails) principal).getUsername()));
        model.addAttribute("title", "Add Product");
        return "Admin/add-product";
    }

    @GetMapping(value = "/product/edit")
    public String editProduct(@RequestParam  Map<String,String> map,Model model) {
        if (map.get("id") != null) {
            model.addAttribute("UserInfo", nguoiDungRepository.findByEmail(((UserDetails) principal).getUsername()));
            model.addAttribute("title", "Edit Product");
            model.addAttribute("product", sanPhamService.getSanPhamById(Long.valueOf(map.get("id"))));
            return "Admin/edit-product";
        }
        return "redirect:/admin/product";
    }

    @GetMapping(value = "/category")
    public String category(Model model) {
        model.addAttribute("UserInfo", nguoiDungRepository.findByEmail(((UserDetails) principal).getUsername()) );
        model.addAttribute("title", "Category Management");
        return "Admin/category";
    }

    @GetMapping(value = "/order")
    public String order(Model model) {
        model.addAttribute("UserInfo", nguoiDungRepository.findByEmail(((UserDetails) principal).getUsername()) );
        model.addAttribute("title", "Order Management");;
        return "Admin/order";
    }

    @GetMapping(value = "/order/edit")
    public String orderEdit(@RequestParam Map<String, String> map, Model model) throws ParseException {
        if (map.get("id") != null) {
            DonHangDto donHangDto = donHangService.getDonHangById(Long.valueOf(map.get("id")));
            model.addAttribute("UserInfo", nguoiDungRepository.findByEmail(((UserDetails) principal).getUsername()));
            model.addAttribute("title", "Order Detail");
            model.addAttribute("order", donHangDto);
            if (donHangDto.getNgayDatHang() != null) {
                model.addAttribute("ngayDatHang", outputFormat.format((Date) inputFormat.parse(donHangDto.getNgayDatHang().toString())));
            }else {
                model.addAttribute("ngayDatHang", "");
            }
             if (donHangDto.getNgayGiaoHang() != null) {
                model.addAttribute("ngayGiaoHang", outputFormat.format((Date) inputFormat.parse(donHangDto.getNgayGiaoHang().toString())));
             }else {
                model.addAttribute("ngayGiaoHang", "");
             }

             if (donHangDto.getNgayNhanHang() != null) {
                model.addAttribute("ngayNhanHang", outputFormat.format((Date) inputFormat.parse(donHangDto.getNgayNhanHang().toString())));
             }else {
                model.addAttribute("ngayNhanHang", "");
             }
            model.addAttribute("orderDetail",donHangService.getChiTietDonHangByDonHangId(Long.valueOf(map.get("id"))));
            return "Admin/edit-order";
        }
        return "redirect:/admin/order";
    }

    @GetMapping(value = "/order/add")
    public String addOrder(Model model) {
        model.addAttribute("UserInfo", nguoiDungRepository.findByEmail(((UserDetails) principal).getUsername()));
        model.addAttribute("title", "Add Order");
        return "Admin/add-order";
    }

    @GetMapping(value ="/cart")
    public String cart(Model model) {
        model.addAttribute("UserInfo", nguoiDungRepository.findByEmail(((UserDetails) principal).getUsername()) );
        model.addAttribute("title", "Cart Management");
        return "Admin/cart";
    }

    @GetMapping(value = "/users")
    public String user(Model model) {
        model.addAttribute("UserInfo", nguoiDungRepository.findByEmail(((UserDetails) principal).getUsername()) );
        model.addAttribute("title", "User Management");
        return "Admin/users";
    }

    @GetMapping(value = "/role")
    public String role(Model model) {
        model.addAttribute("UserInfo", nguoiDungRepository.findByEmail(((UserDetails) principal).getUsername()) );
        model.addAttribute("title", "Role Management");
        return "Admin/role";
    }


}
