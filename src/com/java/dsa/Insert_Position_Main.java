package com.java.dsa;

class Insert_Position_Main {

    public int searchInsert(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] >= target)
            {
                ans = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5,7,8};
        int target = 6;

        Insert_Position_Main obj = new Insert_Position_Main();

        int result = obj.searchInsert(arr, target);

        System.out.println("Insertion position: " + result);
    }
}
