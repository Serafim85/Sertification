package ru.inno.cource.certification.task4;

import java.util.Scanner;

/**
 * 4. Камень-ножницы-бумага
 * Напишите консольное приложение, которое играет с пользователем в
 * камень-ножницы-бумагу.
 * <p>
 * Требования:
 * 1. Пользователь вводит значение через консоль
 * К - камень
 * Н - ножницы
 * Б - бумага
 * 2. Программа выбирает свой вариант случайным образом
 * 3. Игра состоит из 5 раундов
 * 4. Баллы считаются по формуле ниже.
 * 5. По итогу 5 раундов, программа пишет счет и объявляет победителя.
 * Конец игры.
 * <p>
 * Как считать баллы:
 * 1. Если сторона одержала победу с помощью камня (К), победитель
 * получает 1 балл
 * 2. Если сторона одержала победу с помощью ножниц (Н), победитель
 * получает 2 балла
 * 3. Если сторона одержала победу с помощью бумаги (Б), победитель
 * получает 5 баллов
 */
public class Task4 {

    public static void main(String[] args) {
        String valueFirst = "";
        String valueSecond = "";
        int sumFirst = 0;
        int sumSecond = 0;
        int round = 1;
        boolean isOk;

        ValidateValue validateValue = new ValidateValue();
        PlayerSecond playerSecond = new PlayerSecond();
        Result result = new Result();

        Scanner playerFirst = new Scanner(System.in);
        System.out.println("Введите символ ( К - камень, Н - ножницы, Б - бумага)");

        while (round <= 5) {
            isOk = false;
            System.out.println("Раунд: " + round);
            valueFirst = playerFirst.nextLine();
            while (!isOk) {
                validateValue.setValue(valueFirst);
                valueFirst = validateValue.getValue();
                if (valueFirst != null)
                    isOk = true;
                else {
                    System.out.println("Ошибка!!! Попробуйте еще раз");
                    valueFirst = playerFirst.nextLine();
                }
            }
            valueSecond = playerSecond.getValueSecond();
            result.setValueFirst(valueFirst);
            result.setValueSecond(valueSecond);
            result.result();
            System.out.println("Первый игрок: " + valueFirst + " счет: " + result.getSumFirst());
            System.out.println("Второй игрок: " + valueSecond + " счет: " + result.getSumSecond());
            sumFirst += result.getSumFirst();
            sumSecond += result.getSumSecond();
            round++;
        }
        System.out.println();
        if(sumFirst > sumSecond)
            System.out.println( "Победил первый игрок со счетом: " + sumFirst);
        else
            System.out.println( "Победил второй игрок со счетом: " + sumSecond);
    }
}
