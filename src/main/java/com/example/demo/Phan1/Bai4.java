package com.example.demo.Phan1;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tong = 0;

        int n = 1;

        while (tong <= 50) {
            System.out.print("Nhap so nguyen thu "+n+++":");
            int x = sc.nextInt();

            tong += x;
        }

        System.out.println("Tong cac so da nhap = " + tong);
        System.out.println("Tong da lon hon 50!");
    }
}
