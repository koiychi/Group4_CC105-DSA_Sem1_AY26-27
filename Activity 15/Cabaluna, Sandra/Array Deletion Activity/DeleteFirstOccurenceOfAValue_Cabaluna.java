public class DeleteFirstOccurenceOfAValue_Cabaluna {

    public static void main(String[] args) {
        
        
        int[] arr = {5, 15, 25, 15, 35};
        int size = 5;

        for (int i = 1; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;

        System.out.println("Array after deletion:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


