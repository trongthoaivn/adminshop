package project.adminshop.Class;

import project.adminshop.Model.ChiTietDonHangDto;
import project.adminshop.Model.DonHangDto;

import java.util.List;

public class DonHangAndChiTiet {
    private DonHangDto DonHang;
    private List<ChiTietDonHangDto> ChiTiet;

    public DonHangAndChiTiet() {
    }

    public DonHangAndChiTiet(DonHangDto donHang, List<ChiTietDonHangDto> chiTiet) {
        DonHang = donHang;
        ChiTiet = chiTiet;
    }

    public DonHangDto getDonHang() {
        return DonHang;
    }

    public void setDonHang(DonHangDto donHang) {
        DonHang = donHang;
    }

    public List<ChiTietDonHangDto> getChiTiet() {
        return ChiTiet;
    }

    public void setChiTiet(List<ChiTietDonHangDto> chiTiet) {
        ChiTiet = chiTiet;
    }
}
