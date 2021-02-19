package com.ordenacao.generico.QuickSort;

public class QuickSortGenerico {
    public static <T extends Comparable<? super T>>
    void sort(T[] arr) {
        if (arr == null || arr.length == 0
                || arr.length == 1)
            return;

        // Call overloaded sort method

        sort(arr, 0, arr.length - 1);
    }

// HELPER METHOD FOR SORT METHOD

    public static <T extends Comparable<? super T>>
    void sort(T[] arr, int left, int right) {

        // To be used while sorting

        int i = left;
        int j = right;

        // Check if left and
        // right indices are out
        // of order. If they are,
        // nothing can be done

        if (right <= left)
            return;

        // Middle element used
        // as pivot

        T pivot = arr[left + (right - left) / 2];

        // temp will be used
        // to swap elements later

        T temp;

        // quickSort algorithm

        while (i <= j) {
            // Look for values on
            // the left greater than
            // the pivot and values
            // on the right smaller
            // than the pivot

            // When you find both, swap them

            while (arr[i].compareTo(pivot) < 0) {
                i++;
            }

            while (arr[j].compareTo(pivot) > 0) {
                j--;
            }

            // Check that i hasn't
            // passed j already

            if (i <= j) {

                // Swap the items

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                // Move both indices
                // to their next position

                i++;
                j--;
            }
        }

        // Recursive calls to the
        // sort method

        if (left < j)
            sort(arr, left, j);
        if (i < right)
            sort(arr, i, right);
    }

}
