package Bai2;

import java.util.Scanner;
import java.util.Arrays;

public class RunMain {
    //1.Nhap mang
    public static void Input(int[] a, int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap giá trị cho mảng  ");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]= ");
            a[i] = sc.nextInt();
        }
    }
    //2.Hien thi mang
    public static void Output(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println("");
    }
    //3.Chen
    public static int[] chen(int[] a, int n, int pos,int value) {
        int[] newArr = Arrays.copyOf(a,n+1);
        for(  int i = n; i >= pos -1 ; i--){
            newArr[i] = newArr[i-1];
        }
        newArr[pos-1]=value;
        return newArr;
    }
    //4.Xoa
    public static void xoaMang( int[] a, int n , int k){
        for( int i = k-1 ; i < n -1; i++  ){
            a[i] = a[i+1];
        }
        n--;
        Output(a,n);
    }
    //5.Dao nguoc mang
    public static void swap( int[] a, int n ){
        for ( int i = n-1 ; i >= 0 ; i--){
            System.out.print(a[i] + " ");
        }
    }
    //6.Hien thi phan tu a[1] va ca so chia het cho a[1]
    public static void show( int[] a, int n){
        System.out.println("Phần tử a[1] là: " + a[1]);
        System.out.println("Các số chia hết cho a[1] là: ");
        for( int i = 0 ; i < n ; i++) {
            if (a[i] % a[1]==0)
                System.out.println(" "+a[i]);
        }

    }
    //7.Kiem tra so nguyen to va tinh tong cac so nguyen to
    public static boolean isPrime(int a){
        for(int i=2;i*i<=a; i++){
            if (a % i == 0) {
                return false;
            }
        }
        return a > 1;
    }

    public static int sum(int[] a, int n){
        int s = 0;
        for( int i = 0 ; i < n ;i++){
            if(isPrime(a[i]) != false ) {
                s += a[i];
            }
        }
        return s;
    }
    //8.Thoat
    public static void exit() {
        System.exit(0);
    }
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử cho mảng : ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("---Danh sách các lệnh thực thi--- ");
        System.out.println("1. Tạo và nhập mảng với n só nguyên.");
        System.out.println("2. Hiển thị mảng vừa tạo.");
        System.out.println("3. Thêm một phần tử vào vị trí bất kỳ.");
        System.out.println("4. Xóa một phần tử tại vị trí bất kỳ.");
        System.out.println("5. Đảo ngược mảng.");
        System.out.println("6. Hiển thị phần tử a[1] và các số chia hết cho a[1].");
        System.out.println("7. Xuất ra màn hình tổng các số nguyên tố có trong mảng.");
        System.out.println("8. Thoát.");
        while(true){
            System.out.println("Nhap lua chon 1->8: ");
            int number= sc.nextInt();
            switch (number){
                case 1 :
                    Input(a,n);
                    break;
                case 2:
                    Output(a,n);
                    break;
                case 3:
                    System.out.println("Nhap vi tri muon them: ");
                    int pos = sc.nextInt();
                    System.out.println("Nhap so muon them: ");
                    int value = sc.nextInt();
                    a = chen(a,n,pos,value);
                    System.out.println(Arrays.toString(a));
                    break;
                case 4:
                    System.out.println("Nhap vi tri xoa: ");
                    int k = sc.nextInt();
                    xoaMang(a,n,k);
                    break;
                case 5:
                    System.out.println("Mang sau khi dao nguoc: ");
                    swap(a,n);
                    break;
                case 6:
                    show(a,n);
                    break;
                case 7:
                    System.out.println("Tong cac so nguyen to co trong mang: ");
                    System.out.println(sum(a,n));
                    break;
                case 8:
                    exit();
                default:
                    System.out.println("Khong ton tai lua chon ! ");
            }
        }
    }
}
