package com.ordenacao.generico.InsertionSort;

public class InsertionSort {

    public static <T extends Comparable<T>> void insertionSort(T[] list, int size) {
        int outCounter, inCounter;
        T temp;
        // Sort list[] into increasing order.
        for (outCounter = 1; outCounter < size; outCounter++) {
            temp = list[outCounter];
            for (inCounter = outCounter; inCounter > 0 && list[inCounter - 1].compareTo(temp) > 0; inCounter--) {
                list[inCounter] = list[inCounter - 1];
            }
            list[inCounter] = temp;
        }
    }
}
