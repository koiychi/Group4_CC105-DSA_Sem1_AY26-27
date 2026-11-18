public class Problem4_CountElementsTraversed {
    public static void main(String[] args) {
        double[] array = {85.5, 90, 78.5};
        int count = 0;
        for (int i = 0; i < array.length; i++) { count++; }
        System.out.println("Number of elements traversed: " + count);
    }
}
