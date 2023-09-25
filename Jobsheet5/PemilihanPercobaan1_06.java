package Jobsheet5;

import java.util.Scanner;

public class PemilihanPercobaan1_06 {
    public static void main(String[] args) {
    Scanner input00 = new Scanner(System.in);

    System.out.print("Masukkan angka : ");
    int angka = input00.nextInt();

    String hasil;
    hasil = (angka %2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
    System.out.println(angka+ " adalah " +hasil);

    }
}
