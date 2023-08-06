package SampleQuestions_Cozumleri;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {


    // Soru 5-)   SCANNER
    //Kullanıcıdan karenin kenar uzunluğunu alın. Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.
    //Ipuclari:
    //Google yaparak karenin alaninin ve cevresinin nasil bulundugunu ögrenin

    Scanner scanner = new Scanner(System.in);
    System.out.print("Karenin kenar uzunluğunu giriniz: ");
    double kenar = scanner.nextDouble();
    double alan = kenar * kenar;
    double cevre = kenar * 4;
        System.out.println("Karenin Alani :" + alan);
        System.out.println("Karenin Cevresi :" + cevre);

    }
}
