package com.ordenacao.generico.QuickSort;
import java.util.Scanner;


public class QuickSortTeste {
    public static void main(String[] args) {Integer vet[] = new Integer[10];

        Scanner s = new Scanner(System.in);

        for (int i=0;i<vet.length;i++) {
            System.out.print("num: ");
            int num = s.nextInt();
            vet[i]=num;
        }

        QuickSortGenerico.sort(vet);

        for (int i=0;i<vet.length;i++) {
            System.out.print(vet[i]+",");
        }




    }
}
