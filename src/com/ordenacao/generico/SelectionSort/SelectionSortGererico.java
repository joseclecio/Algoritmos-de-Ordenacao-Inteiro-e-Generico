package com.ordenacao.generico.SelectionSort;

public class SelectionSortGererico {
    public static <T extends Comparable<T>> void selectionSort (T[] list, int size)
    {
        int outCounter, inCounter, minIndex;
        T temp;
        // swapOccurred helps to stop iterating if the array gets sorted before
        // outCounter reaches to size
        for (outCounter = 0; outCounter < size - 1; outCounter++)
        {
            minIndex = outCounter;
            for (inCounter = outCounter + 1; inCounter < size; inCounter++)
            {
                if (list[minIndex].compareTo(list[inCounter]) > 0)
                    minIndex = inCounter;
            }

            //swap items
            if (minIndex != outCounter)
            {
                temp = list[minIndex];
                list[minIndex] = list[outCounter];
                list[outCounter] = temp;
            }
        }
    }
}
