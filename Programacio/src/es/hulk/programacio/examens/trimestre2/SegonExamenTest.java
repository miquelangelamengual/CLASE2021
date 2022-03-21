package es.hulk.programacio.examens.trimestre2;

public class SegonExamenTest {

    public static void main(String[] args) {
        int[][] A = {{1, 0, 0}, {3, 4, 2}};
        int[][] B = {
                {2,1},
                {0,3},
                {1,0}};

        int[][] C = MultiplicacioArray.multiplica(A,B);

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
