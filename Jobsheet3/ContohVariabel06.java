    public class ContohVariabel06 {
        public static void main(String args[]) {
            String salahSatuHobySayaAdalah = "Bermain petak umpet";
            boolean apakahSayaPandai = true;
            char jenisKelamin ='L';
            byte umurSayaSekarang = 20;
            double ipkSaya = 3.24, tinggiBadan = 1.78;

            System.out.println("Salah satu hoby saya : " + salahSatuHobySayaAdalah );
            System.out.println("Apakah saya pandai?  : " + apakahSayaPandai );
            System.out.println("Jenis kelamin        : " + jenisKelamin );
            System.out.println("Umur saya sekarang   : " + umurSayaSekarang );
            System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipkSaya, tinggiBadan));
        }
    }