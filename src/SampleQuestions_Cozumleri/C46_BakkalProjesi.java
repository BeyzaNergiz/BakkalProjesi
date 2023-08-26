package SampleQuestions_Cozumleri;

import java.util.ArrayList;
import java.util.Scanner;

public class C46_BakkalProjesi {

    public static void main(String[] args) {
        /*
        Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
yazınız. Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
method yazınız. Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
gösteren bir method yazınız. Ayrıca bakkalın hangi günler ortalamanın altında
 kazandığını gösteren bir method yazınız.
 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
   2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
   3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
   4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
   5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır ortalama
             kazançtan yüksekse o günleri return yap.
   6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
             ortalama kazançtan aşağıysa o günleri return yap.
         */

// 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
        ArrayList<String> gunler = new ArrayList<>();
        gunler.add("Pazartesi");
        gunler.add("Sali");
        gunler.add("Carsamba");
        gunler.add("Persembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");
        System.out.println(gunler);

// 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
        ArrayList<Double> gunlukKazanclar = new ArrayList<>();

// 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
        Scanner scanner = new Scanner(System.in);

        int gunIndex = 0;
        while (gunIndex < gunler.size()) {
            String gun = gunler.get(gunIndex);
            System.out.print(gun + " gününün kazancını girin: ");
            double kazanc = scanner.nextDouble();
            gunlukKazanclar.add(kazanc);
            gunIndex++;
        }

        System.out.println(gunlukKazanclar);
        // getOrtalamaKazanc();
        double ortalamaKazanc = getOrtalamaKazanc(gunlukKazanclar);
        System.out.println("Ortalama Kazanç: " + ortalamaKazanc + " TL");
        // getOrtalamaninUstundeKazancGunleri();
        ArrayList<String> ustOrtalamaGunler = getOrtalamaninUstundeKazancGunleri(gunler, gunlukKazanclar, ortalamaKazanc);
        System.out.println("Ortalamanın Üstünde Kazanç Günleri: " + ustOrtalamaGunler);
        // getOrtalamaninAltindaKazancGunleri();
        ArrayList<String> altOrtalamaGunler = getOrtalamaninAltindaKazancGunleri(gunler, gunlukKazanclar, ortalamaKazanc);
        System.out.println("Ortalamanın Altında Kazanç Günleri: " + altOrtalamaGunler);
    }

    public static double getOrtalamaKazanc(ArrayList<Double> kazanclar) {
        // 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.

        double toplamKazanc = 0.0;
        for (double kazanc : kazanclar) {
            toplamKazanc += kazanc;
        }
        return toplamKazanc / kazanclar.size();
    }

    // 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
    // for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır ortalama
    // kazançtan yüksekse o günleri return yap.
    public static ArrayList<String> getOrtalamaninUstundeKazancGunleri(ArrayList<String> gunler, ArrayList<Double> kazanclar, double ortalama) {

        ArrayList<String> ustOrtalamaGunler = new ArrayList<>();
        for (int i = 0; i < gunler.size(); i++) {
            String gun = gunler.get(i);
            Double kazanc = kazanclar.get(i);
            if (kazanc > ortalama) {
                ustOrtalamaGunler.add(gun);
            }
        }
        return ustOrtalamaGunler;
    }

    // 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
    // for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
    // ortalama kazançtan aşağıysa o günleri return yap.
    public static ArrayList<String> getOrtalamaninAltindaKazancGunleri(ArrayList<String> gunler, ArrayList<Double> kazanclar, double ortalama) {

        ArrayList<String> altOrtalamaGunler = new ArrayList<>();
        for (int i = 0; i < gunler.size(); i++) {
            String gun = gunler.get(i);
            Double kazanc = kazanclar.get(i);
            if (kazanc < ortalama) {
                altOrtalamaGunler.add(gun);
            }
        }
        return altOrtalamaGunler;
    }
}
