package com.company;
import java.util.Scanner;

public class finalNumberAndRoman {
    static Scanner reader=new Scanner(System.in);
    public static void main(String[] args) {
        String Primer;
        String[] PrW,
                 RomanNN  = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"},
                 ArabicNN = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "0"};
        int i = 0, ii = 0,
                a, b,
                Ar = 0, Br = 0;
        int[] Arabic = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean RomN1 = false,
                RomN2 = false,
                ArabN1 = false,
                ArabN2 = false;
        //____________________________________________________________________________________________________
        System.out.println("Введите арифметическую операцию в следующем виде: a + b, a - b, a * b, a / b ");
        Primer = reader.nextLine(); // вводится операция для вычисления
        PrW = Primer.split(" "); // убираем пробелы из введенной операции
// -----------------------------------------------------------------------------------
        if (PrW.length != 3 || ((PrW[1].length()) > 1) || ((PrW[0].length()) > 4) || ((PrW[2].length()) > 4)) {
            System.out.println("Введенная операция с нарушением синтаксиса");
            System.exit(0);}
//-------------------------------------------------------------------------------------
        while (i <= 9)   {if (PrW[0].equals(RomanNN[i])) {RomN1 = true; Ar = i;}
                          if (PrW[2].equals(RomanNN[i])) {RomN2 = true; Br = i;}
                          i++;}
        while (ii <= 10) {if (PrW[0].equals(ArabicNN[ii])) {ArabN1 = true;}
                          if (PrW[2].equals(ArabicNN[ii])) {ArabN2 = true;}
                          ii++;}
        //-----------------------------------------------------------------------------------------
        if ((RomN1 == true) && (RomN2 == true))
                  {
                    a = Arabic[Ar];
                    b = Arabic[Br];
                    switch (PrW[1]) {
                     case "+": System.out.println(TranslateToRoman.Roman((a + b))); break;
                     case "*": System.out.println(TranslateToRoman.Roman((a * b))); break;
                     case "/": System.out.println(TranslateToRoman.Roman((a / b))); break;
                     case "-": if (a >= b) { System.out.println(TranslateToRoman.Roman((a - b))); break; }
                               else if (a < b) {System.out.println("Недопустимая операция c римскими числами - результат меньше 0 ");
                                                System.exit(0);}
                     default: {System.out.println("Неправильный синтаксис арифметической операции");
                               System.exit(0);}
                    }
                  System.exit(0);}
        else if ((RomN1 != RomN2) && (ArabN1 != ArabN2))
                                                    {
                                                    System.out.println("Недопустимая операция: используются одновременно разные системы счисления");
                                                    System.exit(0);}
        else if ((RomN1 != RomN2) && (ArabN1 == false && ArabN1 == false)) {
                                                                   System.out.println("Неправильный синтаксис арифметической операции");
                                                                   System.exit(0);}
        else if ((RomN1 == false) && (RomN2 == false))
          {
            if ((ArabN1 == false) || (ArabN2 == false)) {
                                                         System.out.println("Неправильный синтаксис арифметической операции");
                                                         System.exit(0);
                                                        }
            //-----------------------------------------------------------------------------------------------
            a = Integer.parseInt(PrW[0]);
            b = Integer.parseInt(PrW[2]);
              switch (PrW[1]) {
                case "+": System.out.println("Ответ = " + (a + b)); break;
                case "-": System.out.println("Ответ = " + (a - b)); break;
                case "*": System.out.println("Ответ = " + (a * b)); break;
                case "/": {
                           if (b == 0) {System.out.println("Недопустимая операция - деление на 0 ");System.exit(0);}
                           System.out.println("Ответ = " + (a / b));
                           break;
                          }
                default: {System.out.println("Неправильный синтаксис арифметической операции");System.exit(0);}
               }
        }
    }
}

