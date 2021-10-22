package Bai1;
import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.print("Nhap a = ");
        a = scan.nextInt();
        System.out.print("Nhap b = ");
        b = scan.nextInt();
        System.out.print("Nhap c = ");
        c = scan.nextInt();
        System.out.println("Max = " + MAX(a,b,c));
    }
    public static int MAX(int a,int b,int c) {
        int max = Math.max(Math.max(a, b),c);
        return max;
    }
}
