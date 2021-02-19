package com.ordenacao.inteiro.selectionSort;

import com.ordenacao.inteiro.IOrdenacao;

public class selectionSort implements IOrdenacao {

    @Override
    public void ordenar(int[] valores) {

        int i, j, minValue, minIndex, temp = 0;
        for (i = 0; i < valores.length; i++) {
            minValue = valores[i];
            minIndex = i;
            for (j = i; j < valores.length; j++) {
                if (valores[j] < minValue) {
                    minValue = valores[j];
                    minIndex = j;
                }
            }
            if (minValue < valores[i]) {
                temp = valores[i];
                valores[i] = valores[minIndex];
                valores[minIndex] = temp;
            }
        }

    }
}
