package HW5;

public class HeapSort {

	public static void main(String[] args){
		
		MyPriorityQueue<Integer> pQueue = new MyPriorityQueue<>();
		
		pQueue.offer(1);
		pQueue.offer(2);
		pQueue.offer(3);
		pQueue.offer(4);
		pQueue.offer(5);
		
		System.out.println("Original Queue: \n1 2 3 4 5");
		
		System.out.println("Sorted Queue: ");
		while (pQueue.getSize()>0)
			System.out.print(pQueue.poll() + " ");
	}
}