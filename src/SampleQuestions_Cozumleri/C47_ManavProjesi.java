package SampleQuestions_Cozumleri;

import java.util.Scanner;

public class C47_ManavProjesi {

    public static void main(String[] args) {
        /*
   * Basit bir 5 ürünlü manav alisveris programi yaziniz.
   1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
   2. Adim : Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
             Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
   3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
   4. Adim : Alisveris bitince toplam odemesi gereken tutari goster
         */
        // Urun listesinden urun sectir ve kac kilo oldugunu sor.
        Scanner scanner = new Scanner(System.in);
        String[] urunler = {"Çilek", "Kiraz", "Muz", "Portakal", "Üzüm"};
        double[] fiyatlar = {50.0, 35.0, 45.7, 20.0, 25.5};
        double toplamFiyat = 0;
        do {
            System.out.println("Ürünler:");
            for (int i = 0; i < urunler.length; i++) {
                System.out.println((i + 1) + ". " + urunler[i] + " - " + fiyatlar[i] + " ₺/kg");
            }
            System.out.print("Manav ürünler listesinden seçiminizi yapınız (1-" + urunler.length + "): ");
            int secilenUrunIndex = scanner.nextInt() - 1;
            System.out.print(urunler[secilenUrunIndex] + " kac kilo? ");
            double kilo = scanner.nextDouble();
            // Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
            double urunFiyat = fiyatlar[secilenUrunIndex] * kilo;
            toplamFiyat += urunFiyat;
            System.out.println(urunler[secilenUrunIndex] + " icin odemeniz gereken tutar: " + urunFiyat + " ₺");
    /* Baska bir urun almak isteyip istemedigini sor.
       istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
       Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
    */
            System.out.print("Baska bir urun almak istiyor musunuz? (Evet/Hayır): ");
            String devam = scanner.next();
            if (devam.equalsIgnoreCase("Hayır")) {
                break;
            }
        } while (true);
        // Alisveris bitince toplam odemesi gereken tutari goster
        System.out.println("Alışverişiniz tamamlandı. Toplam tutar: " + toplamFiyat + " ₺");
    }
}
