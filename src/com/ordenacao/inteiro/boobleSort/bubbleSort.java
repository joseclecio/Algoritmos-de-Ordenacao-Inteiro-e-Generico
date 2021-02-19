package com.ordenacao.inteiro.boobleSort;

import com.ordenacao.inteiro.IOrdenacao;

public class bubbleSort implements IOrdenacao {

    @Override
    public void ordenar(int[] valores) {

        int i, j, temp = 0;
        for (i = 0; i < valores.length - 1; i++) {
            for (j = 0; j < valores.length - 1 - i; j++) {
                if (valores[j] > valores[j + 1]) {
                    temp = valores[j];
                    valores[j] = valores[j + 1];
                    valores[j + 1] = temp;
                }
            }
        }
    }
}
