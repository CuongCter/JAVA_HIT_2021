package Bai2;

import java.util.Scanner;

public class DateTime {
    private int ngay;
    private int thang;
    private int nam;

    Scanner sc = new Scanner(System.in);

    public void InputDate() {
        System.out.print("Nhap ngay: ");
        ngay = sc.nextInt();
        System.out.print("Nhap thang: ");
        thang = sc.nextInt();
        System.out.print("Nhap nam: ");
        nam = sc.nextInt();
    }

    public void OutputDate() {
        System.out.println("Date: ");
        System.out.println(ngay + "/" + thang + "/" + nam);
    }
}
