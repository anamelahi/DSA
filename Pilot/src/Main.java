import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 3,4, 5};
        int elementToRemove = 3;

        int[] newArray = removeElement(numbers, elementToRemove);
        System.out.println(Arrays.toString(newArray));  // Output: [1, 2, 4, 5]
    }

    public static int[] removeElement(int[] array, int element) {
        int count = 0;

        // Count how many times the element appears
        for (int num : array) {
            if (num == element) {
                count++;
            }
        }

        // If element is not found, return the original array
        if (count == 0) {
            return array;
        }

        // Create a new array with a smaller size
        int[] newArray = new int[array.length - count];
        int index = 0;

        // Copy elements except the one to be removed
        for (int num : array) {
            if (num != element) {
                newArray[index++] = num;
            }
        }

        return newArray;
    }
}
