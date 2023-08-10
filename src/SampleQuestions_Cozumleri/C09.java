package SampleQuestions_Cozumleri;

import java.util.Scanner;

public class C09 {
    public static void main(String[] args) {

        // Soru 9-)  Girilen zamanı saniyeye çeviriniz.
        //           Örnek: 2 saat 3 dakika 10 saniye ==>	 7390 saniye
        //           Ipucu:
        //           Saati alıp saniyeye cevirebilirsiniz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen saat şeklinde bir zaman giriniz.");
        int saat = scanner.nextInt();
        System.out.println("Lutfen dakika şeklinde bir zaman giriniz.");
        int dakika = scanner.nextInt();
        System.out.println("Lutfen saniye şeklinde bir zaman giriniz.");
        int saniye = scanner.nextInt();


        int zaman = (saat*3600) + (dakika*60) + saniye;
        System.out.println("Girilen zaman : " + zaman + " saniyedir.");

    }
}
