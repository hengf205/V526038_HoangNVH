package com.example.demo.bai3.bai1;

import java.util.Scanner;

public class Nguoi {

    private String hoten;
    private int tuoi;

    // Constructor mặc định
    public Nguoi() {
    }

    // Constructor có tham số
    public Nguoi(String hoten, int tuoi) {
        this.hoten = hoten;
        this.tuoi = tuoi;
    }

    // Getter và Setter
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    // Phương thức nhập
    public void nhap(Scanner sc) {

        System.out.print("Nhap ho ten: ");
        hoten = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        tuoi = Integer.parseInt(sc.nextLine());
    }

    // Phương thức xuất
    public void xuat() {

        System.out.println("Ho ten: " + hoten);
        System.out.println("Tuoi: " + tuoi);
    }
}
