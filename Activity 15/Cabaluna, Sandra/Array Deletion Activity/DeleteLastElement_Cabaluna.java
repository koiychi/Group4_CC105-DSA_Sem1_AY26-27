public class DeleteLastElement_Cabaluna {

    public static void main(String[] args) {
        
        int[] arr = {100, 200, 300, 400, 500};
        int size = 5;

        for (int i = 4; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;

        System.out.println("Array after deletion:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


