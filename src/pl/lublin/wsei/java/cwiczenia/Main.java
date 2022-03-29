package pl.lublin.wsei.java.cwiczenia;
import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
import java.lang.String;

public class Main {

    public static void main(String[] args) {

        Account acc = new Account();
        //acc.setName("Piotr Gołabek");
        acc.name = "Piotr Gołabek";
        System.out.println(acc.getName());
//
//        int [] liczby = new int[30];
//        Random rnd = new Random();
//
//        for (int i = 0; i < 30; i++)
//            liczby [i] = rnd.nextInt();
//
//        int mx = Integer.MIN_VALUE;
//        int mn = Integer.MAX_VALUE;
//        long avg = 0;
//        for (int l : liczby){
//            System.out.println(l);
//            if (l < mn) mn = l;
//            if (l > mx) mx = l;
//            avg += 1;
//        }
//        System.out.printf("MIN = %d, MAX = %d, AVG = %f", mn, mx, (float) avg/liczby.length);








//        public static String leftPad (String aText,char aChar, int aWight)
//        {
//            String res = leftPad;
//            for (int i = 0; i < aWight - leftPad.length(); i++)
//                res = aChar + res;
//            return res;
//        }


//        Scanner input = new Scanner(System.in);
//        int l;
//        System.out.print("Podaj liczbę: ");
//        l = input.nextInt();
//        System.out.println("DEC = " + l);
//        System.out.println("BIN = " + Integer.toBinaryString(l));
//        System.out.println("HEX = " + Integer.toHexString(l));

//        Scanner input = new Scanner(System.in);
//        int num1, num2;
//        System.out.print("Podaj pirwszą liczbę: ");
//        num1 = input.nextInt();
//        System.out.print("Podaj drugą liczbę: ");
//        num2 = input.nextInt();
//        System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);

//        Scanner input = new Scanner(System.in);
//        int num1 = 0, num2 = 0;
//        do {
//            System.out.print("Podaj pirwszą liczbę: ");
//            num1 = input.nextInt();
//            if (num1 == 0) break;
//            System.out.print("Podaj drugą liczbę: ");
//            num2 = input.nextInt();
//            if (num1 == 0) break;
//            System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);
//        } while (true);

//        Scanner input = new Scanner(System.in);
//        int num1 = 0, num2 = 0;
//        do {
//            System.out.print("Podaj liczbę którą mam dodać: ");
//            num1 = input.nextInt();
//            num2 = input.nextInt();
//            if ((num1 == 0 || num2 == 0)) break;
//            System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);
//        } while (true);


//        int a = 3;
//        double b = 3.31;
//        String s = "jakis tekst";
//
//        System.out.printf("a = %d, b = %.2f, s = %20s %n,", a,b,s);


//        for (int i = 1; i <= 10; i += 1)
//        System.out.println("arg\t" + i +  "\tlog2(arg) \t" + Math.log(i) / Math.log(2) +
//                "\tsum(arg)\t" + (i + (Math.log(i) / Math.log(2)))) ;

        }
    }