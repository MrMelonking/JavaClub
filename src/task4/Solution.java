package task4;


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++){
            System.out.println(2 * i - 1);
            sum += 2 * i - 1;
        }
        System.out.println("Number of odd numbers: " + number + " Sum of odd numbers: " + sum);
    }
}
