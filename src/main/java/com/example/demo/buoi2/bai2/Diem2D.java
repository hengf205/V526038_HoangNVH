package com.example.demo.buoi2.bai2;

public class Diem2D {

    protected double x;
    protected double y;

    // Constructor
    public Diem2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Tính khoảng cách giữa 2 điểm 2D
    public double khoangCach(Diem2D p) {

        double dx = p.x - this.x;
        double dy = p.y - this.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    // Điểm đối xứng qua gốc tọa độ
    public Diem2D doiXung() {

        return new Diem2D(-x, -y);
    }

    // Tịnh tiến điểm
    public void tinhTien(double dx, double dy) {

        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    @Override
    public String toString() {

        return "(" + x + ", " + y + ")";
    }
}
