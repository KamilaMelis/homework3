package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Создать массив дробных (не целых) чисел размером 15 элементов и наполнить его положительными и отрицательными числами;
        //Затем через цикл “for each” посчитать среднее арифметическое положительных чисел расположенных после первого отрицательного числа и вывести его на экран (8, -2, -4, 2, 3, 6) =  11/3
        //ДЗ на сообразительность:
        //Вам необходимо написать следующий алгоритм сортировки массива по возрастанию: каждую итерацию выбирать самый минимальный элемент и смещать его в начало. При этом каждую новую итерацию начинать сдвигаясь вправо, то есть первый проход — с первого элемента, второй проход — со второго и т.д.
        //И при каждой итерации распечатывать текущее состояние массива


        double[] justArray = {-1.6, -1.5, -1.4, -1.3, -1.2, -1.1, 1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9};
        System.out.println(Arrays.toString(justArray));
        for (double i = 0.0; i < 15.0; i++);
        double result1 = 0;
        int result2 = 0;
        for (double i : justArray)
        {
            if (i > 0) {
                result1 += i;
                result2 += 1;
            }
        }
        System.out.println( result1 / result2);



        System.out.println("Сортировка массива по возрастанию");
        int just1;
        for (int i = 0; i < justArray.length; i++) {
            just1 = i;
            for (int j = i + 1; j < justArray.length; j++) {
                if (justArray[j] < justArray[just1]) {
                    just1 = j;
                }
            }
            if (just1 != i) {
                double just2 = justArray[i];
                justArray[i] = justArray[just1];
                justArray[just1] =just2 ;
            }
            System.out.println(justArray[i]);
        }
        System.out.print("Сортировка: ");
        Arrays.sort(justArray);
        for (int i = 0; i < justArray.length; i++) {
            System.out.print(justArray[i] + "  ");
        }
    }
}

