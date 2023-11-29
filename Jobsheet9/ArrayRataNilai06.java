package Jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai06 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Masukkan jumlah mahasiswa : ");
    int jmlMhs = sc.nextInt();

    int[] nilaiMhs = new int[jmlMhs];
    double totalLulus = 0;
    double totalTdkLulus = 0;
    double jmlLulus = 0;
    double jmlTdkLulus = 0;
    double rataLulus;
    double rataTdkLulus;
   
    for (int i = 0; i < nilaiMhs.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+ " : ");
        nilaiMhs[i] = sc.nextInt();

        if (nilaiMhs[i] > 70) {
            totalLulus += nilaiMhs[i];
            jmlLulus++;
        } else {
            totalTdkLulus += nilaiMhs[i];
            jmlTdkLulus++;
        }
    }
    rataLulus = totalLulus/jmlLulus;
    rataTdkLulus = totalTdkLulus/jmlTdkLulus;

    System.out.println("Rata-rata nilai lulus = " +rataLulus);
    System.out.println("Rata-rata nilai tidak lulus = " +rataTdkLulus);
    }
}