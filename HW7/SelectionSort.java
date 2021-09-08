package HW7;

import java.util.Arrays;

public class SelectionSort {
	//NON RECURSIVE SELECTION SORT
    public static void selectionSortNonRecursive(int [] arr) {
    	
    	 int n = arr.length;
     	
     		for(int i =0; i<n-1;i++) {
     			int min_idx = i;
     			for (int j = i+1;j<n;j++)
     				if(arr[j]<arr[min_idx])
     					min_idx=j;
     			int temp = arr[min_idx];
     			arr[min_idx] = arr[i];
     			arr[i] = temp;
     		}    
         }
 // RECURSIVE SELECTION SORT
    public static void selectionSortRecursive(int arr[], int index) {
        
    	if (index < arr.length+1) {
    		for(int i =0; i < index-1; i++) {
    			int min_idx = i;
    			for (int j = i + 1; j < index; j++)
    				if(arr[j] < arr[min_idx])
    					min_idx = j;
    			int temp = arr[min_idx];
    			arr[min_idx] = arr[i];
    			arr[i] = temp;
    			
    			
    		}   
        selectionSortRecursive(arr,index+1); // RECURSIVE STATEMENT
    	}	
      }
    
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
    //MAIN 
  public static void main(String[] args) {
	
	int arr[] = {170, 45, 75, 90, 24, 2, 66}; 
	int arr1[] = {170, 45, 75, 90, 24, 2, 66}; 
	System.out.println("SELECTION SORT CLASS:"); 
	System.out.println("Non recursive Original array: " + Arrays.toString(arr));
	selectionSortNonRecursive(arr);
	System.out.println("Sorted array: " + Arrays.toString(arr));
	System.out.println("Recursive Original array: " + Arrays.toString(arr1));
	selectionSortRecursive(arr1,0);
    System.out.println("Sorted array: " + Arrays.toString(arr1));
	
	
  }
  
 }


