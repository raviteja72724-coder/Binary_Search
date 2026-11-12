package com.java.dsa;

class Floor_Number {                                  //Largest value below Target......

    public int searchInsert(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] <= target) {
                result = arr[mid];
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 6};
        int target = 8;

        Floor_Number obj = new Floor_Number();

        int result = obj.searchInsert(arr, target);

        System.out.println("Floor: " + result);
    }
}