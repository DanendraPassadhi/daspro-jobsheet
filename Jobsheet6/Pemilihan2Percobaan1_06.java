package Jobsheet6;

import java.util.Scanner;

public class Pemilihan2Percobaan1_06 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);

        int tahun;

        System.out.print("Masukkan tahun : " );
        tahun = input06.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) ==0) {
                if ((tahun % 400) ==0) {
                    System.out.println("Tahun kabisat");
                } else {
                    System.out.println("Bukan tahun kabisat");
                }
             } else {
            System.out.println("Bukan tahun kabisat");
             }
        } else {
            System.out.println("Bukan tahun kabisat");
        }
    }    
}
