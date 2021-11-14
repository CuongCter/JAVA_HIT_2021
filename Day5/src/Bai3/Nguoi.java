package Bai3;
import java.util.Scanner;
public class Nguoi {
    protected String hoTen,ngaySinh,queQuan;

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Que quan: ");
        queQuan = sc.nextLine();
    }
    public void Xuat() {
        System.out.printf("%20s %15s %20s", hoTen, ngaySinh, queQuan);
    }

    public Nguoi() {
    }

    public Nguoi(String hoTen, String ngaySinh, String queQuan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }
}
