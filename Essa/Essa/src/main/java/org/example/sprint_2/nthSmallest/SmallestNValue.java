package org.example.sprint_2.nthSmallest;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SmallestNValue {

    public int nthSmallest(int[] num, int n) {
        bubbleSort(num);
        Set<Integer> uniqueValues = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            uniqueValues.add(num[i]);
        }
        if (n <= uniqueValues.size()) {
            return num[n - 1];
        } else {
            throw new IllegalArgumentException();
        }
    }

    private void bubbleSort(int array[]) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }
}
