public class Prob04_CountElementsTraversed_MaryJaneSantos {
    public static void main(String[] args) {
        double[] grades = {85.5, 90.0, 78.5};
        int count = 0;
        
        for (int i = 0; i < grades.length; i++) {
            count++;
        }
        
        System.out.println("Number of elements traversed: " + count);
    }
}