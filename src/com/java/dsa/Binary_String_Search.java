package com.java.dsa;

class Binary_Search_Strings {

    public static void main(String[] args) {

        String[] arr = {"Apple", "Banana", "Grapes", "Mango", "Orange", "Papaya"};
        int start = 0;
        int end = arr.length-1;
        String target = "Mango";
        int isFound = -1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid].equals(target))
            {
                isFound = mid;
                break;
            }
            else if(arr[mid].compareTo(target)<0)
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        System.out.println("Found at Index: "+isFound);

    }

}
