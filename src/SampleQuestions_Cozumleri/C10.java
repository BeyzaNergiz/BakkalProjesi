package SampleQuestions_Cozumleri;

import java.util.Scanner;

public class C10 {
    public static void main(String[] args) {
        //Soru 10-)  Klasik Soru :slightly_smiling_face:
        //                    Kullanıcıdan kilosunu ve boyunu isteyin ve kütleyi hesaplayan bir program yazın
        //
        //                    **indeks Hesaplama: İPUCU : Vücut Kitle İndeksi = Ağırlık (kg) / Boy uzunluğunun karesi (m) // If konusunu hatırlayın!***
        //                   Kullanıcıya aşağıdaki gibi mesaj verin:
        //
        //                    Eğer VKİ 18.5'ten az ise --> zayıfsınız
        //                    Eğer VKİ 18.5 ile 25 arasında ise --> kilo idealdir
        //                    Eğer VKİ 25 ila 30 arasındaysa --> şişmansınız
        //                    VKİ 30'a eşit veya daha fazlaysa --> agam obezsin, diyet yap!
        //
        //                ÖRNEK : Ağırlık : 71
        //		                  Yükseklik : 1,72
        //		          ÇIKTI : VKİ değeriniz : 23.99945916711736 -> Kilonuz ideal

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen boyunuzu cm olarak giriniz: ");
        double boy = scanner.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();
        double vki = kilo / (boy * boy / 10000);
        System.out.println(vki);

        if (vki >= 30) {
            System.out.println("Agam obezsin, diyet yap!");
        } else if (vki > 25 && vki < 30) {
            System.out.println("Şişmansınız");
        } else if (vki > 18.5 && vki <= 25) {
            System.out.println("Kilonuz ideal");
        } else if (vki > 0 && vki <= 18.5) {
            System.out.println("Zayıfsınız");
        } else {
            System.out.println("Hatalı Giriş Yaptiniz");

        }
    }
}