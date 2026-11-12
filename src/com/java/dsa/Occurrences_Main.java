package com.java.dsa;

class Occurrences_Main {

    public int firstOccurrence(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                result = mid;
                end = mid - 1;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return result;
    }

    public static int lastOccurrence(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                result = mid;
                start = mid + 1;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 2, 2, 3, 4, 5};
        int target = 2;

        Occurrences_Main om = new Occurrences_Main();
        int first = om.firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);
//        System.out.println(first);
//        System.out.println(last);

        if (first == -1) {
            System.out.println("Element not found");
        }
        else {
            int count = last - first + 1;
            System.out.println("Occurrences: " + count);
        }
    }
}
