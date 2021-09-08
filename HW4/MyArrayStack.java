package HW4;

/**

* Stack implementation

*/

public class MyArrayStack<T> {

private int stackSize;

private T[] stackArr;

private int top;

/**

* constructor to create stack with size

* @param size

*/

public MyArrayStack(int size) {

this.stackSize = size;

this.stackArr = (T[]) new Object[stackSize];

this.top = -1;

}

/**

* This method adds new entry to the top

* of the stack

* @param entry

* @throws Exception

*/

public void push(T entry){

if(this.full()){

System.out.println(("Stack is full. Increasing the capacity."));

}

// System.out.println("Adding: "+entry);

this.stackArr[++top] = entry;

}

/**

* This method removes an entry from the

* top of the stack.

* @return

* @throws Exception

*/

public T pop() throws Exception {

if(this.empty()){

throw new Exception("Stack is empty. Can not remove element.");

}

T entry = this.stackArr[top--];

// System.out.println("Removed entry: "+entry);

return entry;

}

/**

* This method returns top of the stack

* without removing it.

* @return

*/

public T peek() {

return stackArr[top];

}

/**

* This method returns true if the stack is

* empty

* @return

*/

public boolean empty() {

return (top == -1);

}

/**

* This method returns true if the stack is full

* @return

*/

public boolean full() {

return (top == stackSize - 1);

}

}
