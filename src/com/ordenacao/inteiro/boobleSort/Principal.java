package com.ordenacao.inteiro.boobleSort;

public class Principal {

    public static void main(String[] args) {

        bubbleSort b = new bubbleSort();

        int num[] = new int[5];

        /*
        //ALEATORIOS SEM REPETICAO
        num[0] = 10;
        num[1] = 1;
        num[2] = 44;
        num[3] = 12;
        num[4] = 3;
        */

        /*
        //ALEATORIOS COM REPETICAO
        num[0] = 10;
        num[1] = 1;
        num[2] = 10;
        num[3] = 12;
        num[4] = 1;
        */

        /*
        //ORDENADOS DE FORMA CRESCENTE
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;
        */

        //ORDENADOS DE FORMA DECRESCENTE
        num[0] = 5;
        num[1] = 4;
        num[2] = 3;
        num[3] = 2;
        num[4] = 1;

        b.ordenar(num);

        for (int i=0;i<num.length;i++){
            System.out.println(num[i]);

        }
    }
}
