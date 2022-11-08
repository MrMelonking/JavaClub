package task8;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};



        for (int i = 0; i < numbers.length ; i++){

            for (int j = i + 1; j < numbers.length; j++){
                int number = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = number;

                System.out.println(Arrays.toString(numbers));
            }

        }

    }
}
