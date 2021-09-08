package FinalProject;
//CLASS TO SET ALL THE CONTRUCTORS, TO LATER BE EVALUATED BY THE RATINGCOMPARATOR,
//STUDENTVIEWCOMPARATOR, VIEWRATINGCOMPARATOR AND YEARCOMPARATOR.
public class Movie {
	//INICIALIZING EACH VARIABLE, WITH THEIR RESPECTIVE DATA TYPE
	   private Double rating;
	   private Float noOfStudentsSaw;
	   private Double viewPercentage;
	   private String Moviename;
	   private Float releaseYear;
	   
	 //METHOD TO SET THE VARIABLES
	   public Movie(Double viewPercentage, Float noOfStudentsSaw, Double rating, String moviename, Float releaseYear) {
	       super();
	       this.rating = rating;
	       this.noOfStudentsSaw = noOfStudentsSaw;
	       this.viewPercentage = viewPercentage;
	       this.Moviename = moviename;
	       this.releaseYear = releaseYear;
	   }
	  //SETTERS AND GETTERS METHODS
	   public Double getRating() {
	       return rating;
	   }
	   //USED MATH.ROUND METHOD TO NOT SHOW THE DECIMAL NUMBERS
	   public int getNoOfStudentsSaw() {
	       return Math.round(noOfStudentsSaw);
	   }
	   public long getViewPercentage() {
	       return Math.round(viewPercentage);
	   }
	   public String getMoviename() {
	       return Moviename;
	   }
	   public int getReleaseYear() {
	       return Math.round(releaseYear);
	   }
	   public void setRating(Double rating) {
	       this.rating = rating;
	   }
	   public void setNoOfStudentsSaw(Float double1) {
	       this.noOfStudentsSaw = double1;
	   }
	   public void setViewPercentage(Double double1) {
	       this.viewPercentage = double1;
	   }
	   public void setMoviename(String moviename) {
	       Moviename = moviename;
	   }
	   public void setReleaseYear(Float  double1) {
	       this.releaseYear = double1;
	   }
	   
	   
	   @Override
	   
	   //TOSTRING METHOD
	   public String toString() {
	       return "Movie rating=" + rating + ", noOfStudentsSaw=" + noOfStudentsSaw + ", averageRating=" + viewPercentage
	               + ", Moviename=" + Moviename + ", releaseYear=" + releaseYear + "]";
	   }
	   
	   public Movie() {
	       super();
	   }

	}


