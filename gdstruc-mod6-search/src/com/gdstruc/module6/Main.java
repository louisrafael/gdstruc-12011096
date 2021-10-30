package com.gdstruc.module6;

public class Main {

    public static void main(String[] args) {

        int numbers[] = {60, 33, 12, 64, 17, 105, -53};

        //System.out.println(linearSearch(numbers, 105));
        //System.out.println(linearSearch(numbers, 420)); find a value that doesn't exist
        System.out.println(binarySearch(numbers, 33));
        //System.out.println(binarySearch(numbers, 69)); find a value that doesn't exist
    }

    /*
      Retrieve with Index = O(1)
        If we know the index of the element we are looking for the
        time complexity of retrieving that element will be the same.

      Retrieve without Index = O(n)
        The Number of elements affects the number of steps
        required to finish the operation.
    */

    public static int linearSearch(int[] input, int value)
    {
        for(int i = 0; i < input.length; i++)
        {
            if (input[i] == value)
            {
                return i;
            }
        }

        return -1;
    }

    /* BINARY SEARCH ALGORITHM
        - Data structure must be SORTED

      Steps
        1. chooses the element in the middle of the array and compares it
           against the search value
        2. if the element is equal to the search value we're done
        3. if the element is greater than the search value, search the left half of the array
        4. Otherwise, search the right half of the array

        Ex:
        Search Value: 5
        Midpoint: 16
        if(search value < midpoint) search left side
        if(search value > midpoint) search right side

        Array[] = {-50, -12, 5, 16, 42, 55, 108}
        so... since 5 < 16
        the other numbers are out of the equation {-50, -12, 5}
        so... Midpoint: -12

        is -5 equal to -12? No
        so...
        is 5 > -12? Yes
        so...

        the other numbers are out of the equation
        so now we are left with this {5}. We have found our element.
        Divide and Conquer
    */

    public static int binarySearch(int[] input, int value)
    {
        int start = 0;
        int end = input.length - 1;

        while(start <= end)
        {
            int middle = (start + end) / 2;

            if(input[middle] == value)
            {
                return middle;
            }
            else if (value < input[middle]) // value might be at left half
            {
                end = middle - 1;
            }
            else if (value > input[middle]) // value might be at right half
            {
                start = middle + 1;
            }
        }

        return -1;
    }

}
