
//https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/


class Solution {
    public int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (BitSize(arr[i]) > BitSize(arr[j]) || (BitSize(arr[i]) == BitSize(arr[j]) && arr[i] > arr[j])) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr;

    }

    static int BitSize(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n - (n & (-n));
        }
        return count;
    }
}