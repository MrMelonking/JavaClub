package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());

        if (number == 1){
            System.out.println(number + " гривня");
        }
        else if (number > 1){
            if (number < 5){
                System.out.println(number + " гривні");
            }
            else {
                System.out.println(number + " гривень");
            }
        }
    }
}
