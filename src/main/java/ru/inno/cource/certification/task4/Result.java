package ru.inno.cource.certification.task4;

public class Result {
    private String valueFirst;
    private String valueSecond;
    private int sumFirst;
    private int sumSecond;

    public void setValueFirst(String valueFirst) {
        this.valueFirst = valueFirst;
    }

    public void setValueSecond(String valueSecond) {
        this.valueSecond = valueSecond;
    }

    public int getSumFirst() {
        return sumFirst;
    }

    public int getSumSecond() {
        return sumSecond;
    }

    public void result() {
        sumFirst = 0;
        sumSecond = 0;
        if (valueFirst.equals("К")) {
            if (valueSecond.equals("Н"))
                sumFirst = 1;
            if (valueSecond.equals("Б"))
                sumSecond = 5;
        }
        if (valueFirst.equals("Б")) {
            if (valueSecond.equals("К"))
                sumFirst = 5;
            if (valueSecond.equals("Н"))
                sumSecond = 2;
        }
        if (valueFirst.equals("Н")) {
            if (valueSecond.equals("К"))
                sumSecond = 1;
            if (valueSecond.equals("Б"))
                sumFirst = 2;
        }
    }
}
