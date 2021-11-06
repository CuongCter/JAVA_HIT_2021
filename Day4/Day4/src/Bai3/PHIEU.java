package Bai3;
import java.util.Scanner;
public class PHIEU {
    private String maPhieu;
    private HANG x[];
    private int n;
    Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.println("Nhap ma phieu: ");
        maPhieu = sc.nextLine();
        System.out.println("Nhap so luong hang: ");
        n=sc.nextInt();
        x = new HANG[n];
        for(int i=0;i<n;i++){
            x[i]= new HANG();
            System.out.println("Nhap hang thu: "+ (i+1));
            x[i].input();
        }
    }
    public void output(){
        System.out.println("Ma phieu: "+ maPhieu);
        for(int i=0;i<n;i++){
            x[i].output();
        }
        double sum=0;
        for(int i=0;i<n;i++){
            sum+=x[i].getDongGia();
        }
        System.out.println("Tong tien: "+sum);
    }
}
