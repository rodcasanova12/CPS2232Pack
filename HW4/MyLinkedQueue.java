package HW4;

interface QueueInterface {

public void enqueue(Object item);

// Effect: Adds item to the rear of this queue.

// Precondition: This queue is not full.

// Postcondition: item is at the rear of this queue.

public Object dequeue();

// Effect: Removes front element from this queue and returns it.

// Precondition: This queue is not empty.

// Postconditions: Front element has been removed from this queue.

// Return value = (the removed element)

public boolean isEmpty();

// Effect: Determines whether this queue is empty.

// Postcondition: Return value = (this queue is empty)

public boolean isFull();

// Effect: Determines whether this queue is full.

// Postcondition: Return value = (queue is full)

public int size();

}
public class MyLinkedQueue implements QueueInterface {

private class QueueNode

// Used to hold references to queue nodes for the linked queue

// implementation

{

private Object info;

private QueueNode link;

}

private QueueNode front; // reference to the front of this queue

private QueueNode rear; // reference to the rear of this queue

public MyLinkedQueue()

// Constructor

{

front = null;

rear = null;

}

public void enqueue(Object item)

// Adds item to the rear of this queue.

{

QueueNode newNode = new QueueNode();

newNode.info = item;

newNode.link = null;

if (rear == null)

front = newNode;

else

rear.link = newNode;

rear = newNode;

}

public Object dequeue()

// Removes front element from this queue and returns it.

{

Object item;

item = front.info;

front = front.link;

if (front == null)

rear = null;

return item;

}

public boolean isEmpty()

// Determines whether this queue is empty.

{

if (front == null)

return true;

else

return false;

}

public Object peek()

// Determines whether this queue is empty.

{

if (front == null)

return null;

else

return front.info;

}

public int size()

// Determines whether this queue is empty.

{

QueueNode curr = front;

int count = 0;

while (curr != null) {

++count;

curr = curr.link;

}

return count;

}

public String toString()

// Determines whether this queue is empty.

{

QueueNode curr = front;

String res = "";

while (curr != null) {

res = res + curr.info + " ";

curr = curr.link;

}

return res;

}

@Override

public boolean isFull() {

// TODO Auto-generated method stub

return front==null;

}

public static void main(String args[]) {

MyLinkedQueue queue = new MyLinkedQueue();

queue.enqueue("dog");

queue.enqueue("cat");

queue.enqueue("mouse");

queue.enqueue("pig");

queue.enqueue("bird");

System.out.println(queue.toString());

System.out.println("Queue Size: " + queue.size());

queue.enqueue("puppy");

System.out.println(queue.toString());

System.out.println("Queue Size: " + queue.size());

queue.dequeue();

queue.dequeue();

System.out.println("Queue Size: " + queue.size());

queue.dequeue();

System.out.println(queue.peek());

queue.dequeue();

queue.dequeue();

System.out.println("Queue Size: " + queue.size());

System.out.println("Queue IsEmpty: " + queue.isEmpty());

}

}

