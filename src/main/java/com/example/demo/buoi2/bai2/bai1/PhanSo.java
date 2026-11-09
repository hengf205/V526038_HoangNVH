package com.example.demo.buoi2.bai2.bai1;

public class PhanSo {

    private int tu;
    private int mau;

    // Constructor mặc định
    public PhanSo() {
        this.tu = 0;
        this.mau = 1;
    }

    // Constructor có đối số
    public PhanSo(int tu, int mau) {

        if (mau == 0) {
            throw new IllegalArgumentException("Mau so khong duoc bang 0!");
        }

        this.tu = tu;
        this.mau = mau;

        // Nếu mẫu âm thì chuyển dấu lên tử
        if (this.mau < 0) {
            this.tu = -this.tu;
            this.mau = -this.mau;
        }
    }

    // Getter tử
    public int getTu() {
        return tu;
    }

    // Setter tử
    public void setTu(int tu) {
        this.tu = tu;
    }

    // Getter mẫu
    public int getMau() {
        return mau;
    }

    // Setter mẫu
    public void setMau(int mau) {

        if (mau == 0) {
            throw new IllegalArgumentException("Mau so khong duoc bang 0!");
        }

        this.mau = mau;

        if (this.mau < 0) {
            this.tu = -this.tu;
            this.mau = -this.mau;
        }
    }

    // Tìm UCLN
    private int ucln(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }

    // Rút gọn phân số
    public void rutGon() {

        int ucln = ucln(tu, mau);

        tu = tu / ucln;
        mau = mau / ucln;
    }

    // Cộng 2 phân số
    public PhanSo cong(PhanSo ps) {

        int tuMoi = this.tu * ps.mau
                + ps.tu * this.mau;

        int mauMoi = this.mau * ps.mau;

        PhanSo ketQua = new PhanSo(tuMoi, mauMoi);

        ketQua.rutGon();

        return ketQua;
    }

    // Trừ 2 phân số
    public PhanSo tru(PhanSo ps) {

        int tuMoi = this.tu * ps.mau
                - ps.tu * this.mau;

        int mauMoi = this.mau * ps.mau;

        PhanSo ketQua = new PhanSo(tuMoi, mauMoi);

        ketQua.rutGon();

        return ketQua;
    }

    // Nhân 2 phân số
    public PhanSo nhan(PhanSo ps) {

        int tuMoi = this.tu * ps.tu;
        int mauMoi = this.mau * ps.mau;

        PhanSo ketQua = new PhanSo(tuMoi, mauMoi);

        ketQua.rutGon();

        return ketQua;
    }

    // Chia 2 phân số
    public PhanSo chia(PhanSo ps) {

        if (ps.tu == 0) {
            throw new ArithmeticException("Khong the chia cho 0!");
        }

        int tuMoi = this.tu * ps.mau;
        int mauMoi = this.mau * ps.tu;

        PhanSo ketQua = new PhanSo(tuMoi, mauMoi);

        ketQua.rutGon();

        return ketQua;
    }

    // So sánh 2 phân số
    // > 0: this lớn hơn ps
    // = 0: bằng nhau
    // < 0: this nhỏ hơn ps
    public int soSanh(PhanSo ps) {

        return Integer.compare(
                this.tu * ps.mau,
                ps.tu * this.mau
        );
    }

    // Kiểm tra có phải số nguyên không
    public boolean laSoNguyen() {
        return tu % mau == 0;
    }

    // Hiển thị phân số
    @Override
    public String toString() {

        if (mau == 1) {
            return String.valueOf(tu);
        }

        if (tu == 0) {
            return "0";
        }

        return tu + "/" + mau;
    }
}
