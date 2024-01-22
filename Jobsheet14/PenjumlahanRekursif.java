package Jobsheet14;

public class PenjumlahanRekursif {
    static int penjumlahan(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + penjumlahan(n-1);
        }
    }
    public static void main(String[] args) {
        int f = 8;

        for (int i = 1; i <= f; i++) {
            System.out.print(i);
            if (i < f) {
                System.out.print("+");
            }
        }

        int hasil = penjumlahan(f);
        System.out.print(" = "+hasil);
    }
}
