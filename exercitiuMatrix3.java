public class exercitiuMatrix3 {
    public static void main(String[] args) {
        int[][] myMatrixInt = {{1, 7, 3}, {10, 3, 4}, {1, 2, 9}};
        int numarLinii = 3;
        int numarColoane = 3;
        System.out.println("Matricea inversata este: ");
        for (int i = numarLinii - 1; i>=0; i--) {

            for (int j = numarColoane - 1; j>=0; j--) {
                System.out.print( + myMatrixInt[i][j] + " ");
            }
            System.out.print(" \n ");

        }
    }
}