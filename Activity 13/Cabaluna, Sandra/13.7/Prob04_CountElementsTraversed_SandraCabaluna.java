public class Prob04_CountElementsTraversed_SandraCabaluna {
    public static void main(String[] sandra) {
        double[] values = {85.5, 90.0, 78.5};
        int count = 0;
        
        for (double val : values) {
            count++;
        }
        
        System.out.println("Number of elements traversed: " + count);
    }
}