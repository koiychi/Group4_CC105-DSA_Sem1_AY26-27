public class Prob05_FormatOutputTraversal_SandraCabaluna {
    public static void main(String[] sandra) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}