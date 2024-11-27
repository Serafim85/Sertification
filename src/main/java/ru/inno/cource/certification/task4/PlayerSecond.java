package ru.inno.cource.certification.task4;

import java.util.Random;

public class PlayerSecond {

    public String getValueSecond() {
        String[] values = {"К", "Н", "Б"};
        Random rm = new Random();
        return values[rm.nextInt(3)];
    }
}
