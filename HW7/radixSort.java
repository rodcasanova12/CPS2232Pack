package HW7;

import java.util.Arrays;
  
class radixSort { 
  
    // A utility function to get maximum value in arr[] 
    static int getMax(int arr[]) 
    { 
        int mx = arr[0]; 
        for (int i = 1; i < arr.length; i++) 
            if (arr[i] > mx) 
                mx = arr[i]; 
        return mx; 
    } 
  
   
    static void countSort(int arr[], int exp) 
    { 
        int output[] = new int[arr.length]; // output array 
        int i; 
        int count[] = new int[10]; 
        Arrays.fill(count,0); 
  
        // Store count of occurrences in count[] 
        for (i = 0; i < arr.length; i++) 
            count[ (arr[i]/exp)%10 ]++; 
  
        // Change count[i] so that count[i] now contains 
        // actual position of this digit in output[] 
        for (i = 1; i < 10; i++) 
            count[i] += count[i - 1]; 
  
        // Build the output array 
        for (i = arr.length - 1; i >= 0; i--) 
        { 
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i]; 
            count[ (arr[i]/exp)%10 ]--; 
        } 
  
       
        for (i = 0; i < arr.length; i++) 
            arr[i] = output[i]; 
    } 
  
 // NON RECURSIVE STATEMENT   
    static void radixsort(int arr[]) 
    { 
        
        int m = getMax(arr); 
  
        for (int exp = 1; m/exp > 0; exp *= 10) 
            countSort(arr,exp); 
    } 
 // RECURSIVE RADIXSORT
    static void radixSortRecursive(int arr[],int index) {
    	if (index < arr.length + 1) {  
    		int m = getMax(arr); 
    		  for (int exp = 1; m/exp > 0; exp *= 10) 
                countSort(arr, exp); 
    	radixSortRecursive(arr,index+1); // RECURSIVE STATEMENT
        }
    	
    	}
    	
    // A utility function to print an array 
    static void print(int arr[]) 
    { 
        for (int i=0; i<arr.length; i++) 
            System.out.print(arr[i]+" "); 
    } 
  
  
    //MAIN
    public static void main (String[] args) 
    { 
        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};
        int arr1[] = {300, 45, 75, 90, 802, 24, 2, 66};
        System.out.println("RADIX SORT CLASS:"); 
        System.out.println("Non recursive Original array: " + Arrays.toString(arr));
        radixsort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        //print(arr); 
        
        System.out.println("Recursive Original array: " + Arrays.toString(arr1));
        radixSortRecursive(arr1,0);
        System.out.println("Sorted array: " + Arrays.toString(arr1));
       // print(arr1); 
    } 
} 
