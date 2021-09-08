package HW7;
import java.util.Arrays;
public class QuickSort{


//RECURSIVE QUICKSORT
public static void recursiveQuickSort(int[] arr, int startindex, int endindex){
	int index = partition(arr, startindex, endindex);
	if (startindex < index - 1) {
		recursiveQuickSort(arr, startindex, index - 1); // RECURSIVE STATEMENT

}
	if (endindex > index) { 
		recursiveQuickSort(arr, index, endindex);// RECURSIVE STATEMENT

	}

}

public static int partition(int[] arr, int l, int r) {
	int p = arr[l];
	while (l <= r) {

//searching number which is greater than p, bottom up
		while (arr[l] < p) {
			l++;

}
		while (arr[r] > p) {
			r--;

}
		if (l <= r) {
			int tmp = arr[l];
			arr[l] = arr[r];
			arr[r] = tmp;
			l++;
			r--;
			}
		}
	return l;

}

public static void main(String args[]) {
	int[] arr = { 28,95,36,45,85,99,12,8,36};
	System.out.println("QUICK SORT CLASS:"); 
	System.out.println("Original Array : " +Arrays.toString(arr));
	recursiveQuickSort(arr, 0, arr.length - 1);
	System.out.println("After recursive sorting : " + Arrays.toString(arr));
	int a[] = { 9, -3, 5, 2, 6, 8, -6, 1, 3 };
	System.out.println("Original Array : " +Arrays.toString(a));
	nonRecursiveQuickSort.iterativeQuickSort(a);
	System.out.println("After non recursive sorting : " + Arrays.toString(a));
	
	}

}
