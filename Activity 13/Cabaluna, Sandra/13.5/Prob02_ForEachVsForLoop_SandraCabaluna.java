public class Prob02_ForEachVsForLoop_SandraCabaluna {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20};
        
        System.out.println("Using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
        
        System.out.println("\nUsing for-each loop:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}