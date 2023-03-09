package com.company;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {4, 6, 8, 2, 9, 5, 1};
        insertionSort(arr);
        printArr(arr);

        int[] arr2 = {4, 6, 8, 2, 9, 5, 1, 14, 22, 1, 0, 5, 7};
        insertionSort(arr2);
        printArr(arr2);
    }

    static void insertionSort(int[] arr){

        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArr(int[] arr){
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println(" ");
    }
}
