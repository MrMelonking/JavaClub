package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        double d = (Math.pow(b,2) - 4*a*c);

        if ( d > 0 ){
            double first = (-b + Math.sqrt(d))/(2*a);
            double second = (-b - Math.sqrt(d))/(2*a);

            System.out.println(first);
            System.out.println(second);
        }
        else if (d == 0){
            double answer = (-b + Math.sqrt(d))/(2*a);

            System.out.println(answer);
        }
        else {
            System.out.println("Null");
        }
    }
}
