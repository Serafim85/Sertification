package ru.inno.cource.certification.task1;

import java.util.Scanner;

/**
 *  Мальчик хочет написать на заборе признание в любви девочке из пятнадцати
 * букв и трех пробелов. На каждые три буквы мальчик тратит по 62 см длины
 * забора, а на каждый пробел - 12 см.
 * Напишите программу, которая поможет по длине забора (введенной
 * пользователем) выяснить, поместится ли на забор такой длины надпись
 * мальчика.
 */
public class Task1 {
    public static void main(String[] args) {
        int declarationOfLoveLength = 15 / 3 * 62 + 3 * 12;      // длина признания - 346 см.
        Scanner scan = new Scanner(System.in);
        int fenceLength = 0;
        boolean isValidLength = false;
        System.out.println(" Введите длину забора: ");
        while (!isValidLength) {
            while (true) {

                if (scan.hasNextInt()) {
                    fenceLength = scan.nextInt();
                    if (fenceLength >= declarationOfLoveLength) {
                        isValidLength = true;
                        break;
                    } else
                        System.out.println("Маловат забор. Попробуйте еще раз.");
                } else {
                    System.out.println("Ведите цифру");
                    String str = scan.nextLine();
                    str = scan.nextLine();
                    break;
                }
            }
        }
        System.out.println("Надпись мальчика поместится на забор длиной " + fenceLength + " см.");
    }
}
