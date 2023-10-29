package Jobsheet9;

import java.util.Scanner;

public class Tugas06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyak elemen : ");
        int elemen = sc.nextInt();

        int[] nilai = new int[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai elemen ke-" +(i+1)+ " : ");
            nilai[i] = sc.nextInt();
        }

        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];
        int total = nilai[0];

        for (int i = 1; i < elemen; i++) {
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
            total += nilai[i];
        }

        double rataRata = (double) total / elemen;

        System.out.println("Nilai tertinggi : " +nilaiTertinggi);
        System.out.println("Nilai terendah : " +nilaiTerendah);
        System.out.println("Rata Rata : " +rataRata);
    }
}
