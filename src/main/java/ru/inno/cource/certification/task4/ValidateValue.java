package ru.inno.cource.certification.task4;

import java.util.HashMap;
import java.util.Map;

public class ValidateValue {
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return validator();
    }
    public String validator(){
        String str = "";
        Map<String, String > mapValues = new HashMap<>();
        mapValues.put("К", "К");
        mapValues.put("к", "К");
        mapValues.put("K", "К");
        mapValues.put("k", "К");
        mapValues.put("Н", "Н");
        mapValues.put("н", "Н");
        mapValues.put("H", "Н");
        mapValues.put("h", "Н");
        mapValues.put("N", "Н");
        mapValues.put("n", "Н");
        mapValues.put("Б", "Б");
        mapValues.put("б", "Б");
        mapValues.put("B", "Б");
        mapValues.put("b", "Б");
        str = mapValues.get(value);
        return str;
    }
}
