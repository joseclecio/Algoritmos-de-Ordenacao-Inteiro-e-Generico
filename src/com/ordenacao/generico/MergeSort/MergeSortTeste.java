package com.ordenacao.generico.MergeSort;

import java.util.Scanner;

import static com.ordenacao.generico.MergeSort.MergeSortGenerico.parallelMergeSort;

public class MergeSortTeste {

    public static void main(String[] args) {

        Integer vet[] = new Integer[10];

        Scanner s = new Scanner(System.in);

        for (int i=0;i<vet.length;i++) {
            System.out.print("num: ");
            int num = s.nextInt();
            vet[i]=num;
        }

       // MergeSortGenerico.MergeSort.mergeSort(vet); OU O DE BAIXO
        parallelMergeSort(vet);

        for (int i=0;i<vet.length;i++) {
            System.out.print(vet[i]+",");
        }


        /*
        String[] items = {"kaka","joao","ana","1"}; //Basta mudar aqui para um tipo diferente de dados, Double, Integer, etc

        MergeSortGenerico<String> mergeSortGenerico = new MergeSortGenerico<>(items);
        mergeSortGenerico.sort();

        System.out.println("Itens ordenados: ");
        for (String x : mergeSortGenerico.getSortedItems()) {
            System.out.print(x + " ");
        }

         */
    }
}
