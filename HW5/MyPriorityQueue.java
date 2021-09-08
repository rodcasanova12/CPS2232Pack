package HW5;

public class MyPriorityQueue<AnyType extends Comparable<AnyType>> {
	Heap<AnyType> myHeap = new Heap<>(); 
		public MyPriorityQueue() {
			
		}
		public void offer(AnyType newObject) {
			myHeap.trickleUP(newObject);
		}
		public AnyType poll() {
			return myHeap.trickleDown();
		}
		public boolean isEmpty() {
			if (myHeap.getSize() == 0) {
				return true;
			}
			return false;
		
		}
		public int getSize() {
			return myHeap.getSize();
		}
	}
	  