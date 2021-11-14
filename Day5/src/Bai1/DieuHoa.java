package Bai1;
import java.util.Scanner;
public class DieuHoa extends SanPham{
    private int congSuat;
    private double giaBan;

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        System.out.print("Cong suat: ");
        congSuat = sc.nextInt();
        System.out.print("Gia ban: ");
        giaBan = sc.nextDouble();
    }
    public void Xuat() {
        super.Xuat();
        System.out.println("Cong suat: " + congSuat);
        System.out.println("Gia ban: " + giaBan);
    }

    public double getGiaBan() {

        return giaBan;
    }
}
