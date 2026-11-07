import java.util.Scanner;

/** Soru 1: Tek mi, Çift mi? */
public class Soru01_TekMiCift {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Girdileri alın
            System.out.println("sayi giriniz");
        int sayi1 = sc.nextInt();
        // TODO: Girdileri kontrol edin (geçersiz giriş / sınır durumları)
       if (sayi1%2==0) {
           System.out.println("girdiginiz sayi cifttir");
       }
       else System.out.println("girdiginiz sayi tek");
    }
}

        scanner.close();
    

