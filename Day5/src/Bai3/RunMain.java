package Bai3;

public class RunMain {
    public static void main(String[] args) {
        LopHoc a = new LopHoc();
        a.Nhap();
        a.Xuat();
        System.out.println("So sinh vien khoa 15: " + a.K15());
        a.sx();
        System.out.println("Lop hoc sau khi sap xep.");
        a.Xuat();
    }
}
