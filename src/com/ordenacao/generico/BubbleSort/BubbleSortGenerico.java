package com.ordenacao.generico.BubbleSort;

public class BubbleSortGenerico {
    public static <T extends Comparable<T>> void bubbleSort (T[] list, int size)
    {
        int swapOccurred = 1, outCounter, inCounter;
        T temp;
        // swapOccurred helps to stop iterating if the array gets sorted before
        // outCounter reaches to size
        for (outCounter = size - 1; outCounter > 0 && swapOccurred == 1; outCounter--) {
            swapOccurred = 0;
            for (inCounter = 0; inCounter < outCounter; inCounter++) {
                if (list[inCounter].compareTo(list[inCounter + 1]) > 0) {
                    temp = list[inCounter];
                    list[inCounter] = list[inCounter + 1];
                    list[inCounter + 1] = temp;
                    swapOccurred = 1;
                }
            }
        }
    }
}
