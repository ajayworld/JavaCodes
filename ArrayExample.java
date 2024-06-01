public class ArrayExample {
    public static void main(String[] args) {
        // Creating an array of integers
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Accessing elements of the array
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);
        
        // Modifying elements of the array
        numbers[2] = 10;
        System.out.println("Modified third element: " + numbers[2]);
        
        // Iterating through the array
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
        // Finding the sum of all elements in the array
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of array elements: " + sum);
        
        // Initializing an array with a specified size
        int size = 5;
        int[] newArray = new int[size];
        System.out.println("New array elements (initialized with default values):");
        for (int i = 0; i < size; i++) {
            System.out.println(newArray[i]);
        }
    }
}
