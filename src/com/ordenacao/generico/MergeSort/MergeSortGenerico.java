package com.ordenacao.generico.MergeSort;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class MergeSortGenerico {
    public static <E extends Comparable<E>> void parallelMergeSort(E[] list) {
        RecursiveAction mainTask = new SortTask<E>(list);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(mainTask);
    }

    private static class SortTask<E extends Comparable<E>> extends RecursiveAction {
        private final int THRESHOLD = 500;
        private E[] list;

        SortTask(E[] list) {
            this.list = list;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void compute() {
            if (list.length < THRESHOLD)
                java.util.Arrays.sort(list);
            else {
                // Obtain the first half
                E[] firstHalf = (E[]) (new Comparable[list.length / 2]);
                System.arraycopy(list, 0, firstHalf, 0, list.length / 2);

                // Obtain the second half
                int secondHalfLength = list.length - list.length / 2;
                E[] secondHalf = (E[]) (new Comparable[secondHalfLength]);
                System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);

                // Recursively sort the two halves
                invokeAll(new SortTask<E>(firstHalf), new SortTask<E>(secondHalf));

                // Merge firstHalf with secondHalf into list
                MergeSort.merge(firstHalf, secondHalf, list);
            }
        }
    }

    static class MergeSort {
        /**
         * The method for sorting the numbers
         */
        @SuppressWarnings("unchecked")
        public static <E extends Comparable<E>> void mergeSort(E[] list) {
            if (list.length > 1) {
                // Merge sort the first half
                E[] firstHalf = (E[]) (new Comparable[list.length / 2]);
                System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
                mergeSort(firstHalf);

                // Merge sort the second half
                int secondHalfLength = list.length - list.length / 2;
                E[] secondHalf = (E[]) (new Comparable[secondHalfLength]);
                System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
                mergeSort(secondHalf);

                // Merge firstHalf with secondHalf into list
                merge(firstHalf, secondHalf, list);
            }
        }

        /**
         * Merge two sorted lists
         */
        public static <E extends Comparable<E>> void merge(E[] list1, E[] list2, E[] temp) {
            int current1 = 0; // Current index in list1
            int current2 = 0; // Current index in list2
            int current3 = 0; // Current index in temp

            while (current1 < list1.length && current2 < list2.length) {
                if (list1[current1].compareTo(list2[current2]) < 0)
                    temp[current3++] = list1[current1++];
                else
                    temp[current3++] = list2[current2++];
            }

            while (current1 < list1.length)
                temp[current3++] = list1[current1++];

            while (current2 < list2.length)
                temp[current3++] = list2[current2++];
        }
    }
}
