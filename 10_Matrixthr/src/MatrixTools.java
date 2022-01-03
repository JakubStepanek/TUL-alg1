/**
 * MatrixTools
 */
public class MatrixTools {

    public static void main(String[] args) {
        double[][] matrix = { { 0.5, 0.5 }, { 0.5, 0.5 } };
        double[][] matrix2 = { { 0.25, 0.25, 0.25, 0.25 }, { 0, 1, 0, 0 } };
        boolean isS = isStochasticMatrix(matrix);
        boolean isS2 = isStochasticMatrix(matrix2);

        System.out.println(isS);
        System.out.println(isS2);
    }

    public static boolean isSymetricMainDiagonal(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
    // TO-DO
    // public static boolean isSymetricSecondDiagonal(){
    // for (int i = 1; i < matrix.length; i++) {
    // for (int j = 0; j < i; j++) {
    // if (matrix[i][j] != matrix[j][i]) {
    // return false;
    // }
    // }
    // }
    // return true;
    // }

    public static boolean isStochasticMatrix(double[][] matrix) {
        int n = matrix[0].length;
        int m = matrix.length;
        double sum;
        for (int i = 0; i < m; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < 0)
                    return false;
                sum += matrix[i][j];
            }
            if (sum != 1)
                return false;
        }
        return true;
    }
}