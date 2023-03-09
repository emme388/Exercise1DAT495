package com.company;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1,2,2,3,4,4,5,6,8,10,11,12,18,20};
        System.out.println(binarySearch(arr,12));
        System.out.println(binarySearch(arr,1));

    }

    static int binarySearch(int[] arr, int item){
        int lo = 0;
        int hi = arr.length - 1;

       return improvedBinary(arr, item, lo, hi);

    }

    static int improvedBinary(int[] arr, int item, int lo, int hi){
        if(hi >= lo && hi <= arr.length - 1){
            int mid = (hi + lo) / 2;

            if(item == arr[mid]) return mid;
            if(item > arr[mid]) return improvedBinary(arr, item, mid + 1, hi);
            if(item < arr[mid]) return improvedBinary(arr, item, lo, mid - 1);
        }
        return -1;
    }
}
