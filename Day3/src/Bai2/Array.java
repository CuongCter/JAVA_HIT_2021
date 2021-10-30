package Bai2;

import java.util.Scanner;

public class Array {
    private int n;
    private int[] a;
    static Scanner sc = new Scanner(System.in);

    public Array(){
        n=0;
        a=null;
    }
    public Array(int[] a,int n){
        this.n = n;
        for(int i=0;i<n;i++)
            this.a[i]=a[i];
    }
    public void InputData(){
        System.out.println("Nhap so luong phan tu: ");
        n= sc.nextInt();
        a= new int[n];
        for(int i=0;i<n;i++){
            System.out.println("a["+i+"]");
            a[i]=sc.nextInt();
        }
    }
    public void Show(){
        for(int i=0;i<n;i++)
            System.out.println(a[i]+" ");
    }
    public int Sum(){
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=a[i];
        return sum;
    }
    public void Filter(boolean flag){
        if(flag){
            System.out.println("Cac so chan: ");
            for(int i=0;i<n;i++){
                if (a[i]%2==0)
                    System.out.println(a[i] + " ");
            }
        }
        else {
            System.out.println("Cac so le: ");
            for(int i=0;i<n;i++){
                if(a[i] % 2 != 0){
                    System.out.println(a[i]+ " ");
                }
            }
        }
    }
    public Array(int n, int[] a){
        this.n=n;
        this.a=a;
    }
    public void setA(int[] a){
        this.a=a;
    }

    public int[] getA() {
        return a;
    }

    public void getN(int n){
        this.n=n;
    }

    public int getN() {
        return n;
    }
}
