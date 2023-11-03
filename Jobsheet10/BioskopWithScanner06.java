package Jobsheet10;

import java.util.Scanner;

public class BioskopWithScanner06{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int baris, kolom, pilihan;
    String nama, next;
    
    String[][] penonton = new String[4][2];

    while (true) {
        System.out.println("-------Menu-------");
        System.out.println("1. Input data penonton");
        System.out.println("2. Daftar Penonton");
        System.out.println("3. Exit");
        System.out.print("Pilih inputan : ");
        pilihan = sc.nextInt();
        sc.nextLine();

        switch (pilihan) {
            case 1:
            System.out.print("Masukkan nama : ");
            nama = sc.nextLine();
            System.out.print("Masukkan baris : ");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom : ");
            kolom = sc.nextInt();
            sc.nextLine();

            if (baris > penonton.length || kolom > penonton.length) {
                System.out.println("Nomor baris/kolom tidak tersedia");
            }
            if (penonton[baris-1][kolom-1] != null) {
                System.out.println("Kursi yang dipilih telah terisi, silahkan masukkan kembali kolom dan baris");
                continue;
            } else
                penonton[baris-1][kolom-1] = nama;
            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();
            if (next.equalsIgnoreCase("n")) {
                break;
                }
                break;
            
            case 2:
            System.out.println("-------Daftar Penonton-------");
            for (int i = 0; i < penonton.length; i++) {
                for (int j = 0; j < penonton[0].length; j++) {
                    if (penonton[i][j] == null) {
                        penonton[i][j] = "***";
                    }
                }
                System.out.println("Penonton pada baris ke-" +(i+1)+ " : " +String.join(", ", penonton[i]));
            }
                break;

            case 3:
            System.exit(0);
                break;
                
            default:
                break;
        }
    }
    }
}