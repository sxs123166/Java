package 排序;

import ClassDemo.Array;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{20,10,30,60,90,120,110};
          // 冒泡排序
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if(arr[j] > arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }

        quickSort(arr,0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if(low >= high) return;

        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (j > i && arr[j] >= pivot) j--;
            arr[i] = arr[j];
            while (i < j && arr[i] <= pivot) i++;
            arr[j] = arr[i];
        }
        arr[j] = pivot;

        quickSort(arr, low, j-1);
        quickSort(arr, j+1, high);
    }

}
