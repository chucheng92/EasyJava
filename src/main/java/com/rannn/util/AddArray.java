package com.rannn.util;

public class AddArray {
    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int[] B = {4, 5, 6};
        int[][] C = {{7, 8, 9}, {10, 11, 12}};
        int[][] D = new int[3][4];

        //store a b c to temp
        int[] temp = new int[12];
        for (int i = 0; i < 12; ) {
            for (int j = 0; j < 3; j++) {
                temp[i++] = A[j];
            }
            for (int j = 0; j < 3; j++) {
                temp[i++] = B[j];
            }
            for (int k = 0; k < C.length; k++) {
                for (int t = 0; t < C[0].length; t++) {
                    temp[i++] = C[k][t];
                }
            }
        }

        // fix column and add temp to d
        int k = 0;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 3; i++) {
                D[i][j] = temp[k++];
            }
        }

        // print d
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
