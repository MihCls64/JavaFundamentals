public class exercitiuMatrix4 {
    public static void main(String[] args) {
        int[][] myMatrixInt = {{1, 7, 3}, {10, 3, 4}, {1, 2, 9}};
        int numarLinii = 3;
        int numarColoane = 3;
        int nrImpare = 0;
        int nrPare = 0;
        int x=5;
        for (int i = 0; i < numarLinii; i++)
        {
            for (int j = 0; j < numarColoane; j++)
            {
                if (myMatrixInt[i][j] % 2 != 0)
                {
                    nrImpare++;
                } else
                    {
                    nrPare++;


                }
            }
        }
            System.out.println(" totalul de numere impare este: " + nrImpare);
            System.out.println(" totalul de numere pare este: " + nrPare);
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(--x);

        System.out.println(x--);
    }
}
