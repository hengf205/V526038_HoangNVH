package com.example.demo.Phan2.Bai2;

public class HinhTron {

    private Diem O;
    private double r;

    // Constructor
    public HinhTron(Diem O, double r) {
        this.O = O;
        this.r = r;
    }

    // Tính chu vi
    public double chuVi() {
        return 2 * Math.PI * r;
    }

    // Tính diện tích
    public double dienTich() {
        return Math.PI * r * r;
    }
}