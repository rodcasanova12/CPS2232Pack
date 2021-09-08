package HW3;

//JustifiedListTest CLASS IMPLEMENTATION
public class JustifiedListTest
{
// MAIN METHOD
public static void main(String[] args)
{
    // EXAMPLE 1   
	   JustifiedList fjList1 = new JustifiedList();          
    String[] words1 = {"This", "is", "an", "example", "of", "text", "justification."};
    int maxWidth1 = 16;
   
    System.out.println("Input 1:\n");
    printInput(words1, maxWidth1);
   
    System.out.println("\nOutput 1:\n");
    fjList1.formatText(words1, maxWidth1);          
    fjList1.printFormatedList();

    // EXAMPLE 2      
    JustifiedList fjList2 = new JustifiedList();  
    String[] words2 = {"What", "must", "be", "acknowledgment", "shall", "be"};
    int maxWidth2 = 16;
   
    System.out.println("\nInput 2:\n");
    printInput(words2, maxWidth2);
   
    System.out.println("\nOutput 2:\n");
    fjList2.formatText(words2, maxWidth2);      
    fjList2.printFormatedList();

    // EXAMPLE 3   
    JustifiedList fjList3 = new JustifiedList();  
    String[] words3 = {"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain", "to", "a",
            "computer.", "Art", "is", "everything", "else", "we", "do"};
    int maxWidth3 = 20;
   
    System.out.println("\nInput 3:\n");
    printInput(words3, maxWidth3);
   
    System.out.println("\nOutput 3:\n");
    fjList3.formatText(words3, maxWidth3);      
    fjList3.printFormatedList();
   
} // END OF MAIN METHOD

// printInput METHOD
public static void printInput(String[] words, int maxWidth)
{      
    System.out.print("words = [");
    for(int i = 0; i < words.length; i++)
    {
        System.out.print("\"" + words[i] + "\"");
       
        if(i < words.length-1)
            System.out.print(", ");
    }
    System.out.println("]");
    System.out.println("maxWidth = " + maxWidth);
} 

} // END OF JustifiedListTest CLASS