package Jobsheet13;

public class Terimakasih_06 { 
    public static void UcapanTerimaKasih() {
        System.out.println("Thank you for being the best teacher in the world.\n" + 
        "You inspired in me a love for learning and made me feel like I could ask you anyting.");
    }
    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
        String ucapan = "Terima kasih Pak... Bu... Semoga Sehat Selalu";
        UcapanTambahan(ucapan);
    }
}