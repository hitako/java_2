package lesson_4;

public class Main {
    public static void main(String[] args) {
        new Test();
    }
}

class Test {

   /* {
        System.out.println("Non-static block");
    }*/

    static {
        System.out.println("Static");
    }



    public Test() {
        System.out.println("Constructor");
    }
}