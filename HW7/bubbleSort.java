package HW7;

import java.util.Arrays;

public class bubbleSort {
//NON RECURSIVE BUBBLESORT
    public static void bubbleSortNonRecursive(int list[])
    {
        int temp;
        for(int i = 0; i < list.length; ++i) {
            for(int j = 0; j < list.length-1; ++j) {
                if(list[j] > list[j+1]) {
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }
//RECURSIVE BUBBLESORT
    public static void bubbleSortRecursive(int list[], int index) {
        if (index < list.length) {
            int temp;
            for (int j = 0; j < list.length - 1; ++j) {
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
            bubbleSortRecursive(list, index+1);// RECURSIVE STATEMENT
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 9, 4, 8, 2};
        System.out.println("BUBBLE SORT CLASS:"); 
        
        System.out.println("Non recursive Original array: " + Arrays.toString(arr));
        bubbleSortNonRecursive(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        int[] arr1 = {5, 1, 9, 4, 8, 2};
        System.out.println("Recursive Original array: " + Arrays.toString(arr1));
        bubbleSortRecursive(arr1, 0);
        System.out.println("Sorted array: " + Arrays.toString(arr1));
    }

}
