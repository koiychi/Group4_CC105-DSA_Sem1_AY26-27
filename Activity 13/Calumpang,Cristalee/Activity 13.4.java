public class Prob01_ReverseTraversal_Cristalee {
    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array in reverse order:");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}