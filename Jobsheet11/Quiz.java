package Jobsheet11;

import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
                
        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do{
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number);
                if (success == false) {
                    if (number > answer) {
                        System.out.println("hint : angka lebih besar");
                    } else  
                    System.out.println("hint : angka lebih kecil");
                }
            } while(!success);
            System.out.print("Apakah Anda ingin mengulang permainan (Y/N)? ");
            menu = input.nextLine().charAt(0);

            if (menu == 'n' || menu == 'N') {
                break;
            }
        } while(menu == 'y' || menu == 'Y');
    }
}