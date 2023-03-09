package com.company;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {1,4,3,2,6,780,3,41,52,7,89,56,33,1,2,76,80,23,1,40,0};
        int[] arr2 = {4, 6, 8, 2, 9, 5, 1};

        quickSort(arr);
        printArr(arr);

        quickSort(arr2);
        printArr(arr2);
    }

    static void quickSort(int[] arr){
        int lo = 0;
        int hi = arr.length - 1;
        partitionSort(arr, lo, hi);
    }

    static void partitionSort(int[] arr, int lo, int hi){

        if(lo >= hi) return;
        medianThree(arr, lo, hi);

        int i = lo;
        int j = hi;
        int pivot = arr[i];

        while(i < j){

            while(arr[i] <= pivot && i < j){
                i++;
            }
            while(arr[j] >= pivot && i < j){
                j--;
            }
            swap(arr, i, j);
        }
        j--;
        swap(arr, j, lo);
        partitionSort(arr, j + 1, hi);
        partitionSort(arr, lo, j - 1);
    }


    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void medianThree(int[] arr, int lo, int hi){
        if(hi - lo >= 2){
            int mid = (lo + hi) / 2;

            if ((arr[hi] > arr[mid]) ^ (arr[hi] > arr[lo])) {
                swap(arr, lo, hi);
            } else if ((arr[mid] < arr[lo]) ^ (arr[mid] < arr[hi])) {
                swap(arr, mid, lo);
            }
        }else {
            if(arr[lo] > arr[hi]){
                swap(arr, hi, lo);
            }
        }
    }

    static void printArr(int[] arr){
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println(" ");
    }
}
