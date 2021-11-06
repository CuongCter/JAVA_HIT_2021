package Bai1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sach: ");
        int n = sc.nextInt();
        SACH[] sach = new SACH[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Quyen thu: " + (i+1));
            sach[i] = new SACH();
            sach[i].NHAP();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin quyen: " + (i+1));
            sach[i].XUAT();
        }
    }
}
