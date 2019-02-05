package lesson_1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();

        cats.add(new Cat("Вася", 10));
        cats.add(new Cat("Коля", 15));
        cats.add(new Cat("Федя", 20));
        cats.add(new Cat("Федя", 25));

        for (Cat cat: cats) {
            System.out.println(cat.age + " " + cat.name);
        }
    }
}


class Cat {
    String name;
    int age;

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}