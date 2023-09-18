import java.util.Scanner;

public class HargaBayar06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int harga, jumlah, jmlHalBuku;
        double dis=0.1, total, bayar, jmlDis;
        String merkBuku;
        
        System.out.println("Masukkan merk buku yang dibeli ");
        merkBuku = input.nextLine();
        System.out.println("Masukkan jumlah halaman buku yang dibeli ");
        jmlHalBuku = input.nextInt();
        System.out.println("Masukkan Harga Barang yang Dibeli ");
        harga = input.nextInt();
        System.out.println("Masukkan Jumlah Barang yang DIbeli ");
        jumlah = input.nextInt();

        total=harga*jumlah;

        System.out.println("Masukkan jumlah diskon ");
        dis = input.nextInt();
        
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
        System.out.println("Merk buku yang dibeli adalah " +merkBuku);
        System.out.println("JUmlah halaman buku yang dibeli adalah " +jmlHalBuku );
    }
}
