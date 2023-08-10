package SampleQuestions_Cozumleri;

import java.util.Scanner;

public class C08 {
    public static void main(String[] args) {
        // Soru-8)  Kullanicidan üc basamaklı bir sayı alin.
        //               Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
        //ipuclari:      Matematiksel Islemler konusuna bakalim.
        //Bölme islemi kullanarak sayinin basamaklarini alalim ve toplam adli bir konteynira (Variable) atalim.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz.");
        int sayi = scanner.nextInt();
        int toplam = 0;
        int birlerBasamagi=0;


       birlerBasamagi = sayi % 10; // 987%10=7
       toplam += birlerBasamagi; // 7
       sayi = sayi / 10; // 987 / 10 = 98
       birlerBasamagi = sayi % 10; // 98%10=8
       toplam += birlerBasamagi; //7+8=15
       sayi = sayi / 10; // 98/10=9
       birlerBasamagi = sayi%10; // 9
       toplam += birlerBasamagi; // 15+9=24

        System.out.print("Girilen sayinin rakamlari toplami : " + toplam);



    }
}
