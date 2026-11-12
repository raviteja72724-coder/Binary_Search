package com.java.dsa;

class Ceiling_Number {                             //Smallest value after Target......

    public int searchInsert(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] >= target) {
                result = arr[mid];
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 6};
        int target = 4;

        Ceiling_Number obj = new Ceiling_Number();

        int result = obj.searchInsert(arr, target);

        System.out.println("Ceiling: " + result);
    }
}