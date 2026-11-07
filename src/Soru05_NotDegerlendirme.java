import java.util.Scanner;

/** Soru 5: Not Değerlendirme */
public class Soru05_NotDegerlendirme {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 System.out.println("notunuzu girin");
     int not = sc.nextInt();
     if (not>100 && not<0) {System.out.println("gecersiz not girdiniz");
     } else if (not<=100 && 90<=not) {System.out.println("notunuz AA`dıi");
     } else if (not>=80 && not<90) {System.out.println("notunuz BA`dir");
     } else if (not<80 && not>=70) {System.out.println("notunuz BB`dir");
     } else if (not<70 && not>=60) {System.out.println("notunuz CBdir");
     } else if (not<60 && not>=50) {System.out.println("notunuz CCdir");
     } else if (not<50) {System.out.println("notunuz FFdir");
    
     
      scanner.close();
     
    
}
}
}

        // TODO: Girdileri alın

        // TODO: Girdileri kontrol edin (geçersiz giriş / sınır durumları)

        // TODO: Karar yapısını yazın

        // TODO: Sonucu ekrana yazdırın

       
    
