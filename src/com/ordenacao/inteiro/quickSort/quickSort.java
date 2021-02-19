package com.ordenacao.inteiro.quickSort;

import com.ordenacao.inteiro.IOrdenacao;

import java.util.Random;

public class quickSort implements IOrdenacao {


    @Override
    public void ordenar(int[] valores) {

        quickSort(valores, 0, valores.length-1);

    }

    private void quickSort(int[] A, int low, int high) {
        if (low < high+1) {
            int p = partition(A, low, high);
            quickSort(A, low, p-1);
            quickSort(A, p+1, high);
        }
    }

    private void swap(int[] A, int index1, int index2) {
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }

    //retorna o índice de pivô aleatório entre baixo e alto.
    private int getPivot(int low, int high) {
        Random rand = new Random();
        return rand.nextInt((high - low) + 1) + low;
    }

    // move todos os n < pivô para a esquerda do pivô e todos os n > pivô à direita do pivô e retorna o índice do pivô.
    private int partition(int[] A, int low, int high) {
        swap(A, low, getPivot(low, high));
        int border = low + 1;
        for (int i = border; i <= high; i++) {
            if (A[i] < A[low]) {
                swap(A, i, border++);
            }
        }
        swap(A, low, border-1);
        return border-1;
    }
}
