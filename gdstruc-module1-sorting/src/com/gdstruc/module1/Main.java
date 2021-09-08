package com.gdstruc.module1;

public class Main {

    public static void main(String[] args) {

        /* BubbleSort();
        O(n^2)
        - In-Place Algorithm
        - Quadratic time complexity
        100 steps to sort 10 items
        -- 10,000 steps to sort 100 items
        --- 1,000,000 steps to sort 1000 items

        SelectionSort();
        O(n^2) Q
        - In-Place Algorithm
        - Quadratic time complexity
        - Doesn't require as much swapping as bubble sort
        - Unstable Algorithm

         Both Sorts: As the number of elements grow, the number of steps required
         to finish the algorithm also grows exponentially.

         It's a Good Indication that it's a Quadratic time complexity algorithm
         if it has a loop inside a loop.
         */

        int[] numbers = new int[10];

        numbers[0] = 35;
        numbers[1] = 69;
        numbers[2] = 1;
        numbers[3] = 10;
        numbers[4] = -50;
        numbers[5] = 320;
        numbers[6] = 63;
        numbers[7] = 58;
        numbers[8] = 26;
        numbers[9] = 13;

        System.out.println("Before selectionSort:");
        printArrayElements(numbers);

        //bubbleSort(numbers);
        selectionSort(numbers);

        System.out.println("\n\n After selectionSort:");
        printArrayElements(numbers);

        /*
        Stable Algorithms
        - What if at index[0] = 9 and index[7] = 9.
        - Index[0] will still come before Index[7].
        - Their relative places didn't actually change.

        Unstable Algorithms
        - Their relative places might have been change.
        - If we're sorting objects, not particularly integers.
        Now, their places might have been changed, and that's not the expected output that you want.

        - Always prefer a Stable Algorithm over an Unstable Algorithm.
        - Some Stable Algorithms can be coded to be Unstable with just an equal(=) sign. (So be careful)
         */
    }

    // functions:
    private static void bubbleSort(int[] arr) {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i]; // arr[i] = 2
                    arr[i] = arr[i + 1]; // arr[i] will become 1
                    arr[i + 1] = temp; // arr[i+1] will become 2
                }
                // checks the current number to the next number
                // if current > next, they swap places
            }
        }
    }

    private static void selectionSort(int[] arr) {
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int largestIndex = 0;

            for(int i = 0; i <= lastSortedIndex; i++)
            {
                if (arr[i] > arr[largestIndex])
                {
                    largestIndex = i;
                }
            } // finds the index with the largest number

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
            // LargestIndex will swap places with the LastIndex

        }
    }

    private static void printArrayElements(int[] arr) {
        // enhanced 'for' (for every int, in our array, println)
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
