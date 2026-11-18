public class Prob01_ReverseTraversal_MaryJaneSantos {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("Array in reverse order:");
        for (int m = numbers.length -1; m >= 0; m--) {
            System.out.println(numbers[m]);
        }
    }
}