import java.util.Scanner;

/** Soru 3: İki Sayının Büyüğü */
public class Soru03_IkiSayininBuyugu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     System.out.println("sayi girin");
     int sayi1 = sc.nextInt();
     System.out.println("bir sayi daha girin");
     int sayi2 = sc.nextInt();
     if (sayi1>sayi2) {System.out.println("ilk girdiginiz sayi ikincisinden daha buyuktur");
     } else if (sayi1==sayi2) {System.out.println("girdiginiz iki sayi esittir.");
     } else  if (sayi1<sayi2) {System.out.println("ikinci girdiginiz sayi ilk girdiginizden buyuktur");
     
        scanner.close();
    
}
}
}
        // TODO: Girdileri alın

        // TODO: Girdileri kontrol edin (geçersiz giriş / sınır durumları)

        // TODO: Karar yapısını yazın

        // TODO: Sonucu ekrana yazdırın

     
    

