package com.ordenacao.generico.InsertionSort;

import java.util.Scanner;

public class InsertionSortTeste {
    public static void main(String[] args) {

        Integer vet[] = new Integer[10];

        Scanner s = new Scanner(System.in);

        for (int i=0;i<vet.length;i++) {
            System.out.print("num: ");
            int num = s.nextInt();
            vet[i]=num;
        }

        InsertionSort.insertionSort(vet,vet.length);

        for (int i=0;i<vet.length;i++) {
            System.out.print(vet[i]+",");
        }


        /*
        Integer vetor[] = {1,5,2,1,4,3,7,2,1};

        InsertionSort.insertionSort(vetor, vetor.length);

        System.out.println("Ordenação: ");
        for (Integer i : vetor) {
            System.out.print(i + ",");
        }

         */
    }
}
