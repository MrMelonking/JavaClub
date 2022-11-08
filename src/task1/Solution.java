package task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;




public class Solution {



    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        int lastNumber = number%10;
            if (lastNumber == 3){
            System.out.println("True");
        }
            else {
            System.out.println("False");
        }

    }
}
