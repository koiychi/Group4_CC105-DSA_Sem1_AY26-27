public class DeleteFirstOccurenceOfAValue_talee {
    public static void main(String[] args){

        int[] arr = {5, 15, 25, 15, 35};
        int size = 5;

        System.out.println("Before deletion");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
            
        }

        for(int i = 1; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        
        size --;
        System.out.println("\n\nArray After deletion");
        for (int i = 0; i < size; i++) {
            System.out.print(arr [i] + " ");
        }

    }
}
