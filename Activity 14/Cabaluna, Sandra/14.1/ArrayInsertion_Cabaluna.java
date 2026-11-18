public class ArrayInsertion_Cabaluna {
    public static void main(String[] sandra) {
        int[] arr = new int[5];
        int size = 4;

        // initial elements
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        int index = 2;      // where to insert
        int value = 99;     // valueto insert

        System.out.println("Before insertion:");
        for (int i = 0; i < size; i++) 
            System.out.print(arr[i] + " ");

        // check capacity
        if (size == arr.length) {
            System.out.println("\nAray full. Cannot insert.");
            System.out.println("Size is " + size);
            return;
        }

        // shift elements
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }

        // insert new value
        arr[index] = value;
        size++;

        System.out.println("\nAfter insertion:");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
}