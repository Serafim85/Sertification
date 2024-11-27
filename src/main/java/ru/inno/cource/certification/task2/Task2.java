package ru.inno.cource.certification.task2;

import java.time.LocalDate;

public class Task2 {
    public static void main(String[] args) {
        LocalDate lastDateWaterCactus = LocalDate.of(2024, 4, 29);
        System.out.println(lastDateWaterCactus);
        WateringCactus wateringCactus = new WateringCactus(lastDateWaterCactus);
        System.out.println("Полить кактус надо: " + " " + wateringCactus.getNextDateWaterCactus());

    }
}
