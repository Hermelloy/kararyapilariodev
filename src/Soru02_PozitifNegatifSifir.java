import java.util.Scanner;

/** Soru 2: Pozitif, Negatif veya Sıfır */
public class Soru02_PozitifNegatifSifir {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
     System.out.println("sayi giriniz");
     int sayi1 = sc.nextInt();
     if (sayi1>0) {System.out.println("sayi pozitiftir");
     }
     else if (sayi1==0) {System.out.println("sayi notrdur");
     }
     else if (sayi1<0) {System.out.println("sayi negatiftir.");
     

        scanner.close();
    }
}
}    
