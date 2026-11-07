import java.util.Scanner;

/** Soru 8: Basit Hesap Makinesi */
public class Soru08_HesapMakinesi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.println("sayi girin");
     int sayi1 = sc.nextInt();
    System.out.println("bir sayi daha girin");
     int sayi2 = sc.nextInt();
     System.out.println("islem girin");
     String islem = sc.next();
     
      if (islem.equals("+")){System.out.println(sayi1+sayi2);
     }  else if (islem.equals("x")) {System.out.println(sayi1*sayi2);
     } else if (islem.equals("/")) {System.out.println(sayi1/sayi2);
     } else if (islem.equals("-")) {System.out.println(sayi1-sayi2);
     } else {System.out.println("gecersiz islem girisi");
    
     
     scanner.close();
     
    
}
}
}

        // TODO: Girdileri alın

        // TODO: Girdileri kontrol edin (geçersiz giriş / sınır durumları)

        // TODO: Karar yapısını yazın

        // TODO: Sonucu ekrana yazdırın

        
    

