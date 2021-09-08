package HW3;
//JustifiedList CLASS IMPLEMENTATIONUSING MY OWN MyArrayList CLASS
public class JustifiedList
{
MyArrayList<String> JustifiedList;

// DEFAULT CONTRUCTOR 
public JustifiedList()
{
	   JustifiedList = new MyArrayList<String>();
}
   
// formatText METHOD
public MyArrayList<String> formatText(String[] words, int maxWidth)
{   
	   // RETURN AN EMPTY LIST IF THE ARRAY OF WORDS IS EITHER NULL OR EMPTY
    if(words == null || words.length == 0)
    {
        return JustifiedList;
    }
           
    // REQUIRED VARIABLES DECLARED
    StringBuilder strBldr;
    int allCharsCount = 0;
    int wordWidth;
    int spacesWidth;      
    int lastIndex;      
    int eachLength;
    int extraLength;
    int count;
   
    lastIndex = 0;
    for(int i = 0; i < words.length; i++)
    {
        allCharsCount = allCharsCount + words[i].length();

        if(allCharsCount + i - lastIndex > maxWidth)
        {
            wordWidth = allCharsCount - words[i].length();
            spacesWidth = maxWidth - wordWidth;
            eachLength = 1;
            extraLength = 0;

            if(i - lastIndex - 1 > 0)
            {
                eachLength = spacesWidth / (i - lastIndex - 1);
                extraLength = spacesWidth % (i - lastIndex - 1);
            }

            strBldr = new StringBuilder();

            for(int k = lastIndex; k < i - 1; k++)
            {
                strBldr.append(words[k]);

                count = 0;
                while(count < eachLength)
                {
                    strBldr.append(" ");
                    count++;
                }

                if(extraLength > 0)
                {
                    strBldr.append(" ");
                    extraLength--;
                }
            }

            strBldr.append(words[i - 1]);
           
            while(strBldr.length() < maxWidth)
            {
                strBldr.append(" ");
            }

            JustifiedList.add(strBldr.toString());

            lastIndex = i;
            allCharsCount = words[i].length();
        }
    }

    strBldr = new StringBuilder();

    for(int i = lastIndex; i < words.length - 1; i++)
    {
        allCharsCount = allCharsCount + words[i].length();
        strBldr.append(words[i] + " ");
    }

    strBldr.append(words[words.length - 1]);

    while(strBldr.length() < maxWidth)
    {
        strBldr.append(" ");
    }
   
    JustifiedList.add(strBldr.toString());

    return JustifiedList;
} // END OF formatText METHOD

// printFormatedList METHOD
public void printFormatedList()
{
    System.out.println("[");
    for(int i = 0; i < JustifiedList.size(); i++)
    {
        System.out.println("\"" + JustifiedList.get(i) + "\"");
    }
    System.out.println("]");
} // END OF formatText METHOD

} // END OF JustifiedList CLASS
