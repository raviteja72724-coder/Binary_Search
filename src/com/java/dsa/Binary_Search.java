package com.java.dsa;

public class Binary_Search {

    public static void main(String[] args) {

        int [] arr = {10,20,30,10,10,10,50,60,70};
        int start = 0;
        int end = arr.length-1;
        int target = 10;
        int isFound = -1;

        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]==target)
            {
                isFound = mid;
//			    end = mid - 1;                //to find first occurrence.......
//  		    start = mid + 1;              //to find last occurrence........
                break;
            }
            else if(arr[mid]<target)
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        System.out.println("Found at index "+isFound);

    }

}

