package ru.inno.cource.certification.task2;

import java.util.Random;

/**
 * Датчик влажности
 * Влажность определяется случайным образом
 */
public class Sensor {

    public int getSensor() {
        Random rm = new Random();
        return (rm.nextInt(10)+1)*10;
    }
}
