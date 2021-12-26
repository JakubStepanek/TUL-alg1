
public class MatrixTools {

    public static void main(String[] args) {

        double[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 6, 7, -10 } };

        double[][] b = { { 1.5, 2.3 }, { 2.7, 2.9 } };

        int[][] c = { { 3, 8, 2 }, { 1, 5, 4 }, { 2, 3, 1 }, { 2, 8, 4 } };

        // double[][] result = sum(a, b);
        // print(result);
        // print(sum(a, b));
        print(normalMatrix(a));
    }

    public static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%4d ", a[i][j]);
            }
            System.out.println();
        }
    }

    public static double[][] sum(double[][] a, double[][] b) {
        // ošetření nevalidního vstupu
        if (!(a.length == b.length && a[0].length == b[0].length)) {
            throw new IllegalArgumentException("Nevhodné rozměry");
        }
        double sum[][] = new double[a.length][a[0].length];
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }

        }
        return sum;
    }

    public static void print(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%6.2f ", a[i][j]);
            }
            System.out.println();
        }
    }

    public static double[][] normalMatrix(double[][] a) {
        double max = Double.MIN_VALUE;
        double[][] result = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (Math.abs(a[i][j]) > max) {
                    max = Math.abs(a[i][j]);
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                result[i][j] = a[i][j] / max;
            }
        }

        return result;
    }
}
