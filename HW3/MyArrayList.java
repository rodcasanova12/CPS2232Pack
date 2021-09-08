package HW3;

public class MyArrayList<E> {
	private final int DEFAULT_CAPACITY = 10;
	private E[] list;
	private int numberOfElements;

	   // DEFAULT CONTRUCTOR
	   public MyArrayList()
	   {
	       list = (E[]) new Object[DEFAULT_CAPACITY];
	       numberOfElements = 0;
	   }
	   // PARAMETERIZED CONTRUCTOR
	   public MyArrayList(E[] elements)
	   {
	       for(int i = 0; i < elements.length; i++)
	       {
	           add(elements[i]);
	       }
	   }

	   // ADD METHOD
	   public void add(E element)
	   {
	       add(numberOfElements, element);
	   }

	   // ADD METHOD IMPLEMENTATION 
	   public void add(int position, E element)
	   {
	       ensureCapacity();

	       for(int i = numberOfElements - 1; i >= position; i--)
	       {
	           list[i + 1] = list[i];
	       }

	       list[position] = element;
	       numberOfElements++;
	   }

	   // SET METHOD
	   public E set(int position, E element)
	   {
	       if(position < 0 || position >= numberOfElements)
	           return null;

	       E oldElement = list[position];
	       list[position] = element;

	       return oldElement;
	   }

	   // REMOVE METHOD
	   public boolean remove(E element)
	   {
	       if(indexOf(element) >= 0)
	       {
	           remove(indexOf(element));
	           return true;
	       }

	       return false;
	   }

	   // REMOVE METHOD IMPLEMENTATION
	   public E remove(int position)
	   {
	       if(position < 0 || position >= numberOfElements)
	           return null;

	       E element = list[position];
	       for(int j = position; j < numberOfElements - 1; j++)
	       {
	           list[j] = list[j + 1];
	       }

	       list[numberOfElements - 1] = null;
	       numberOfElements--;

	       return element;
	   }

	   // CONTAINS METHOD
	   public boolean contains(E element)
	   {
	       for(int i = 0; i < numberOfElements; i++)
	       {
	           if(element.equals(list[i]))
	               return true;
	       }

	       return false;
	   }

	   // GET METHOD
	   public E get(int position)
	   {
	       if(position < 0 || position >= numberOfElements)
	           return null;

	       return list[position];
	   }

	   // indexOf METHOD
	   public int indexOf(E element)
	   {
	       for(int i = 0; i < numberOfElements; i++)
	       {
	           if(element.equals(list[i]))
	               return i;
	       }

	       return -1;
	   }

	   // lastIndexOf METHOD
	   public int lastIndexOf(E element)
	   {
	       for(int i = numberOfElements - 1; i >= 0; i--)
	       {
	           if(element.equals(list[i]))
	               return i;
	       }

	       return -1;
	   }

	   // isEmpty METHOD
	   public boolean isEmpty()
	   {
	       return numberOfElements == 0;
	   }

	   // size METHOD
	   public int size()
	   {
	       return numberOfElements;
	   }

	   // trimToSize METHOD
	   public void trimToSize()
	   {
	       E[] newList = (E[]) (new Object[numberOfElements]);
	       for(int i = 0; i < numberOfElements; i++)
	       {
	           newList[i] = list[i];
	       }
	       list = newList;
	   }

	   // clear METHOD
	   public void clear()
	   {
	       list = (E[]) new Object[DEFAULT_CAPACITY];
	       numberOfElements = 0;
	   }
	  
	   // toString METHOD
	   public String toString()
	   {
	       StringBuilder result = new StringBuilder("[");
	       for(int i = 0; i < numberOfElements; i++)
	       {
	           result.append(list[i]);
	           if(i < numberOfElements - 1)
	               result.append(", ");
	       }
	       return result.toString() + "]";
	   }

	   // ensureCapacity METHOD
	   private void ensureCapacity()
	   {
	       if(numberOfElements >= list.length)
	       {
	           E[] newList = (E[]) (new Object[numberOfElements * 2 + 1]);

	           for(int i = 0; i < list.length; i++)
	           {
	               newList[i] = list[i];
	           }

	           list = newList;
	       }
	   }
	 // END OF MyArrayList CLASS
}	
	