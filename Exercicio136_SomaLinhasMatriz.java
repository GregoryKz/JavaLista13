package dev_klaus.lista13;
import java.util.Scanner;


public class Exercicio136_SomaLinhasMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            int soma = 0;
            for (int j = 0; j < 3; j++) {
                soma += matriz[i][j];
            }
            System.out.println("Soma da linha " + i + ": " + soma);
        }
        sc.close();
    }
}
