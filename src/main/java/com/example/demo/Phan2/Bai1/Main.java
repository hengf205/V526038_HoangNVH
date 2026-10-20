package com.example.demo.Phan2.Bai1;

public class Main {

    public static void main(String[] args) {

        Diem A = new Diem(0, 0);

        Diem B = new Diem(3, 4);

        DuongThang AB = new DuongThang(A, B);

        System.out.println("Do dai AB = " + AB.doDai());
    }
}
