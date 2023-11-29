package Jobsheet14;

import java.util.Scanner;

public class Percobaan2 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            int result = x;
            System.out.print(x);
            
            for(int i = 1; i < y; i++) {
                result *= x;
                System.out.print("x" + x); 
            }
            
            System.out.print(" = ");
            return result;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bilangan, pangkat; 

        System.out.print("Bilangan yang dihitung: ");
        bilangan = input.nextInt();
        System.out.print("Pangkat: ");
        pangkat = input.nextInt();

        System.out.println(hitungPangkat(bilangan, pangkat));

    }
}