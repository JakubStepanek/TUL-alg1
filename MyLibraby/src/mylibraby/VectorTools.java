package mylibraby;

public class VectorTools {

    /**
     * Navrátí délku zadaného 3D vektoru
     * 
     * @param x
     * @param y
     * @param z
     * @return
     */
    public static double lenght(double x, double y, double z) {
        double lenght = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));

        return lenght;
    }
}