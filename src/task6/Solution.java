package task6;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        boolean check = true;

        for (int i = 2; i < number; i++){
            if (number % i == 0){
                check = false;
            }
        }
        if (check){
            System.out.println("Simple");
        }
        else {
            System.out.println("Not simple");
        }
    }
}
