package Bai2;

public class RunMain {
    public static void main(String[] args) {
        Array a1 = new Array();
        Array a2 = new Array();
        System.out.println("Nhap mang a1: ");
        a1.InputData();
        System.out.println("Nhap mang a2: ");
        a2.InputData();
        double TBCa1 = a1.Sum() / a1.getN();
        double TBCa2 = a2.Sum() / a2.getN();
        if(TBCa1>TBCa2){
            System.out.println("TBCa1 > TBCa2");
        }
        else if(TBCa1<TBCa2){
            System.out.println("TBCa1 < TBCa2");
        }
        else{
            System.out.println("Bye");
        }
    }

}
