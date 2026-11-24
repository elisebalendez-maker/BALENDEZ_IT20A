import java.util.Arrays;

public class SortingAlgorithms {

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] original = {45, 12, 78, 23, 9, 56, 34, 89, 5, 67};

        int[] bubble = original.clone();
        int[] selection = original.clone();
        int[] insertion = original.clone();

        System.out.println("Original: " + Arrays.toString(original));

        bubbleSort(bubble);
        System.out.println("Bubble Sort: " + Arrays.toString(bubble));

        selectionSort(selection);
        System.out.println("Selection Sort: " + Arrays.toString(selection));

        insertionSort(insertion);
        System.out.println("Insertion Sort: " + Arrays.toString(insertion));
    }
}