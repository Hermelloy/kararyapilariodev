import java.util.Scanner;

/** Soru 9: Üçgen Türü Belirleme */
public class Soru09_UcgenTuru {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.println("ilk kenari girin");
     int sayi1 = sc.nextInt();
    System.out.println("ikinci kenari girin");
     int sayi2 = sc.nextInt();
     System.out.println("ucuncu kenari girin");
     int sayi3 = sc.nextInt();
     
      if (sayi1==sayi2 && sayi2==sayi3){System.out.println("esitkenar ucgen");
     }  else if (sayi1!=sayi2 && sayi2==sayi3) {System.out.println("ikizkenar ucgen");
     } else if (sayi1!=sayi2 && sayi2!=sayi3 && sayi1!=sayi3) {
         System.out.println("cesitkenar ucgen");
     } else {System.out.println("gecersiz islem girisi");
    
     
     
     
        scanner.close();
    
}
}
}
        // TODO: Girdileri alın

        // TODO: Girdileri kontrol edin (geçersiz giriş / sınır durumları)

        // TODO: Karar yapısını yazın

        // TODO: Sonucu ekrana yazdırın

    

