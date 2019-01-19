package lesson_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //task1();




        //Задание 2

        Map<String, String> phoneDirectory = new HashMap<>();

        add(phoneDirectory,"Иванов", "+79853325566");
        add(phoneDirectory,"Иванов", "+79853325544");
        add(phoneDirectory,"Петров", "+79063325544");

        get(phoneDirectory, "Петров");
        get(phoneDirectory, "Иванов");
        get(phoneDirectory, "Сидоров");
    }

    private static void add(Map directory, String secondName, String phone) {

        String phone2 = (String) directory.get(secondName);

        directory.put(secondName, (phone2 == null) ? phone : phone2 + ", " + phone );
    }

    private static void get(Map directory, String secondName) {
        System.out.println(directory.get(secondName) != null ? directory.get(secondName) : "Такой человек не найден.");
    }

    private static void task1() {
        ArrayList<String> countries = new ArrayList<>();
        Map<String, Integer> countriesMap = new HashMap<>();

        countries.add("Армения");
        countries.add("Боливия");
        countries.add("Великобритания");
        countries.add("Великобритания");
        countries.add("Гондурас");
        countries.add("Дания");
        countries.add("Египет");
        countries.add("Египет");
        countries.add("Иран");
        countries.add("Канада");
        countries.add("Латвия");
        countries.add("Латвия");
        countries.add("Латвия");
        countries.add("Молдавия");
        countries.add("ОАЭ");
        countries.add("Перу");
        countries.add("Перу");
        countries.add("Перу");
        countries.add("Перу");
        countries.add("Сербия");
        countries.add("Турция");
        countries.add("Турция");

        Iterator<String> iterator = countries.iterator();

        while(iterator.hasNext()) {
            String country = iterator.next();
            Integer res = countriesMap.get(country);
            countriesMap.put(country, ((res == null) ? 1 : res + 1) );
        }

        System.out.println(countriesMap);

        Set<Map.Entry<String, Integer>> set = countriesMap.entrySet();
        System.out.println("\nУникальные страны:");
        System.out.println("==================");
        for (Map.Entry<String, Integer> country: set) {
            if(country.getValue() == 1) {
                System.out.println(country.getKey());
            }
        }
    }

}