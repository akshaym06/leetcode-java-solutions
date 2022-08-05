package array;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,3};
        int[] array2 = new int[]{1,9};

        System.out.println(Arrays.toString(plusOne(array1)));
        System.out.println(Arrays.toString(plusOne(array2)));
    }

    public static int[] plusOne(int[] digits) {
        int len = digits.length;

        for (int i = len-1; i>=0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            }else {
                digits[i] += 1;
                return digits;
            }
        }

        int[] arr = new int[len+1];
        arr[0] = 1;
        return arr;
    }
}
