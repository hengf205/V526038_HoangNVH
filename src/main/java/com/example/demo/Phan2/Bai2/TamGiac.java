package com.example.demo.Phan2.Bai2;

public class TamGiac {

    private Diem A;
    private Diem B;
    private Diem C;

    // Constructor
    public TamGiac(Diem A, Diem B, Diem C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    // Tính khoảng cách giữa 2 điểm
    private double khoangCach(Diem A, Diem B) {
        double dx = B.getX() - A.getX();
        double dy = B.getY() - A.getY();

        return Math.sqrt(dx * dx + dy * dy);
    }

    // Tính chu vi
    public double chuVi() {

        double AB = khoangCach(A, B);
        double BC = khoangCach(B, C);
        double CA = khoangCach(C, A);

        return AB + BC + CA;
    }

    // Tính diện tích
    public double dienTich() {

        double AB = khoangCach(A, B);
        double BC = khoangCach(B, C);
        double CA = khoangCach(C, A);

        double p = (AB + BC + CA) / 2;

        return Math.sqrt(p * (p - AB) * (p - BC) * (p - CA));
    }
}
