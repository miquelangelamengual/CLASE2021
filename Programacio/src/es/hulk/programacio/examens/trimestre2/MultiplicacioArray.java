package es.hulk.programacio.examens.trimestre2;

public class MultiplicacioArray {

    public static int[][] multiplica(int[][] A, int[][] B) {

        if (A[0].length != B.length) {
            throw new IllegalArgumentException("No Multiplicables");
        }

        int[][] C = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return C;
    }

}
