package FinalProject;

//IMPORTING COMPARATOR
import java.util.Comparator;

//CLASS TO COMPARE THE VIEW RATING
public class viewRatingComparator implements Comparator<Movie> {

	//METHOD TO COMPARE THE TWO VARIABLES AND RETURN THE RESULT
   public int compare(Movie s1, Movie s2) {
	 //IT WILL COMPARE IF S1 RATING IS BIGGER THAN S2 
       if (s1.getViewPercentage() < s2.getViewPercentage())
    	 //WILL RETURN 1 IF S2 RATING IS BIGGER THAN S1
           return 1;
     //IT WILL COMPARE IF S1 RATING IS BIGGER THAN S2
       else if (s1.getViewPercentage() > s2.getViewPercentage())
    	   //WILL RETURN -1 IF S1 IS BIGGER THAN S2
           return -1;
     //IT WILL RETURN 0 IF NONE OF THE IF STATMENTS APPLY
       return 0;
   }
}//LATER WILL BE ADD TO PRIORITY QUEUE IN THE TEST DEMO CLASS