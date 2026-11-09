package com.example.demo.bai3.bai1;

import java.util.Scanner;

public class NhanVien extends Nguoi {

    private int snct;
    private double hsl;

    // Lương cơ bản
    private final double lcb = 1500000;

    // Constructor mặc định
    public NhanVien() {
    }

    // Constructor có tham số
    public NhanVien(String hoten, int tuoi, int snct, double hsl) {

        super(hoten, tuoi);

        this.snct = snct;
        this.hsl = hsl;
    }

    // Getter và Setter
    public int getSnct() {
        return snct;
    }

    public void setSnct(int snct) {
        this.snct = snct;
    }

    public double getHsl() {
        return hsl;
    }

    public void setHsl(double hsl) {
        this.hsl = hsl;
    }

    // Phương thức nhập
    @Override
    public void nhap(Scanner sc) {

        super.nhap(sc);

        System.out.print("Nhap so nam cong tac: ");
        snct = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap he so luong: ");
        hsl = Double.parseDouble(sc.nextLine());
    }

    // Tính tiền phụ cấp
    public double tinhPhuCap() {

        return 200000 * snct;
    }

    // Tính tiền lương
    public double tinhTienLuong() {

        return lcb * hsl + tinhPhuCap();
    }

    // Phương thức xuất
    @Override
    public void xuat() {

        super.xuat();

        System.out.println("So nam cong tac: " + snct);
        System.out.println("He so luong: " + hsl);
        System.out.println("Phu cap: " + tinhPhuCap());
        System.out.println("Tien luong: " + tinhTienLuong());
    }
}
