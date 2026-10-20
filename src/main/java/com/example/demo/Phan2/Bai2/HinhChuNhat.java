package com.example.demo.Phan2.Bai2;

public class HinhChuNhat {

    private double dai;
    private double rong;

    // Constructor
    public HinhChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    // Tính chu vi
    public double chuVi() {
        return (dai + rong) * 2;
    }

    // Tính diện tích
    public double dienTich() {
        return dai * rong;
    }
}
