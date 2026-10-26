package com.example.demo.buoi2.bai2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // =====================================
        // 1. Tạo các điểm 2D
        // =====================================

        Diem2D d1 = new Diem2D(0, 0);
        Diem2D d2 = new Diem2D(3, 4);
        Diem2D d3 = new Diem2D(6, 8);

        System.out.println("=== DIEM 2D ===");

        System.out.println("D1 = " + d1);
        System.out.println("D2 = " + d2);
        System.out.println("D3 = " + d3);

        // Khoảng cách
        System.out.println(
                "Khoang cach D1 - D2 = "
                        + d1.khoangCach(d2)
        );

        System.out.println(
                "Khoang cach D2 - D3 = "
                        + d2.khoangCach(d3)
        );

        // Điểm đối xứng
        Diem2D d1DoiXung = d1.doiXung();

        System.out.println(
                "Diem doi xung cua D1 = "
                        + d1DoiXung
        );

        // Tịnh tiến
        d1.tinhTien(2, 3);

        System.out.println(
                "D1 sau khi tinh tien = "
                        + d1
        );


        // =====================================
        // 2. Tạo các điểm 3D
        // =====================================

        Diem3D d4 = new Diem3D(0, 0, 0);
        Diem3D d5 = new Diem3D(1, 2, 2);
        Diem3D d6 = new Diem3D(3, 4, 12);

        System.out.println("\n=== DIEM 3D ===");

        System.out.println("D4 = " + d4);
        System.out.println("D5 = " + d5);
        System.out.println("D6 = " + d6);

        // Khoảng cách
        System.out.println(
                "Khoang cach D4 - D5 = "
                        + d4.khoangCach(d5)
        );

        System.out.println(
                "Khoang cach D5 - D6 = "
                        + d5.khoangCach(d6)
        );

        // Đối xứng
        Diem3D d4DoiXung = d4.doiXung();

        System.out.println(
                "Diem doi xung cua D4 = "
                        + d4DoiXung
        );

        // Tịnh tiến
        d4.tinhTien(1, 2, 3);

        System.out.println(
                "D4 sau khi tinh tien = "
                        + d4
        );


        // =====================================
        // 3. Danh sách điểm
        // =====================================

        ArrayList<Diem2D> danhSach = new ArrayList<>();

        danhSach.add(new Diem2D(1, 1));
        danhSach.add(new Diem2D(2, 2));
        danhSach.add(new Diem2D(3, 3));

        danhSach.add(new Diem3D(1, 2, 3));
        danhSach.add(new Diem3D(2, 3, 4));

        System.out.println("\n=== DANH SACH DIEM ===");

        for (Diem2D diem : danhSach) {
            System.out.println(diem);
        }


        // =====================================
        // 4. Đưa điểm đối xứng vào danh sách
        // =====================================

        int soLuongBanDau = danhSach.size();

        for (int i = 0; i < soLuongBanDau; i++) {

            Diem2D diem = danhSach.get(i);

            danhSach.add(diem.doiXung());
        }

        System.out.println(
                "\n=== DANH SACH SAU KHI THEM DOI XUNG ==="
        );

        for (Diem2D diem : danhSach) {
            System.out.println(diem);
        }


        // =====================================
        // 5. Tính tổng khoảng cách
        // =====================================

        double tongKhoangCach2D = 0;
        double tongKhoangCach3D = 0;

        // Điểm 2D
        ArrayList<Diem2D> diem2D = new ArrayList<>();

        diem2D.add(new Diem2D(0, 0));
        diem2D.add(new Diem2D(3, 4));
        diem2D.add(new Diem2D(6, 8));

        for (int i = 0; i < diem2D.size() - 1; i++) {

            tongKhoangCach2D +=
                    diem2D.get(i).khoangCach(
                            diem2D.get(i + 1)
                    );
        }

        // Điểm 3D
        ArrayList<Diem3D> diem3D = new ArrayList<>();

        diem3D.add(new Diem3D(0, 0, 0));
        diem3D.add(new Diem3D(1, 2, 2));
        diem3D.add(new Diem3D(3, 4, 12));

        for (int i = 0; i < diem3D.size() - 1; i++) {

            tongKhoangCach3D +=
                    diem3D.get(i).khoangCach(
                            diem3D.get(i + 1)
                    );
        }

        System.out.println("\n=== TONG KHOANG CACH ===");

        System.out.println(
                "Tong khoang cach 2D = "
                        + tongKhoangCach2D
        );

        System.out.println(
                "Tong khoang cach 3D = "
                        + tongKhoangCach3D
        );
    }
}
