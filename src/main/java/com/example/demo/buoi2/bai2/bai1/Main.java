package com.example.demo.buoi2.bai2.bai1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // ==================================
        // 1. Tạo các phân số
        // ==================================

        PhanSo ps1 = new PhanSo(1, 2);
        PhanSo ps2 = new PhanSo(3, 4);

        System.out.println("PS1 = " + ps1);
        System.out.println("PS2 = " + ps2);

        // ==================================
        // 2. Các phép tính
        // ==================================

        System.out.println("\n=== PHEP TINH ===");

        System.out.println(
                "Tong = " + ps1.cong(ps2)
        );

        System.out.println(
                "Hieu = " + ps1.tru(ps2)
        );

        System.out.println(
                "Tich = " + ps1.nhan(ps2)
        );

        System.out.println(
                "Thuong = " + ps1.chia(ps2)
        );

        // ==================================
        // 3. So sánh
        // ==================================

        System.out.println("\n=== SO SANH ===");

        int ketQua = ps1.soSanh(ps2);

        if (ketQua > 0) {
            System.out.println(ps1 + " lon hon " + ps2);
        } else if (ketQua < 0) {
            System.out.println(ps1 + " nho hon " + ps2);
        } else {
            System.out.println(ps1 + " bang " + ps2);
        }

        // ==================================
        // 4. Rút gọn
        // ==================================

        PhanSo ps3 = new PhanSo(12, 18);

        System.out.println("\n=== RUT GON ===");

        System.out.println("Truoc khi rut gon: " + ps3);

        ps3.rutGon();

        System.out.println("Sau khi rut gon: " + ps3);

        // ==================================
        // 5. Tạo tập hợp phân số
        // ==================================

        ArrayList<PhanSo> danhSach = new ArrayList<>();

        danhSach.add(new PhanSo(1, 2));
        danhSach.add(new PhanSo(3, 4));
        danhSach.add(new PhanSo(5, 2));
        danhSach.add(new PhanSo(2, 3));
        danhSach.add(new PhanSo(7, 1));

        System.out.println("\n=== DANH SACH PHAN SO ===");

        for (PhanSo ps : danhSach) {
            System.out.println(ps);
        }

        // ==================================
        // 6. Tìm phân số lớn nhất
        // ==================================

        PhanSo max = danhSach.get(0);

        for (PhanSo ps : danhSach) {

            if (ps.soSanh(max) > 0) {
                max = ps;
            }
        }

        System.out.println("\nPhan so lon nhat = " + max);

        // ==================================
        // 7. Tính tổng các phân số
        // ==================================

        PhanSo tong = new PhanSo();

        for (PhanSo ps : danhSach) {
            tong = tong.cong(ps);
        }

        System.out.println("Tong cac phan so = " + tong);

        // ==================================
        // 8. Tìm phân số không phải số nguyên
        // ==================================

        System.out.println("\n=== PHAN SO KHONG PHAI SO NGUYEN ===");

        for (PhanSo ps : danhSach) {

            if (!ps.laSoNguyen()) {
                System.out.println(ps);
            }
        }
    }
}
