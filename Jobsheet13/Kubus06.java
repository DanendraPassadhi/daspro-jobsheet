package Jobsheet13;

import java.util.Scanner;

public class Kubus06 {   
    static int sisi;

    static int  hitungVolume () {
        int volume = sisi * sisi * sisi;
        return volume; 
    }
    static int  hitungLuas () {
        int luas = sisi * sisi * 6;
        return luas;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi : ");
        sisi = input.nextInt();

        System.out.println("Volume kubus adalah "+ hitungVolume());
        System.out.println("Luas permukaan kubus adalah "+ hitungLuas());
    }
}
