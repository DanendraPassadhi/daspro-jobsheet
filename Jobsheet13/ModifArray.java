package Jobsheet13;

import java.util.Scanner; 

public class ModifArray {

    static Scanner input = new Scanner(System.in);
    
    static int[][] nilai;
    static String[] nama;

    static int jmlMhs;
    static int jmlTugas;
    
    static void inputNilaiMhs() {
        for(int i=0; i<nama.length; i++) {
            System.out.println("Masukkan nilai " + nama[i]);
            for(int j=0; j<7; j++) {
                System.out.print("Nilai minggu ke-" + (j+1) + ": ");
                nilai[i][j] = input.nextInt(); 
            }
        }
    }

    static void editArray() {
        System.out.print("Masukkan jumlah Mahasiswa : ");
        jmlMhs = input.nextInt();
        System.out.print("Masukkan jumlah Tugas : ");
        jmlTugas = input.nextInt();

        nama = new String[jmlMhs];
        nilai = new int[jmlMhs][jmlTugas];
    }

    static void inputNilaiTugas() {
        for (int i = 0; i < nama.length; i++) {
            System.out.print("Nama mahasiswa ke-" + (i+1) + " : ");
            nama[i] = input.next();

            for (int j = 0; j < jmlTugas; j++) {
                System.out.print("Nilai tugas ke-" + (j+1) + " : ");
                nilai[i][j] = input.nextInt();
            }
        }
    }
    
    static void tampilNilaiMhs() {
        System.out.println("Nilai Seluruh Mahasiswa");
        System.out.print("|      |");
        for(int i=1; i<=7; i++) {
            System.out.print(" 0" + i +" |"); 
        }
        System.out.println();
        
        for(int i=0; i<5; i++) {
            System.out.print("| " + nama[i] + " |");
            for(int j=0; j<7; j++) {
               System.out.print(" " + nilai[i][j] + " |");
            }
            System.out.println(); 
        }
    }
    
    static void nilaiTertinggi() {
        int max = 0;
        int minggu = 0;
        
        for(int j=0; j<7; j++) {
            int total = 0;
            for(int i=0; i<5; i++) {
                total += nilai[i][j];
            }
            if(total > max) {
                max = total;
                minggu = j+1; 
            }
        }
        
        System.out.println("Nilai tertinggi terdapat pada minggu ke-" + minggu);
    }
    
    static void tampilTertinggi() {
        int max = 0;
        int n = 0;
        for(int i=0; i<5; i++) {
           int total = 0;
           for(int j=0; j<7; j++) {
               total += nilai[i][j];
           }
           
           if(total > max) {
               max = total;
               n = i;
           }
        }
        
        System.out.println("Mahasiswa dengan nilai tertinggi adalah " + nama[n]); 
        System.out.println("Dengan total nilai = " + max);
    }
    
    public static void main(String[] args) {
        editArray();
        inputNilaiTugas();
        inputNilaiMhs();
        tampilNilaiMhs(); 
        nilaiTertinggi();
        tampilTertinggi();
    } 
}