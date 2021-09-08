package HW5;
import java.util.ArrayList;

public class Heap<AnyType extends Comparable<AnyType>>{
	ArrayList<AnyType> arrList = new ArrayList<>();
	public Heap() {
		
	}
	public Heap (AnyType[] objects) {
		for(int i = 0; i < objects.length; i++)
			trickleUP(objects[i]);
	}
	public void trickleUP(AnyType newObject) {
		arrList.add(newObject);
		int currentIndex = arrList.size() - 1;
		
		while (currentIndex > 0) {
			int parentIndex = (currentIndex - 1) / 2;
			if (arrList.get(currentIndex).compareTo(arrList.get(parentIndex))>0){
				AnyType temp = arrList.get(currentIndex);
				arrList.set(currentIndex,  arrList.get(parentIndex));
				arrList.set(parentIndex,  temp);
			}
			else
				break;
			currentIndex = parentIndex;
		}
	}
	public AnyType trickleDown() {
		if (arrList.size() == 0) return null;
		AnyType removedObject = arrList.get(0);
		arrList.set(0, arrList.get(arrList.size() - 1));
		arrList.remove(arrList.size() - 1);
		
		int currentIndex = 0;
		while (currentIndex < arrList.size()) {
			int leftChildIndex = 2 * currentIndex +1;
			int rightChildIndex = 2 * currentIndex +2;
			
			if (leftChildIndex >= arrList.size()) break;
			int maxIndex = leftChildIndex;
			if (rightChildIndex < arrList.size()) {
				if (arrList.get(maxIndex).compareTo(arrList.get(rightChildIndex)) < 0) {
					maxIndex = rightChildIndex;
				}
			}
			if (arrList.get(currentIndex).compareTo(arrList.get(maxIndex)) < 0) {
				AnyType temp = arrList.get(maxIndex);
				arrList.set(maxIndex,  arrList.get(currentIndex));
				arrList.set(currentIndex, temp);
				currentIndex = maxIndex;
			}
			else
				break;
		}
			return removedObject;
	}
	public int getSize() {
		return arrList.size();
	}
}
