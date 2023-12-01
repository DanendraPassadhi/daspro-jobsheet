package Jobsheet14;

public class Fibonacci {
    static int fibonacci(int n) {
        if(n <= 2) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci (n-2);
        }
    }
    
    public static void main(String[] args) {
    
        int bulan = 12;
        
        int jmlPasangan = fibonacci(bulan);
        
        System.out.println("Total pasangan marmut pada akhir bulan ke-" + bulan + " adalah " + jmlPasangan); 
    }
}
