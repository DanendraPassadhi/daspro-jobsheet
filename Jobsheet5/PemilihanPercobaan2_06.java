package Jobsheet5;

import java.util.Scanner;

public class PemilihanPercobaan2_06 {
    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);

        System.out.print("Nilai uas     : ");
        float uas = input00.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input00.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = input00.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = input00.nextFloat();

        float total = (uas * 0.4f) + (uts * 0.3f) + (kuis * 0.1f) + (tugas * 0.2f);
        String nilai;
        if (total>80 && total<=100 ) {
            nilai = "A";
          } else if (total> 73 && total<= 80) {
            nilai = "B+";
            } else if (total> 65 && total<= 73) {
            nilai = "B";
            } else if (total> 60 && total<= 65) {
            nilai = "C+";
            } else if (total> 50 && total<= 60) {
            nilai = "C";
            } else if (total> 39 && total<= 50) {
            nilai = "D";
            } else {
            nilai = "E";
          }
      
        
        System.out.println("Nilai akhir = " + total + " sehingga nilai anda " + nilai);
    }
}
