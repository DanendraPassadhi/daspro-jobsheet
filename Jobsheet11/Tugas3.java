package Jobsheet11;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limit = 0;

        System.out.print("Input: ");
        limit = input.nextInt();

        for (int i = 1; i <= limit; i++) {
            if (i > 1 && i < limit) {
                for (int j = 1; j <= limit; j++) {
                    if (j == 1 || j == limit) {
                        System.out.print(limit+" ");
                    } else {
                        if (limit > 9) {
                            System.out.print("   ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                }
            } else {
                for (int j = 1; j <= limit; j++) {
                    System.out.print(limit+" ");
                }
            }
            System.out.println();
        }
    }
}