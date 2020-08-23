public class exercitiuMatrix2 {
    public static void main (String[]args) {
        int[][] myMatrixInt = {{1, 7, 3}, {10, 3, 4}, {1, 2, 9}};
        int numarLinii = 3;
        int numarColoane = 3;
        for (int i = 0; i < numarLinii; i++)

        {
            for (int j = 0; j < numarColoane; j++)
                if (myMatrixInt[i][j] % 2 != 0) {
                    System.out.print(myMatrixInt[i][j] + " ");

                }

        }
    }
}
