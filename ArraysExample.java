import java.util.Arrays;
public class ArraysExample {
 public static void main(String[] args) {
 int[] numbers = {5, 3, 8, 1};
 // Sorting the array
 Arrays.sort(numbers);
 System.out.println("Sorted Array: " + Arrays.toString(numbers));
 // Searching for an element
 int index = Arrays.binarySearch(numbers, 3);
 System.out.println("Index of 3: " + index);
 // Filling the array with a specific value
 Arrays.fill(numbers, 0);
 System.out.println("Filled Array: " + Arrays.toString(numbers));
 }
}