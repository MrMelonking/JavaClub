package task9;

public class Solution {
    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {5, 6, 7};

        int[] third = new int[first.length + second.length];

        System.out.println();
    }

    public int[] mergeArray(int[] first, int[] second) {

        int[] arrayC = new int[first.length + second.length];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == first.length) {
                arrayC[i] = second[i - positionB];
                positionB++;
            } else if (positionB == second.length) {
                arrayC[i] = first[i - positionA];
                positionA++;
            } else if (first[i - positionA] < second[i - positionB]) {
                arrayC[i] = first[i - positionA];
                positionB++;
            } else {
                arrayC[i] = second[i - positionB];
                positionA++;
            }
        }
        return arrayC;
    }
}
