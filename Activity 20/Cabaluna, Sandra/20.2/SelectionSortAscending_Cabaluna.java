public class SelectionSortAscending_Cabaluna {
 public static void main(String[] args) {
 int[] arr = {42, 11, 28, 7, 34};
 selectionSort(arr);
 System.out.print("Sorted Array: ");
 for (int num : arr) {
 System.out.print(num + " ");
 }
 }
 static void selectionSort(int[] arr) {
 // Outer loop controls the boundary of the sorted region
 for (int i = 0; i < arr.length - 1; i++) {
 int minIndex = i; // Assume the first element of unsorted region is the minimum
 // Inner loop scans the remaining unsorted elements
 for (int j = i + 1; j < arr.length; j++) {
 if (arr[j] < arr[minIndex]) {
 minIndex = j; // Update minIndex if a smaller element is found
 }
 }
 // Swap step: Move the found minimum element to the front of the unsorted region
 int temp = arr[minIndex];
 arr[minIndex] = arr[i];
 arr[i] = temp;
 }
 }
}