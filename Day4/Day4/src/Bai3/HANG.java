package Bai3;
import java.util.Scanner;
public class HANG {
    private String maHang;
    private String tenHang;
    private double dongGia;

    Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.println("Nhap ma hang: ");
        maHang = sc.nextLine();
        System.out.println("Nhap ten hang: ");
        tenHang = sc.nextLine();
        System.out.println("Nhap don gia: ");
        dongGia = sc.nextDouble();
    }
    public void output(){
        System.out.println("Ma hang: " + maHang);
        System.out.println("Ten hang: " + tenHang);
        System.out.println("Gia tien: " + dongGia);
    }
    public double getDongGia(){
        return dongGia;
    }
}
