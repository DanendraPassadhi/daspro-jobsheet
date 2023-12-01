package Jobsheet14;

import java.util.Scanner;

public class DeretDescendingRekursif {
    static void deretRekursif(int n) {
        if (n == -1) {
            return;
        } else {
            System.out.print(n + " ");
            deretRekursif(n-1);            
        }
    }
    static void deretIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n : ");
        int n = input.nextInt();
        
        System.out.print("Deret Rekursif berupa : ");
        deretRekursif(n);
        System.out.println();
        System.out.print("Deret Iteratif berupa : ");
        deretIteratif(n);
    }
}
