package HW2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;



//Public class ArrayListReview
public class ArrayListReview<E> {
	//One ArrayList and one LinkedList with the generic type passed from the class
	public ArrayList<E>arrayList;
	public LinkedList<E>linkedList;
	//Declarations for the invoice method setting it as final
	static final String endPrices = "END_PRICES";
    static final String endInvoice = "END_INVOICE";
    static final String quit = "QUIT";
	
	//Constructor to populate the array
   ArrayListReview(int index,E value ) {
		arrayList = new ArrayList<E>(index);
		linkedList = new LinkedList<E>();
		
		for (int i = 0 ; i < index; i++) {
			arrayList.add(value);
			linkedList.add(value);
		}
		long timeToComplete = System.nanoTime();
		System.out.println("The ArrayListReview took: " + timeToComplete + "ns");
	
	}
    //Method to show the 50th Fibonacci number
	public static long FibonacciNum(int n){
		//Declared as long do to the size of it
		long FibonacciNum[] = new long[n + 1];
		long timeToComplete = System.nanoTime();
		

		int i;
		FibonacciNum[0] = 0;

		if (n > 0) {

			FibonacciNum[1] = 1;

				for (i = 2; i <= n; i++) {

					FibonacciNum[i] = FibonacciNum[i - 1] + FibonacciNum[i - 2];
	}

}
			System.out.println("The FibonacciNum took: " + timeToComplete + "ns");
			return FibonacciNum[n];
			
	}
	public static int homophone (String file) throws FileNotFoundException
	{
		Scanner input = new Scanner (new File(file));
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		while (input.hasNext())
		{
			String line = input.nextLine();
			String [] key = line.split(" ");
			if (hm.containsKey(key[1]))
			{
				hm.put(key[1], hm.get(key[1])+1);
			} else hm.put(key[1],1);
			
		}
		int max = 0;
		for (Entry<String, Integer> e: hm.entrySet() )
		{
			if (e.getValue() > max)
				max = e.getValue();
		}
		return max;
	}
	public static long fibonacci(long n)
	{
		if(n==1) return 1;
		if(n==2) return 1;
		long a=1,b=1,c;
		for(int i=2;i<n;++i)
		{
			c=a+b;
			a=b;
			b=c;
		}
		return b;
	}
	//Invoice method
	public static void Invoice() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nWrite the fruit name and quantity: ");
        //HashMap to store fruit name as key and price as value
        Map<String, Float> fruits = new HashMap<>();

        //Loop until input is not "END_PRICES"
        while (true){
        	
            String input = sc.next();

            //Come out of loop if input is "END_PRICES"
            if(input.equals(endPrices))
                break;

            float price = Float.parseFloat(sc.next());
            //add fruit to hash map
            fruits.put(input, price);
        }

        //ArrayList to store total cost of each invoice
        List<Float> totalList = new ArrayList<>();

        Float total = 0f;
        //loop until input becomes "QUIT"
        while (true){
            String input = sc.next();

            //Break out of the loop if input is "QUIT"
            if(input.equals(quit)){
                break;
            }

            //Add total price of the invoice to array list and set total to "0f" to store total of next invoice
            if(input.equals(endInvoice)){
                totalList.add(total);
                total = 0f;
                continue;
            }

            int quantity = sc.nextInt();
            total += (fruits.get(input)*quantity);
        }

        //Iterate through all objects in the total Array List and print them
        Iterator itr = totalList.iterator();
        while (itr.hasNext()){
            System.out.printf("Total: %.2f \n", itr.next());
        }
        long timeToComplete = System.nanoTime();
		System.out.println("The Invoice Method took: " + timeToComplete + "ns");

	}
	//Method to do the insertionSort
	public static void insertionSort(int newArray[]){
		int n = newArray.length;

		for (int i = 1; i < n; ++i) {

			int key = newArray[i];

			int j = i - 1;

			while (j >= 0 && newArray[j] > key) {

				newArray[j + 1] = newArray[j];

				j = j - 1;
				}

			newArray[j + 1] = key;
			
	}
		long timeToComplete = System.nanoTime();
		System.out.println("The insertionSort Method took: " + timeToComplete + "ns");

}
	//Main method
	public static void main(String[] args) throws FileNotFoundException {
		//Array to test the insertionSort method
		int arr[] = {99,34,23,5,3,56};
		//To print the Fibonacci number
		System.out.println("\nFibonacci Number 50: " + ArrayListReview.FibonacciNum(50));
		//Calling Homophones method 
		int hom = ArrayListReview.homophone("HW2-input.txt");
		System.out.println("");
		System.out.printf("Counter of Homophone: " + hom + "\n");
		//Calling Invoice method
		ArrayListReview.Invoice();
		//To print the Array before it was sorted
		System.out.println(Arrays.toString(arr));
		//Calling insertionSort method
		ArrayListReview.insertionSort(arr);
		//To print the sorted array
		System.out.println(Arrays.toString(arr));
		//To print the how many nano seconds the program took to complete all
		long timeToComplete = System.nanoTime();
		System.out.print("The whole program took: " + timeToComplete + "ns");
		
		
	}

}

/* INPUT FOR INVOCE CODE:
orange 0.80
pomegranate 2.50
plum 1.20
peach 1.00
persimmon 1.75
lime 0.60 
END_PRICES
persimmon 2
orange 3
peach 1
plum 10
pomegranate 5
END_INVOICE
peach 11
plum 5
orange 1
lime 9
END_INVOICE
QUIT 
*/
