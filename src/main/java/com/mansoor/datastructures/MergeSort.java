package com.mansoor.datastructures;

public class MergeSort {
    private int[] aux;

    public void sort(int... input) {
        aux = new int[input.length];
        sort(input, 0, input.length - 1);
    }

    private void sort(int[] input, int lo, int hi) {
        if (lo >= hi) {
            return;
        }

        int mid = lo + (hi - lo) / 2;
        sort(input, lo, mid);
        sort(input, mid + 1, hi);
        merge(input, lo, mid, hi);
    }

    private void merge(int[] input, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            aux[k] = input[k];
        }

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                input[k] = aux[j++];
            } else if (j > hi) {
                input[k] = aux[i++];
            } else if (input[i] < input[j]) {
                input[k] = aux[i++];
            } else {
                input[k] = aux[j++];
            }
        }
    }
}