package project.adminshop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import project.adminshop.Class.RestponseDTO;
import project.adminshop.Model.*;
import project.adminshop.Services.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @Autowired
    private HangSanXuatService hangSanXuatService;

    @Autowired
    private DanhMucService danhMucService;

    @Autowired
    private VaiTroService vaiTroService;

    @Autowired
    private NguoiDungService nguoiDungService;

    @Autowired
    private SanPhamService sanPhamService;

    @Autowired
    private DonHangService donHangService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
    DateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");


    //HangSanXuat

    @RequestMapping(value = "/getAllBrand",method = RequestMethod.GET)
    public RestponseDTO getAllBrand(){
        try {
            return new RestponseDTO(200, "Success", hangSanXuatService.getAllHangSanXuat());
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }


    @RequestMapping(value = "/updateBrand",method = RequestMethod.POST)
    @ResponseBody
    public RestponseDTO updateBrand(@RequestParam Map<String,String> map){

        try {
            HangSanXuatDto hangSanXuatDto = new HangSanXuatDto(Long.valueOf(map.get("id")),map.get("tenHangSanXuat"));
            return new RestponseDTO(200, "Success", hangSanXuatService.updateHangSanXuat(hangSanXuatDto));
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    @RequestMapping(value = "/deleteBrand",method = RequestMethod.POST)
    @ResponseBody
    public RestponseDTO deleteBrand(@RequestParam Map<String,String> map){
        try {
            return new RestponseDTO(200, "Success", hangSanXuatService.deleteHangSanXuat(Long.valueOf(map.get("id"))));
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    @RequestMapping(value = "/addBrand",method = RequestMethod.POST)
    @ResponseBody
    public RestponseDTO addBrand(@RequestParam Map<String,String> map){
        try {
            HangSanXuatDto hangSanXuatDto = new HangSanXuatDto();
            hangSanXuatDto.setTenHangSanXuat(map.get("tenHangSanXuat"));
            return new RestponseDTO(200, "Success", hangSanXuatService.addHangSanXuat(hangSanXuatDto));
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    //Danh muc

    @RequestMapping(value = "/getAllCategory",method = RequestMethod.GET)
    public RestponseDTO getAllCategory(){
        try {
            return new RestponseDTO(200, "Success", danhMucService.getAllDanhMuc());
        }
        catch (Exception e){
            e.printStackTrace();
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }
    @RequestMapping(value = "/updateCategory",method = RequestMethod.POST)
    @ResponseBody
    public RestponseDTO updateCategory(@RequestParam Map<String,String> map){

        try {
            DanhMucDto danhMucDto = new DanhMucDto(Long.valueOf(map.get("id")),map.get("tenDanhMuc"));
            return new RestponseDTO(200, "Success", danhMucService.updateDanhMuc(danhMucDto));
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    @RequestMapping(value = "/deleteCategory",method = RequestMethod.POST)
    @ResponseBody
    public RestponseDTO deleteCategory(@RequestParam Map<String,String> map){
        try {
            return new RestponseDTO(200, "Success", danhMucService.deleteDanhMuc(Long.valueOf(map.get("id"))));
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    @RequestMapping(value = "/addCategory",method = RequestMethod.POST)
    @ResponseBody
    public RestponseDTO addCategory(@RequestParam Map<String,String> map){

        try {
            DanhMucDto danhMucDto = new DanhMucDto();
            danhMucDto.setTenDanhMuc(map.get("tenDanhMuc"));
            return new RestponseDTO(200, "Success", danhMucService.createDanhMuc(danhMucDto));
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    //Vai tro
    @RequestMapping(value = "/getAllRole",method = RequestMethod.GET)
    public RestponseDTO getAllRole(){
        try {
            return new RestponseDTO(200, "Success", vaiTroService.getAllVaiTro());
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    @RequestMapping(value = "/updateRole",method = RequestMethod.POST)
    @ResponseBody
    public RestponseDTO updateRole(@RequestParam Map<String,String> map){

        try {
            VaiTroDto vaiTroDto = new VaiTroDto(Long.valueOf(map.get("id")),map.get("tenVaiTro"));
            return new RestponseDTO(200, "Success", vaiTroService.updateVaiTro(vaiTroDto));
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    @RequestMapping(value = "/deleteRole",method = RequestMethod.POST)
    @ResponseBody
    public RestponseDTO deleteRole(@RequestParam Map<String,String> map){
        try {
            return new RestponseDTO(200, "Success", vaiTroService.deleteVaiTro(Long.valueOf(map.get("id"))));
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    @RequestMapping(value = "/addRole",method = RequestMethod.POST)
    @ResponseBody
    public RestponseDTO addRole(@RequestParam Map<String,String> map){

        try {
            VaiTroDto vaiTroDto = new VaiTroDto();
            vaiTroDto.setTenVaiTro(map.get("tenVaiTro"));
            return new RestponseDTO(200, "Success", vaiTroService.createVaiTro(vaiTroDto));
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    //Nguoi dung
    @RequestMapping(value = "/getAllUser",method = RequestMethod.GET)
    public RestponseDTO getAllUser(){
        try {
            return new RestponseDTO(200, "Success", nguoiDungService.getAllNguoiDung());
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    @RequestMapping(value ="/getUserByEmail",method = RequestMethod.GET)
    public RestponseDTO getUserByEmail(@RequestParam Map<String,String> map){
        try {
            return new RestponseDTO(200, "Success", nguoiDungService.getNguoiDungByEmail(map.get("email")));
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    @ResponseBody
    public RestponseDTO updateUser(@RequestParam Map<String,String> map){

        try {
            VaiTroDto vaiTroDto = vaiTroService.getVaiTroById(Long.valueOf(map.get("idVaiTro")));
            NguoiDungDto nguoiDungDto = nguoiDungService.getNguoiDungById(Long.valueOf(map.get("id")));
            nguoiDungDto.setHoTen(map.get("hoTen"));
            nguoiDungDto.setEmail(map.get("email"));
            nguoiDungDto.setDiaChi(map.get("diaChi"));
            nguoiDungDto.setSoDienThoai(map.get("soDienThoai"));
            nguoiDungDto.setMaVaiTro(vaiTroDto);
            if (!nguoiDungDto.getPassword().equals(map.get("password"))){
                nguoiDungDto.setPassword(passwordEncoder.encode(map.get("password")));
            }
            return new RestponseDTO(200, "Success", nguoiDungService.updateNguoiDung(nguoiDungDto));
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    @RequestMapping(value = "/deleteUser",method = RequestMethod.POST)
    @ResponseBody
    public RestponseDTO deleteUser(@RequestParam Map<String,String> map){
        try {
            return new RestponseDTO(200, "Success", nguoiDungService.deleteNguoiDung(Long.valueOf(map.get("id"))));
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    @ResponseBody
    public RestponseDTO addUser(@RequestParam Map<String,String> map){
        try {
            VaiTroDto vaiTroDto = vaiTroService.getVaiTroById(Long.valueOf(map.get("idVaiTro")));
            NguoiDungDto nguoiDungDto = new NguoiDungDto();
            nguoiDungDto.setHoTen(map.get("hoTen"));
            nguoiDungDto.setEmail(map.get("email"));
            nguoiDungDto.setDiaChi(map.get("diaChi"));
            nguoiDungDto.setSoDienThoai(map.get("soDienThoai"));
            nguoiDungDto.setMaVaiTro(vaiTroDto);
            nguoiDungDto.setPassword(passwordEncoder.encode(map.get("password")));
            return new RestponseDTO(200, "Success", nguoiDungService.createNguoiDung(nguoiDungDto));
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    //San pham
    @RequestMapping(value = "/getAllProduct",method = RequestMethod.GET)
    public RestponseDTO getAllProduct(){
        try {
            return new RestponseDTO(200, "Success", sanPhamService.getAllSanPham());
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    @RequestMapping(value ="/getProductById",method = RequestMethod.GET)
    public RestponseDTO getProductById(@RequestParam Map<String,String> map){
        try {
            return new RestponseDTO(200, "Success", sanPhamService.getSanPhamById(Long.valueOf(map.get("id"))));
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    @RequestMapping(value = "/updateProduct",method = RequestMethod.POST)
    @ResponseBody
    public RestponseDTO updateProduct(@RequestBody Map<String,String> map){

        try {
            SanPhamDto sanPhamDto = sanPhamService.getSanPhamById(Long.valueOf(map.get("id")));
            sanPhamDto.setCpu(map.get("cpu"));
            sanPhamDto.setDonGia(Long.valueOf(map.get("donGia")));
            sanPhamDto.setDonViBan(Integer.valueOf(map.get("donViBan")));
            sanPhamDto.setDonViKho(Integer.valueOf(map.get("donViKho")));
            sanPhamDto.setDungLuongPin(map.get("dungLuongPin"));
            sanPhamDto.setHeDieuHanh(map.get("heDieuHanh"));
            sanPhamDto.setManHinh(map.get("manHinh"));
            sanPhamDto.setRam(map.get("ram"));
            sanPhamDto.setTenSanPham(map.get("tenSanPham"));
            sanPhamDto.setThietKe(map.get("thietKe"));
            sanPhamDto.setThongTinBaoHanh(map.get("thongTinBaoHanh"));
            sanPhamDto.setThongTinChung(map.get("thongTinChung"));
            sanPhamDto.setMoTa(map.get("moTa"));
            sanPhamDto.setHinhAnh(map.get("hinhAnh"));
            sanPhamDto.setMaDanhMuc(danhMucService.getDanhMucById(Long.valueOf(map.get("idDanhMuc"))));
            sanPhamDto.setMaHangSx(hangSanXuatService.getHangSanXuatById(Long.valueOf(map.get("idHangSanXuat"))));
            return new RestponseDTO(200, "Success", sanPhamService.updateSanPham(sanPhamDto));
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    @RequestMapping(value = "/deleteProduct",method = RequestMethod.POST)
    @ResponseBody
    public RestponseDTO deleteProduct(@RequestParam Map<String,String> map){
        try {
            return new RestponseDTO(200, "Success", sanPhamService.deleteSanPham(Long.valueOf(map.get("id"))));
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    @RequestMapping(value = "/addProduct",method = RequestMethod.POST)
    @ResponseBody
    public RestponseDTO addProduct(@RequestBody Map<String,String> map){
        try {
            SanPhamDto sanPhamDto = new SanPhamDto();
            sanPhamDto.setCpu(map.get("cpu"));
            sanPhamDto.setDonGia(Long.valueOf(map.get("donGia")));
            sanPhamDto.setDonViBan(0);
            sanPhamDto.setDonViKho(Integer.valueOf(map.get("donViKho")));
            sanPhamDto.setDungLuongPin(map.get("dungLuongPin"));
            sanPhamDto.setHeDieuHanh(map.get("heDieuHanh"));
            sanPhamDto.setManHinh(map.get("manHinh"));
            sanPhamDto.setHinhAnh(map.get("hinhAnh"));
            sanPhamDto.setRam(map.get("ram"));
            sanPhamDto.setTenSanPham(map.get("tenSanPham"));
            sanPhamDto.setThietKe(map.get("thietKe"));
            sanPhamDto.setThongTinBaoHanh(map.get("thongTinBaoHanh"));
            sanPhamDto.setThongTinChung(map.get("thongTinChung"));
            sanPhamDto.setMoTa(map.get("moTa"));
            sanPhamDto.setMaDanhMuc(danhMucService.getDanhMucById(Long.valueOf(map.get("idDanhMuc"))));
            sanPhamDto.setMaHangSx(hangSanXuatService.getHangSanXuatById(Long.valueOf(map.get("idHangSanXuat"))));
            return new RestponseDTO(200, "Success", sanPhamService.addSanPham(sanPhamDto));
        }catch (Exception e){
            e.printStackTrace();
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }
    //Don Hang

    @RequestMapping(value = "/getAllOrder",method = RequestMethod.GET)
    @ResponseBody
    public RestponseDTO getAllDonHang(){
        try {
            return new RestponseDTO(200, "Success", donHangService.getAllDonHang());
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    @RequestMapping(value = "/getOrderById",method = RequestMethod.GET)
    @ResponseBody
    public RestponseDTO getDonHangById(@RequestParam Map<String,String> map){
        try {
            return new RestponseDTO(200, "Success", donHangService.getDonHangById(Long.valueOf(map.get("id"))));
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }
    @RequestMapping(value = "/getOrderByUserId",method = RequestMethod.GET)
    @ResponseBody
    public RestponseDTO getDonHangByUserId(@RequestParam Map<String,String> map){
        try {
            return new RestponseDTO(200, "Success", donHangService.getDonHangByUserId(Long.valueOf(map.get("id"))));
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    @RequestMapping(value ="/getOrderByStatus",method = RequestMethod.GET)
    @ResponseBody
    public RestponseDTO getDonHangByStatus(@RequestParam Map<String,String> map){
        try {
            return new RestponseDTO(200, "Success", donHangService.getDonHangByStatus(map.get("status")));
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    @RequestMapping(value ="/getOrderByTime",method = RequestMethod.GET)
    @ResponseBody
    public RestponseDTO getDonHangByTime(@RequestParam Map<String,String> map){
        try {
            return new RestponseDTO(200, "Success", donHangService.getDonHangByTime(map.get("start"),map.get("end")));
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    @RequestMapping(value ="/getDetailOrderByOrderId",method = RequestMethod.GET)
    @ResponseBody
    public RestponseDTO getDetailOrderByOrderId(@RequestParam Map<String,String> map){
        try {
            return new RestponseDTO(200, "Success", donHangService.getChiTietDonHangByDonHangId(Long.valueOf(map.get("id"))));
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    @RequestMapping(value ="/addOrder",method = RequestMethod.POST)
    @ResponseBody
    public RestponseDTO addDonHang(@RequestBody Map<String,String> map){

        Instant instant = Instant.now();
        try {
            DonHangDto donHangDTO = new DonHangDto();
            donHangDTO.setDiaChiNhan(map.get("diaChiNhan"));
            donHangDTO.setGhiChu(map.get("ghiChu"));
            donHangDTO.setHoTenNguoiNhan(map.get("hoTenNguoiNhan"));
            donHangDTO.setNgayDatHang(instant);
            donHangDTO.setNgayGiaoHang(instant.plus(Long.valueOf(map.get("ngayGiaoNhan")), ChronoUnit.DAYS) );
            donHangDTO.setSdtNhanHang(map.get("sdtNhanHang"));
            donHangDTO.setTrangThaiDonHang("created");
            donHangDTO.setMaNguoiDat(nguoiDungService.getNguoiDungById(Long.valueOf(map.get("maNguoiDat"))));
            System.out.println(donHangService.addDonHang(donHangDTO));
            return new RestponseDTO(200, "Success", donHangService.lastetDonHangId(Long.valueOf(map.get("maNguoiDat"))));
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    @RequestMapping(value ="/updateOrder",method = RequestMethod.POST)
    @ResponseBody
    public RestponseDTO updateDonHang(@RequestBody Map<String,String> map){
        try {
            DonHangDto donHangDTO = donHangService.getDonHangById(Long.valueOf(map.get("id")));
            donHangDTO.setDiaChiNhan(map.get("diaChiNhan"));
            donHangDTO.setGhiChu(map.get("ghiChu"));
            donHangDTO.setHoTenNguoiNhan(map.get("hoTenNguoiNhan"));
            donHangDTO.setNgayGiaoHang(Instant.parse(outputFormat.format((Date)inputFormat.parse(map.get("ngayGiaoNhan"))))  );
            donHangDTO.setNgayNhanHang(Instant.parse(outputFormat.format((Date)inputFormat.parse(map.get("ngayNhanHang"))))  );
            donHangDTO.setSdtNhanHang(map.get("sdtNhanHang"));
            donHangDTO.setTrangThaiDonHang(map.get("trangThaiDonHang"));
            donHangDTO.setTongTien(Integer.valueOf(map.get("tongTien")));
            return new RestponseDTO(200, "Success", donHangService.updateDonHang(donHangDTO));
        }catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    @RequestMapping(value ="/deleteOrder",method = RequestMethod.POST)
    @ResponseBody
    public RestponseDTO deleteDonHang(@RequestParam Map<String,String> map){
        try {
            return new RestponseDTO(200, "Success", donHangService.deleteDonHang(Long.valueOf(map.get("id"))));
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    @RequestMapping(value ="/addDetailOrder",method = RequestMethod.POST)
    @ResponseBody
    public RestponseDTO addDetailOrder(@RequestParam Map<String,String> map){
        try {
            ChiTietDonHangDto chiTietDonHangDTO = new ChiTietDonHangDto();
            chiTietDonHangDTO.setMaDonHang(donHangService.getDonHangById(Long.valueOf(map.get("maDonHang"))));
            chiTietDonHangDTO.setMaSanPham(sanPhamService.getSanPhamById(Long.valueOf(map.get("maSanPham"))));
            chiTietDonHangDTO.setSoLuong(Integer.valueOf(map.get("soLuong")));
            chiTietDonHangDTO.setDonGia(Long.valueOf(map.get("gia")));
            return new RestponseDTO(200, "Success", donHangService.addChiTietDonHang(chiTietDonHangDTO));
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    @RequestMapping(value ="/updateDetailOrder",method = RequestMethod.POST)
    @ResponseBody
    public RestponseDTO updateDetailOrder(@RequestParam Map<String,String> map){
        try {
            ChiTietDonHangDto chiTietDonHangDTO = donHangService.getChiTietDonHangById(Long.valueOf(map.get("id")));
            chiTietDonHangDTO.setSoLuong(Integer.valueOf(map.get("soLuong")));
            chiTietDonHangDTO.setDonGia(Long.valueOf(map.get("gia")));
            return new RestponseDTO(200, "Success", donHangService.updateChiTietDonHang(chiTietDonHangDTO));
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

    @RequestMapping(value ="/deleteDetailOrder",method = RequestMethod.POST)
    @ResponseBody
    public RestponseDTO deleteDetailOrder(@RequestParam Map<String,String> map){
        try {
            return new RestponseDTO(200, "Success", donHangService.deleteChiTietDonHang(Long.valueOf(map.get("id"))));
        }
        catch (Exception e){
            return new RestponseDTO(500, "Error", e.getMessage());
        }
    }

}
