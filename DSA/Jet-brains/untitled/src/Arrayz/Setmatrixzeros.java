package Arrays;
public class Setmatrixzeros {
    public static void main(String[] args) {


        int[][] mat = {
                {0, 1, 0, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        int[][] m = new int[mat.length][mat[0].length];
        System.out.println(Arrays.deepToString(m));


        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    Arrays.fill(m[i], 1);
                    for (int k = 0; k < mat.length; k++) {
                        m[k][j] = 1;
                    }
                }

            }
        }
        System.out.println(Arrays.deepToString(m));

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (m[i][j] == 1)
                    m[i][j] = 0;
                else
                    m[i][j] = mat[i][j];
            }
        }

        System.out.println(Arrays.deepToString(m));

    }
}