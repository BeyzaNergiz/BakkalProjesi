package SampleQuestions_Cozumleri;

import java.util.Scanner;

public class C07 {
    public static void main(String[] args) {
        // Soru 7-)  Kullanicidan Double türünde bir sayi alin. Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
        //(Istege bagli) Float degerinde bir sayi alin bu sayiyi da short degisken türünde bir sayiya döndürün
        //ipuclari:
        //( Data Casting -> Auto Widening ve Explicit Narrowing )

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen double(ondalikli) turunde bir sayi giriniz");
        double sayi = scanner.nextDouble();
        System.out.println("Girilen double(ondalikli) sayinin tamsayi hali: "+ (int)sayi);
        System.out.println("==============================================");
        System.out.println("Lutfen float(ondalikli) turunde bir sayi giriniz");
        float sayi1 = scanner.nextFloat();
        System.out.println("Girilen float(ondalikli) sayinin short hali: "+ (short)sayi1);
    }
}
