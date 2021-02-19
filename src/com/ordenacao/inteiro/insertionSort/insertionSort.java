package com.ordenacao.inteiro.insertionSort;

import com.ordenacao.inteiro.IOrdenacao;

public class insertionSort implements IOrdenacao {
    @Override
    public void ordenar(int[] valores) {

        int i, j, key, temp;
        for (i = 1; i < valores.length; i++) {
            key = valores[i];
            j = i - 1;
            while (j >= 0 && key < valores[j]) {
                temp = valores[j];
                valores[j] = valores[j + 1];
                valores[j + 1] = temp;
                j--;
            }
        }

    }
}
