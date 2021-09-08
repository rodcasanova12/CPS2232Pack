package FinalProject;

//IMPORTING COMPARATOR
import java.util.Comparator;

//CLASS TO COMPARE THE RATINGS
public class RatingComparator implements Comparator<Movie> {

	//METHOD TO COMPARE THE TWO VARIABLES AND RETURN THE RESULT
   public int compare(Movie s1, Movie s2) {
       //IT WILL COMPARE IF S1 RATING IS BIGGER THAN S2 RATING
	   if (s1.getRating() < s2.getRating())
           //WILL RETURN 1 IF S2 RATING IS BIGGER THAN S1
		   return 1; 
	   //IT WILL COMPARE IF S1 RATING IS BIGGER THAN S2 RATING
       else if (s1.getRating() > s2.getRating())
           //WILL RETURN -1 IF S1 IS BIGGER THAN S2
    	   return -1;
       //IT WILL RETURN 0 IF NONE OF THE IF STATMENTS APPLY
	   return 0;
   }
}
//LATER WILL BE ADD TO PRIORITY QUEUE IN THE TEST DEMO CLASS