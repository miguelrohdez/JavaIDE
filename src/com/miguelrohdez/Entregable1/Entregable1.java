package com.miguelrohdez.Entregable1;

public class Entregable1 {
    public static void main(String[] args) {
        int[][] matriz2D;
        matriz2D = new int[4][4];
        int i;
        int j;
        int c;
        int k;
        int l;
        c = 2;
        for (i = 0; i <matriz2D.length ; i++) {
            for (j = 0; j <matriz2D.length ; j++) {
                System.out.println("i= "+i+"\tj= " + j + " => "+c);
                matriz2D[i][j] = c;
                c=c+2;
            }

        }
        System.out.println("\n----------------------------------------------------------------\n" +
                "---------Matriz Impresa----------\n" +
                "----------------------------------------------------------------\n");
        for (k = 0; k <matriz2D.length ; k++) {
            for (l = 0; l <matriz2D.length ; l++) {
                System.out.print(matriz2D[k][l]+"\t");

            }
            System.out.println("");

        }

    }

}
