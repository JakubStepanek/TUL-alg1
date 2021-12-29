public class TESTS {
    
public static void main(String[] args) {
    int[] order = new int[10];
    for (int i = 1; i < 6; i++) {
        order[i-1] = i;
    }   
    for (int i = 0; i < order.length; i++) {
        System.out.print(order[i] + " ");
    }
}
}
