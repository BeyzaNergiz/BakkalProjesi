package GrupCalismasi;

import java.util.Scanner;

public class StringiTerseCevirme {

    public static void main(String[] args) {

        //SORU : Verilen metni tersine çeviren method oluşturun.
        String str1 = "StringBuilder";
        System.out.println(str1);
        System.out.println("str1'in ters çevrilmiş hali : " + reverseWords(str1));

        // SORU2 : Kullanıcı tarafindan girilen metni terse çeviren method oluşturun.
        Scanner scan = new Scanner(System.in);
        System.out.print("Kelime giriniz: ");
        String metin = scan.nextLine();
        System.out.println(tersYaz(metin));
    }
    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder newWordList = new StringBuilder();
        for (String each : words) {
            newWordList.append(new StringBuilder(each).reverse());
        }
        return newWordList.toString();
    }
    protected static String tersYaz(String metin) {
        String sonuc = "";
        int i;
        for (i = metin.length()- 1; i >= 0; i--) {
            sonuc += metin.charAt(i);
        }
        return sonuc;
    }
}
