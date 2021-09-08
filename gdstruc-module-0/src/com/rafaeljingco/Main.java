package com.rafaeljingco;

public class Main {

    public static void main(String[] args) {

        /*
        Cooking Rice (The right way)

        Let number of cups of rice be n
        Total number of steps = 2n+6
        As n grows, the number of steps grows.

        Time complexity:
        O(n) = Linear Time Complexity
        - As the number of elements grows, the number of steps of your algorithm also grows
        - (the number of elements influences the number of steps)

        O(1) = Constant Time Complexity
        - Number of Steps will always be Constant
        */

        int[] numbers = new int[5];

        numbers[0] = 90; // 100
        numbers[1] = 85; // 104
        numbers[2] = 80; // 108
        numbers[3] = 75; // 112
        numbers[4] = 70; // 116

         for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }

        /*
        x = start of the memory address
        y = each size of the element (bytes)
        i = number of element (ith element)

        Memory Address = x + (i * y)
        Ex. 100 + (4 * 4) = 116

        Retrieve with Index = O(1)
        If we know the index of the element we are looking for the
        time complexity of retrieving that element will be the same.
         */

        // Linear Search (Find the index or memory address of 75)
        int index = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] == 75)
            {
                index = i;
                break;
            }
        }

        System.out.println(index);

        /*
        Retrieve without Index = O(n)
        The Number of elements affects the number of steps
        required to finish the operation.
        */
    }
}
