package com.ordenacao.generico.BubbleSort;

import java.util.Scanner;

public class BubbleSortTeste {
    public static void main(String[] args) {

        Integer vet[] = new Integer[10];

        Scanner s = new Scanner(System.in);

        for (int i=0;i<vet.length;i++) {
            System.out.print("num: ");
            int num = s.nextInt();
            vet[i]=num;
        }

        BubbleSortGenerico.bubbleSort(vet,vet.length);

        for (int i=0;i<vet.length;i++) {
            System.out.print(vet[i]+",");
        }

        /*
        Integer arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        BubbleSortGenerico.bubbleSort(arr, arr.length);

        System.out.println("Sorted Array: ");
        for(Integer i : arr)
        {
            System.out.print(i+",");
        }

         */
    }
}
