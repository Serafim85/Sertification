package ru.inno.cource.certification.task2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * Программа отслеживания полива кактуса.
 * На вход программа ждет дату последнего полива кактуса. Если сейчас зима
 * (декабрь - февраль), то кактус поливается раз в месяц. Если осень или весна -
 * раз в неделю. Летом поливается в зависимости от влажности воздуха, но не
 * чаще одного раза в два дня.
 * Значение влажности воздуха в программу попадает автоматически от датчика
 * (реализуйте через вызов метода класса Датчик, внутри которого будет
 * генерация рандомного числа). Если влажность меньше 30%, кактус нужно
 * полить.
 * После проверки всех данных, программа выведет
 * сообщение с датой, когда надо поливать кактус.
 */
public class WateringCactus {
    private final LocalDate date;

    public WateringCactus(LocalDate date) {
        this.date = date;
    }

    public LocalDate getNextDateWaterCactus() {
        return rules();
    }

    public String season(){
        String season ="";
        Map<Integer,String> seasons = new HashMap<>();
        for (int i = 1; i < 13 ; i++) {
            if(i >= 3 && i <= 5)
                season = "Весна";
            else if (i >= 6 && i <= 8 )
                    season = "Лето";
            else if (i >= 9 && i <= 11)
                    season = "Осень";
            else
                season = "Зима";
            seasons.put(i, season);
        }
        return seasons.get(date.getMonthValue());
    }

    public LocalDate rules(){
        String season = season();
        System.out.println(season);
        LocalDate nextDateWaterCactus;
        if (season.equals("Зима"))
            nextDateWaterCactus = date.plusMonths(1);
        else if(season.equals("Осень") || season.equals("Весна"))
            nextDateWaterCactus = date.plusWeeks(1);
        else {
            Sensor sensor = new Sensor();
            int wetness = sensor.getSensor(); // влажность
            System.out.println("Влажность: " + wetness);
            if (wetness < 30)
                nextDateWaterCactus = LocalDate.now();
            else
                nextDateWaterCactus = date.plusDays(2);
        }
        return nextDateWaterCactus;
    }
}
