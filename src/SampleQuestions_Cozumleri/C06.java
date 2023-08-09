package SampleQuestions_Cozumleri;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {
        //Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        // Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
        // 1 şeker = 1.5 gr
        // 1 kg = 1000 gram      olarak hesaplayın.
        // Ipuclari:
        // Önce gram cinsinden yıllık ne kadar seker kullandıgını bulun ve kiloya çevirin

        Scanner scanner = new Scanner(System.in);

        System.out.print("Günde kaç bardak çay içiyorsunuz: ");
        double bardakCay = scanner.nextDouble();

        System.out.print("Çayınıza kaç adet şeker atıyorsunuz: ");
        double seker = scanner.nextDouble();

        double gunlukSeker = bardakCay * (seker * 1.5);
        double yillikSeker = 365 * gunlukSeker;

        System.out.println("Bir yılda " + (yillikSeker / 1000) + " kg şeker tüketiyorsunuz.");
    }
}
