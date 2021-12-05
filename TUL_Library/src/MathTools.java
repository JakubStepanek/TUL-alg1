public class MathTools {
   
    /**
     * Vypočítej cosinus
     * 
     * @param x
     * @param eps
     * @return
     */

    public static double cos(double x, double eps) {
        double clen = 1;
        double cos = 0;
        int first = 1;
        while (Math.abs(clen) > eps) {
            cos += clen;
            clen = clen * (-(Math.pow(x, 2)) / (first * first + 1));
            first += 2;
        }

        return cos;

    }

    public static double cos(double x) {
        double eps = 0.001;
        double cos = cos(x, eps);
        return cos;
        // return cos(x,eps); je kratší zápis =) =)
    }     
}
