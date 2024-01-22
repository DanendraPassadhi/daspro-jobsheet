package Jobsheet14;

import java.util.Scanner;

public class CekPrimaRekursif {
    static int cekPrima(int n, int pembagi) {
        if(pembagi == 1) {
            return 1; 
        } else if(n % pembagi == 0) {
            return 0;
        } else {
            return cekPrima(n, pembagi-1); 
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan: "); 
        int n = input.nextInt();
        
        for(int i = 2; i < n; i++) {
            if(cekPrima(n, i) == 0) {
                System.out.println(n + " bukan bilangan prima");
                return;  
            }
        }
        System.out.println(n + " adalah bilangan prima");
    }
}
