package variaveisOperadores;

import java.util.Scanner;

public class teset {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int i, j, l, c, somap = 0, somas = 0;
        System.out.println("Defina o tamanho da matriz L x C");
        l = read.nextInt();
        c = read.nextInt();
        int[][] m = new int[l][c];

        for (i = 0; i < l; i++) {
            for (j = 0; j < c; j++) {
                System.out.printf("Digite os valores correspondente a [%d] [%d]", i, j);
                m[i][j] = read.nextInt();
            }

        }
        for (i = 0; i < l; i++) {
            for (j = 0; j < c; j++) {
                if (i == j) {
                    somap = somap + m[i][j];
                } else if (j +1 == c - 1) {
                    somas = somas + m[i][j];
                }
            }

        }
        for (i = 0; i < l; i++) {
            for (j = 0; j < c; j++) {
                if (i == j) {
                    System.out.printf("Os numeros da diagonal Principal são: %d, \n", m[i][j]);

                }
            }
        }
        for (i = l; i > 0; i--) {
            for (j = c; j > 0; j--) {
                if (j-1 == c+1) {
                    System.out.printf("Os numeros da diagonal Secundaria são: %d \n", m[i-1][j-1]);

                }
            }
        }
System.out.printf("A soma da diagonal principal é %d e da diagonal secundaria é %d",somap,somas);
    }
}