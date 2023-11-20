package Jobsheet13;

import java.util.Scanner;

class Ucapan_06 {
    public static String PenerimaUCapan() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan : ");
        String namaOrang =sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void main(String[] args) {
        String nama = PenerimaUCapan();
        System.out.println("Thankyou " +nama+ "\nMay the force be with you.");
    }
}