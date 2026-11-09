package com.example.demo.bai3.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // =================================
        // 1. Nhập danh sách nhân viên
        // =================================

        System.out.print("Nhap so luong nhan vien: ");
        int n = Integer.parseInt(sc.nextLine());

        ArrayList<NhanVien> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            System.out.println("\nNhap nhan vien thu " + (i + 1));

            NhanVien nv = new NhanVien();

            nv.nhap(sc);

            ds.add(nv);
        }

        // =================================
        // 2. Xuất danh sách nhân viên
        // =================================

        System.out.println("\n===== DANH SACH NHAN VIEN =====");

        for (NhanVien nv : ds) {

            System.out.println("--------------------");

            nv.xuat();
        }

        // =================================
        // 3. Tìm nhân viên công tác lâu nhất
        // =================================

        System.out.println("\n===== NHAN VIEN CONG TAC LAU NHAT =====");

        if (ds.isEmpty()) {
            System.out.println("Danh sach nhan vien rong!");
        } else {

            int max = ds.get(0).getSnct();

            for (NhanVien nv : ds) {

                if (nv.getSnct() > max) {
                    max = nv.getSnct();
                }
            }

            // In tất cả nhân viên có số năm công tác lớn nhất
            for (NhanVien nv : ds) {

                if (nv.getSnct() == max) {

                    nv.xuat();

                    System.out.println("--------------------");
                }
            }
        }

        // =================================
        // 4. Sắp xếp lương từ cao xuống thấp
        // =================================

        for (int i = 0; i < ds.size() - 1; i++) {

            for (int j = i + 1; j < ds.size(); j++) {

                if (ds.get(i).tinhTienLuong()
                        < ds.get(j).tinhTienLuong()) {

                    NhanVien temp = ds.get(i);

                    ds.set(i, ds.get(j));

                    ds.set(j, temp);
                }
            }
        }

        // =================================
        // 5. In danh sách sau khi sắp xếp
        // =================================

        System.out.println("\n===== DANH SACH LUONG GIAM DAN =====");

        for (NhanVien nv : ds) {

            System.out.println("--------------------");

            nv.xuat();
        }

        sc.close();
    }
}
