package Bai2;
import java.util.Scanner;
public class SanPham {
    private String maSP,tenSP;
    private int sl;
    private double donGia;

    public void InputSP() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma san pham: ");
        maSP = sc.nextLine();
        System.out.print("Ten san pham: ");
        tenSP = sc.nextLine();
        System.out.print("So luong: ");
        sl = sc.nextInt();
        System.out.print("Don gia: ");
        donGia = sc.nextDouble();
    }
    public void OutputSP() {
        System.out.printf("%15s %25s %15s %15s %15s", maSP, tenSP, sl, donGia, sl*donGia);
    }
}
