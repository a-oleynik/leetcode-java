package com.oleynik.interviewtraining.lesson1;

public class Spiral {
    public static int [][] spiralOrder(int N, int M) {
        int [][] matrix = new int[N][M];
        int top = 0;
        int bottom = N - 1;
        int left = 0;
        int right = M - 1;
        int maxK = N * M + 1;
        int i = 0;
        int j = 0;
        int deltai = 0;
        int deltaj = 1;
        for (int k = 1; k < maxK; k++) {
            matrix[i][j] = k;
            if (i == top && j == right && deltaj == 1) {
                deltai = 1;
                deltaj = 0;
                top++;
            } else if (i == bottom && j == right && deltai == 1) {
                deltai = 0;
                deltaj = -1;
                right--;
            } else if (i == bottom && j == left && deltaj == -1) {
                deltai = -1;
                deltaj = 0;
                bottom--;
            } else if (i == top && j == left && deltai == -1) {
                deltai = 0;
                deltaj = 1;
                left++;
            }
            i += deltai;
            j += deltaj;

        }
        return matrix;
    }

    public static void main(String[] args) {
        int N = 3;
        int M = 6;
        int [][] matrix = spiralOrder(N, M);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%1$3d ", matrix[i][j]);
            }
            System.out.println("");
        }
    }
}
