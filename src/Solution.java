public class Solution {
    /**
     * Given an array/list [] of integers. Construct a product array of same size such that prod[i] is equal to
     * the product of all the elements of Arr[] except Arr[i].
     * <p>
     * Notes:
     * - Array/list size is at least 2 .
     * - Array/list's numbers Will be only Positives
     * - Repetition of numbers in the array/list could occur.
     */
    public static long[] productArray(int[] numbers) {
        long[] res = new long[numbers.length];

        for (int i = 0; i < res.length; i++) {
            long product = 1;
            for (int number : numbers) {
                product *= number;
            }
            res[i] = product / numbers[i];
        }

        return res;
    }
}