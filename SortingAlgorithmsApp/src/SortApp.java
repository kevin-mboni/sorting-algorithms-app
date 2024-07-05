import java.util.Scanner;

public class SortApp {

    // Bubble sort algorithm
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection sort algorithm
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter numbers separated by spaces
        System.out.println("Enter a series of numbers separated by spaces:");

        String[] inputNumbers = scanner.nextLine().split(" ");

        // Convert input strings to integers
        int[] numbers = new int[inputNumbers.length];
        for (int i = 0; i < inputNumbers.length; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }

        // Prompt user to choose sorting algorithm
        System.out.println("Choose the sorting algorithm:");
        System.out.println("1 - Bubble Sort");
        System.out.println("2 - Selection Sort");
        int choice = scanner.nextInt();

        // Sort the array based on user's choice
        switch (choice) {
            case 1:
                bubbleSort(numbers);
                break;
            case 2:
                selectionSort(numbers);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
                return;
        }

        // Display the sorted array
        System.out.println("Sorted array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
