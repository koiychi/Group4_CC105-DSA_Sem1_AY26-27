public class Prob02_ForEachVsForLoop_Cristalee {
    public static void main(String[] args) {

        int[] numbers = {5, 10, 15, 20};

        // Traditional for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // For-each loop
        System.out.println("\nUsing for-each loop:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}