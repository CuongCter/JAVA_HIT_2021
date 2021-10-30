package Bai3;

import java.util.Random;

public class RunMain {
    public static void main(String[] args) {
        Random rd = new Random();
        Guns DiepBeDe = new Guns("AK47", 100);
        Guns DoanXinhGai = new Guns("K98", 100);

        while(true) {
            int Diep = DiepBeDe.Shoot(rd.nextInt(10) + 1);
            int Doan = DoanXinhGai.Shoot(rd.nextInt(10) + 1);
            if(Diep == 0 && Doan == 0) {
                System.out.println(" Tiep tuc nap dan.");
                DiepBeDe.Load(rd.nextInt(10) + 1);
                DoanXinhGai.Load(rd.nextInt(10) + 1);
            }
            else if(Doan == 0) {
                System.out.println("Anh Diep win.");
                break;
            }
            else if(Diep == 0) {
                System.out.println("Anh Doan win.");
                break;
            }
        }
    }
}
