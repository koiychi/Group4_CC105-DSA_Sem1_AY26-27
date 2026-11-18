public class Problem2_ForEachForLoop_Tiongson {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20};
        System.out.println("Using for loop:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + ": " + array[i]);
        }
        System.out.println("\nUsing for-each loop:");
        for (int element : array) {
            System.out.println(element);
        }
    }
}