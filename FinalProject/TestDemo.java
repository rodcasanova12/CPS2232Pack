//NAME RODRIGO CASANOVA
package FinalProject;

//THIS IS THE MAIN CLASS, WHERE WE ARE GOING TO TEST THE MOVIE, RATING COMPARATOR,
//STUDENTS VIEW COMPARATOR, VIEW RATING COMPARATOR AND YEAR COMPARATOR CLASSES.

//IMPORTING ALL THE NECESSARY METHODS 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;

//INICIALIZING TESTDEMO CLASS
public class TestDemo {

//MAIN METHOD WHERE WE ARE GOING TO IMPORT THE TXT FILE, ALSO ADD THEM TO THE
//PRIORITYQUEUE AND THEN PRINT THEM OUT IN A SORTED FORM DESIRED BY THE USER.
   public static void main(String[] args) throws IOException {

	   //DECIMAL FORMAT TO PRINT ALL THE 10 DIGITS OF THE PERCENTAGE VIEWERS
	   DecimalFormat df = new DecimalFormat("0000000000");
	   int menuItem;
	   //SCANNER METHOD TO IMPORT THE TXT FILE
       Scanner sc = new Scanner(System.in);
       //TXT FILE PATH
       String filePath = "movieRatingAll.txt";
       //USING BUFFERREADER TO IMPORT THE TXT FILE
       BufferedReader reader = new BufferedReader(new FileReader(filePath));
       //PRIORITYQUEUE 
       PriorityQueue<Movie> pqViewRating = new PriorityQueue<Movie>(5, new viewRatingComparator());
       PriorityQueue<Movie> pqYear = new PriorityQueue<Movie>(5, new YearComparator());
       PriorityQueue<Movie> pqStudentsView = new PriorityQueue<Movie>(5, new StudentViewComparator());
       PriorityQueue<Movie> pqRating = new PriorityQueue<Movie>(5, new RatingComparator());
       //INICIALIZING LINE STRING TO IMPORT THE TXT FILE LINE BY LINE AND LATER
       //SPLITING EACH LINE INTO INDEXES OF THE SPLIT ARRAY
       String line;
       //WHILE STATEMENT TO READ LINE BY LINE UNTIL IT IS NULL
       while ((line = reader.readLine()) != null) {
           //INICIALIZING THE MOVIE CLASS AS M1
    	   Movie m1 = new Movie();
    	   //DUE TO MANY ANORMALITIES IN THE INPUT TXT WE HAD TO CREATE 2 DIFFERENT SPLIT METHODS
    	   String[] split = line.split("\\s+");
           String[] split2 = line.split("\"|“|”");
           //FOR THE IF STATMENT WAS NECESSARY TO CREATE A SERIES OF CONDITIONS IN ORDER FOR THEM TO WORK
           int test = split2.length;
           
           //THIS IF STATEMENT IF THE LENGTH OF THE SPLIT2 IS EQUAL TO 1, IT WILL JUST IGNORE IT
           if (test == 1) {
        		
        //IF THE LENGTH IS LOWER THAN 3 IT WILL APPLY THE SPLIT1, WHICH USES THE WHITESPACE TO SPLIT THE TEXT	
        }  else if (test < 3) {
        //SETTING INDEX 0 TO A DOUBLE VIEW PERCENTAGE FOR COMPARISON IN THE MOVIE CLASS 
       	   m1.setViewPercentage(Double.parseDouble(split[0]));
       	//SETTING INDEX 1 TO A FLOAT N OF STUDENTS THAT SAW THE MOVIE FOR COMPARISON IN THE MOVIE CLASS    
           m1.setNoOfStudentsSaw(Float.valueOf(split[1]));
        //SETTING INDEX 2 TO A DOUBLE RATING FOR COMPARISON IN THE MOVIE CLASS 
           m1.setRating(Double.valueOf(split[2]));
        //SETTING INDEX 3 TO A STRING FOR THE MOVIE NAME IN THE MOVIE CLASS     
       	   m1.setMoviename(split[3]);
       	//SETTING INDEX 4 TO A FLOAT REALEASE YEAR FOR COMPARISON IN THE MOVIE CLASS    
       	   m1.setReleaseYear(Float.valueOf(split[4])); 
       	//ADDING THEM TO THEIR RESPECTIVE PRIORITY QUEUE 	   
       	   pqViewRating.add(m1);
       	   pqStudentsView.add(m1);
       	   pqRating.add(m1);
       	   pqYear.add(m1);
       	//IF THE LENGTH OF THE SPLIT 2 IS EQUAL 3 IT WILL USE FOR THE NAME AND YEAR OF THE MOVIE FROM THE SPLIT 2 INSTEAD
       	//OF USING FROM THE SPLIT 1, THAT HAPPENS BECAUSE INSIDE OF QUOTATION MARKS WERE ALSO WHITESPACES, BUT THEY HAD TO
       	//REPRESENT ONLY 1 INDEX SLOT   
        }else if (test == 3) {
       		
       		m1.setViewPercentage(Double.parseDouble(split[0]));
            m1.setNoOfStudentsSaw(Float.valueOf(split[1]));
            m1.setRating(Double.valueOf(split[2]));
       		m1.setMoviename(split2[1]);
       		m1.setReleaseYear(Float.valueOf(split2[2]));
       		pqViewRating.add(m1);
            pqStudentsView.add(m1);
            pqRating.add(m1);
            pqYear.add(m1);
       }
           
 }
//DURING SETTING ALL THE SPLITS WE HAD TO USE FLOAT AND DOUBLE FORMATS, DUE TO THE
//BIT SIZE REQUIRED FOR THE CALCULATIONS 
       
       //PRINT STATEMENT TO REQUEST THE USER INPUT, TO DECIDE WITH COMPARATOR
       //TO SORT AND DISPLAY IN THE OUTPUT
       System.out.println(
               "Choose the Sorting Field \n1.On View rating \n2.On Release year \n3.On Student views \n4.On Rating");
       boolean quit = false;
       do {
           System.out.print("Choose menu item: ");
           int i = 0;
           menuItem = sc.nextInt();
           switch (menuItem) {
//WE USED THE CASE METHOD TO GIVE THE USER THE OPTIONS TO CHOOSE BETWEEN WHICH
//ONE OF THE SORTING OPTIONS TO BE DISPLAYED 
           
           
           case 1:
        	   
               while (i < 1) {
            	 
                   Movie m = pqViewRating.poll();
                   System.out.println(df.format(m.getViewPercentage()) + " " + m.getNoOfStudentsSaw() + " " + m.getRating() + " " + m.getMoviename()
                           + " " + m.getReleaseYear());
                   i++;
               }
               break;

           case 2:
        	   
               while (i < 1) {
            	   
                   Movie m = pqYear.poll();
                   System.out.println(df.format(m.getViewPercentage()) + " " + m.getNoOfStudentsSaw() + " " + m.getRating() + " " + m.getMoviename()
                   + " " + m.getReleaseYear());
                   i++;
               }
               break;
           case 3:
        	   
               while (i < 1) {
            	  
                   Movie m = pqStudentsView.poll();
                   System.out.println(df.format(m.getViewPercentage()) + " " + m.getNoOfStudentsSaw() + " " + m.getRating() +  " " + m.getMoviename()
                   + " " + m.getReleaseYear());
                   i++;
               }
               break;
           case 4:
        	   
        	   while (i < 1) { 
            	   
                   Movie m = pqRating.poll();
                   System.out.println(df.format(m.getViewPercentage()) + " " + m.getNoOfStudentsSaw() + " " + m.getRating() +  " " + m.getMoviename()
                   + " " + m.getReleaseYear());
                   i++;
               }
               break;
           case 0:
               quit = true;
               break;
           default:
               System.out.println("Invalid choice.");
           }
       } while (!quit);

   }

}
