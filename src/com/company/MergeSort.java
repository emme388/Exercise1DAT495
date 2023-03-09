package com.company;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {4, 6, 8, 2, 9, 5, 1};
        mergeSort(arr);
        printArr(arr);

    }

    static void mergeSort(int[] arr){
        int length = arr.length;
        if(length < 2) return;

        int mid = length/2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[length - mid];

        for(int i = 0; i < mid; i++){
            leftArr[i] = arr[i];
        }

        for(int i = mid; i < length; i++){
            rightArr[i - mid] = arr[i];
        }

        mergeSort(leftArr);
        mergeSort(rightArr);

        merge(arr, leftArr, rightArr);
    }

    static void merge(int[] arr, int[]leftArr, int[] rightArr){
        int leftSize = leftArr.length;
        int rightSize = rightArr.length;

        int i = 0, j = 0, k = 0;

        while(i < leftSize && j < rightSize){
            if(leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while(i < leftSize){
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while(j < rightSize){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    static void printArr(int[] arr){
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println(" ");
    }
}
