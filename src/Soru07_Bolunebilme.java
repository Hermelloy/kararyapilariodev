import java.util.Scanner;

/** Soru 7: Bölünebilme Kontrolü */
public class Soru07_Bolunebilme {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("sayi girin");
     int sayi = sc.nextInt();
     if (sayi%3==0 && sayi%5==0) {System.out.println("sayi hem 3e hem 5e bolunebilir");
     }  else if (sayi%3!=0 && sayi%5!=0){System.out.println("sayi 3e de 5 e de bolunemez");
     }  else if (sayi%3==0 && sayi%5!=0) {System.out.println("sayi 3e bolunebilir");
     } else if (sayi%3!=0 && sayi%5==0) {System.out.println("sayi 5e bolunebilir");

    
      scanner.close();
     
     
    
}
}
}
        // TODO: Girdileri alın

        // TODO: Girdileri kontrol edin (geçersiz giriş / sınır durumları)

        // TODO: Karar yapısını yazın

        // TODO: Sonucu ekrana yazdırın

       
    

