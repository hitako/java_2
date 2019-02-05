package lesson_5;

import java.util.Arrays;

public class Main {

    static final int size = 1000000;
    // кол-во потоков не фиксированное
    static final int threadCount = 4;
    static final int h = size / threadCount;



    public static void main(String[] args) {
        //methodOne();
        methodTwo();
    }

    private static void methodOne() {
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println(System.currentTimeMillis() - a);
    }

    private static void methodTwo() {

        //исходный массив
        float[] arr = new float[size];

        // двумерный массив, в котором будут части исходного массива arr
        float[][] newArr = new float[threadCount][h];

        // массив потоков, зависит от исходного значения, т.е. кол-во потоков можно менять
        MyThread[] myThread = new MyThread[threadCount];

        //инициализация исходного массива единицами
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        // копируем исходный массив в новый
        for (int i = 0; i < threadCount; i++) {
            System.arraycopy(arr, i * h, newArr[i], 0, h);
        }

        long a = System.currentTimeMillis();

        //передаем значения нового двумерного массива в потоки
        for (int i = 0; i < threadCount; i++) {
            myThread[i] = new MyThread(h, i * h, newArr[i]);
            myThread[i].start();
        }

        try {
            for (int i = 0; i < threadCount; i++) {
                myThread[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //соединяем части в один массив
        for (int i = 0; i < threadCount; i++) {
            System.arraycopy(myThread[i].getArr(), 0, arr, i * h, h);
        }

        System.out.println(System.currentTimeMillis() - a);
    }
}
