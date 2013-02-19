package com.mansoor.datastructures;

/**
 * @author Muhammad Ashraf
 * @since 2/19/13
 */
public class QuickSort {

    public void sort(int... input) {

        sort(input, 0, input.length - 1);
    }

    private void sort(int[] input, int lo, int hi) {
        if ((lo >= hi)) {
            return;
        }

        int partition = partition(input, lo, hi);
        sort(input, lo, partition - 1);
        sort(input, partition + 1, hi);
    }

    private int partition(int[] input, int lo, int hi) {
        int left = lo;
        int right = hi + 1;

        while (true) {
            while (input[++left] < input[lo]) {
                if (left == hi) break;
            }

            while (input[--right] > input[lo]) {
                if (right == lo) break;
            }
            if (right <= left) break;
            exchange(input, right, left);
        }
        exchange(input, lo, left);

        return left;

    }

    private void exchange(int[] input, int i, int j) {
        final int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
