package task7;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = {1, 0, 2, 5, 6, 4, 10, 3};

        int min = Integer.parseInt(reader.readLine());
        int max = Integer.parseInt(reader.readLine());
        int sum = 0;

        System.out.println("max index: " + max);
        System.out.println("min index: " + min);


        for (int i = min + 1; i < max; i++){

            sum = sum + numbers[i];


        }
        System.out.println(sum);
    }
}
