package day01_JavaIntro;

import java.util.Scanner;

public class YKS {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Türkçe net:");
        int turkce=input.nextInt();
        System.out.println("matematik net:");
        int math=input.nextInt();
        System.out.println("Sosyal Bilgiler net:");
        int sosyal=input.nextInt();
        System.out.println("Fen bilimleri net:");
        int fen=input.nextInt();

        int tytToplam=(turkce*3)+(math*3)+(sosyal*2)+(fen*2);

        System.out.println("TYT toplam puanınız: "+tytToplam);

        if(tytToplam>=200)
            System.out.println("başarılı");
        else System.out.println("başarısız");

    }
}
