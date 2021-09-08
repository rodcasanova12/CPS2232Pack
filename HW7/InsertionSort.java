package HW7;
import java.util.Arrays;
class InsertionSort { 
//NON RECURSIVE INSERTION SORT	
	static void sort(int arr[])    { 
		int n = arr.length;             
		for (int i = 1; i < n; ++i) {                        
			int key = arr[i];                       
			int j = i - 1;                                 
			while (j >= 0 && arr[j] > key) {                         
				arr[j + 1] = arr[j];                            
				j = j - 1;                      
				}                       
			arr[j + 1] = key;               
			}      
		}              
	static void printArray(int arr[])       {
		int n = arr.length;             
		for (int i = 0; i < n; ++i)    
			System.out.print(arr[i] + " "); 
		System.out.println();   }      
	
//RECURSIVE INSERTION SORT
static void insertionSortRecursive(int arr[], int n)    {  
	if (n < arr.length+1)  {      
		int last = arr[n-1];          
		int j = n-2;                   
		while (j >= 0 && arr[j] > last)           {  
			arr[j+1] = arr[j];                 
			j--;            }              
		arr[j+1] = last; 
		insertionSortRecursive( arr, n+1 ); // RECURSIVE STATEMENT
	}
}
//MAIN METHOD     
public static void main(String args[])  {  
	int arr[] = { 12, 11, 13, 5, 6 };     
	int arr1[] = { 12, 11, 13, 5, 6 }; 
	System.out.println("INSERTION SORT CLASS:");    
	System.out.println("Recursive Original array: " + Arrays.toString(arr));
	sort(arr);       
	System.out.printf("Sorted Array: ");    
	printArray(arr);
	System.out.println("Recursive Original array: " + Arrays.toString(arr1));
	insertionSortRecursive(arr1,1);       
	System.out.printf("Sorted Array: ");    
	printArray(arr1);
	}
} 
