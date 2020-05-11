package com.matrix;

public class Matrices {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        matrixFunc(a);
    }

    public static void matrixFunction(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {

            }

        }
    }

    public static void matrixFunc(int[][] a) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ( i == 1 || j == 1) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = 0;
                }
            }

        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("+++++++++++++++++++++++");
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


    }
}
