package com.example.demo.buoi2.bai2;

public class Diem3D extends Diem2D {

    private double z;

    // Constructor
    public Diem3D(double x, double y, double z) {

        super(x, y);

        this.z = z;
    }

    // Getter z
    public double getZ() {
        return z;
    }

    // Tính khoảng cách giữa 2 điểm 3D
    @Override
    public double khoangCach(Diem2D p) {

        // Nếu điểm truyền vào không phải Diem3D
        // thì không thể tính khoảng cách 3D
        if (!(p instanceof Diem3D)) {
            throw new IllegalArgumentException(
                    "Phai truyen vao mot Diem3D!"
            );
        }

        Diem3D diem = (Diem3D) p;

        double dx = diem.x - this.x;
        double dy = diem.y - this.y;
        double dz = diem.z - this.z;

        return Math.sqrt(
                dx * dx
                        + dy * dy
                        + dz * dz
        );
    }

    // Định nghĩa lại điểm đối xứng
    @Override
    public Diem3D doiXung() {

        return new Diem3D(-x, -y, -z);
    }

    // Tịnh tiến 3D
    public void tinhTien(double dx, double dy, double dz) {

        this.x = this.x + dx;
        this.y = this.y + dy;
        this.z = this.z + dz;
    }

    @Override
    public String toString() {

        return "(" + x + ", " + y + ", " + z + ")";
    }
}
