package lesson_5;

import java.util.Arrays;

public class MyThread extends Thread {

    int size, step;
    float[] arr;
    float[] mainArr;

    MyThread(int size, int step, float[] mainArr) {
        super();
        this.size = size;
        this.step = step;
        this.mainArr = mainArr;
        this.arr = new float[size];
    }

    @Override
    public void run() {
        for (int i = 0; i < this.size; i++) {
            this.arr[i] = (float)(mainArr[i] * Math.sin(0.2f + (i + step) / 5) * Math.cos(0.2f + (i + step) / 5) * Math.cos(0.4f + (i + step) / 2));
        }
    }

    protected float[] getArr() {
        return this.arr;
    }
}
