package com.example.demo.Phan2.Bai2;

public class Main {

    public static void main(String[] args) {

        // =========================
        // TAM GIAC
        // =========================

        Diem A1 = new Diem(0, 0);
        Diem B1 = new Diem(3, 0);
        Diem C1 = new Diem(0, 4);

        TamGiac tg1 = new TamGiac(A1, B1, C1);

        System.out.println("=== TAM GIAC 1 ===");
        System.out.println("Chu vi = " + tg1.chuVi());
        System.out.println("Dien tich = " + tg1.dienTich());


        Diem A2 = new Diem(0, 0);
        Diem B2 = new Diem(4, 0);
        Diem C2 = new Diem(0, 3);

        TamGiac tg2 = new TamGiac(A2, B2, C2);

        System.out.println("\n=== TAM GIAC 2 ===");
        System.out.println("Chu vi = " + tg2.chuVi());
        System.out.println("Dien tich = " + tg2.dienTich());


        // =========================
        // CHU NHAT
        // =========================

        HinhChuNhat cn1 = new HinhChuNhat(10, 5);

        System.out.println("\n=== CHU NHAT 1 ===");
        System.out.println("Chu vi = " + cn1.chuVi());
        System.out.println("Dien tich = " + cn1.dienTich());


        HinhChuNhat cn2 = new HinhChuNhat(8, 4);

        System.out.println("\n=== CHU NHAT 2 ===");
        System.out.println("Chu vi = " + cn2.chuVi());
        System.out.println("Dien tich = " + cn2.dienTich());


        // =========================
        // HINH TRON
        // =========================

        Diem O1 = new Diem(0, 0);

        HinhTron ht1 = new HinhTron(O1, 5);

        System.out.println("\n=== HINH TRON 1 ===");
        System.out.println("Chu vi = " + ht1.chuVi());
        System.out.println("Dien tich = " + ht1.dienTich());


        Diem O2 = new Diem(2, 3);

        HinhTron ht2 = new HinhTron(O2, 3);

        System.out.println("\n=== HINH TRON 2 ===");
        System.out.println("Chu vi = " + ht2.chuVi());
        System.out.println("Dien tich = " + ht2.dienTich());
    }
}
