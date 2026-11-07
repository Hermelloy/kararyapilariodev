import java.util.Scanner;

/** Soru 4: Üç Sayının En Büyüğü */
public class Soru04_UcSayininEnBuyugu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  System.out.println("sayi girin");
     int sayi1 = sc.nextInt();
     System.out.println("bir sayi daha girin");
     int sayi2 = sc.nextInt();
     System.out.println("bir sayi daha girin");
     int sayi3 = sc.nextInt();
     if (sayi1<=sayi2 && sayi3<sayi2) {System.out.println(sayi2 + " en buyuktur");
     } else if (sayi1<=sayi2 && sayi2<sayi3) {System.out.println(sayi3 + " en buyuktur");
     } else if (sayi2<=sayi1 && sayi3<sayi1) {System.out.println(sayi1 + " en buyuktur");
     } else if (sayi2<=sayi1 && sayi1<sayi3) {System.out.println(sayi3 + " en buyuktur");
     } else if (sayi3<=sayi2 && sayi1<sayi2) {System.out.println(sayi2 + " en buyuktur");
     } else if (sayi3<=sayi2 && sayi1>sayi2) {System.out.println(sayi1 + " en buyuktur");
      } else if (sayi3==sayi2 && sayi1==sayi2) {System.out.println("uc sayida esittir");
     
      scanner.close();
     
    
}
}
}
        // TODO: Girdileri alın

        // TODO: Girdileri kontrol edin (geçersiz giriş / sınır durumları)

        // TODO: Karar yapısını yazın

        // TODO: Sonucu ekrana yazdırın

       
    
