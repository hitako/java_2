package lesson_2;

import lesson_2.exceptions.MyArrayDataException;
import lesson_2.exceptions.MyArraySizeException;

public class Main {

    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"},
        };

        String[][] arrayIncorrectSize1 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
        };

        String[][] arrayIncorrectSize2 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11"},
                {"13", "14", "15", "16"},
        };

        String[][] arrayIncorrectData = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "text", "12"},
                {"13", "14", "15", "16"},
        };

        try {
            arrElementsToInt(array);
            //arrElementsToInt(arrayIncorrectSize1);
            //arrElementsToInt(arrayIncorrectSize2);
            //arrElementsToInt(arrayIncorrectData);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void arrElementsToInt(String[][] arr) throws MyArraySizeException, MyArrayDataException {

        int currentSum = 0;

        if(arr.length != 4) {
            throw new MyArraySizeException("Передан массив некорректного размера. Корректный размер: 4х4");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if(arr[i].length != 4) {
                    throw new MyArraySizeException("Передан массив некорректного размера. Корректный размер: 4х4");
                }

                try {
                    currentSum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Некорректные данные в ячейке: " + i + " " + j);
                }
            }
        }

        System.out.println("Сумма: " + currentSum);
    }
}
