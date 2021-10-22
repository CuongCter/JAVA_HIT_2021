package Bai3;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String s = sc.nextLine();
        int count = 0, sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                count++;
                sum+=s.charAt(i)-48;
            }
        }
        if (count !=0 ){
            System.out.println("true");
            System.out.println("Trung binh cong: " + (float)sum/count );
        }else{
            System.out.println("false");
        }
    }


}