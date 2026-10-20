package com.example.demo.Phan2.Bai1;

public class DuongThang {

    private Diem A;
    private Diem B;

    public DuongThang(Diem A, Diem B) {
        this.A = A;
        this.B = B;
    }

    public Diem getA() {
        return A;
    }

    public Diem getB() {
        return B;
    }

    public double doDai() {
        double dx = B.getX() - A.getX();
        double dy = B.getY() - A.getY();

        return Math.sqrt(dx * dx + dy * dy);
    }
}
