import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   public static void main(String[] args)
    {
        //code to read values 
        //code to call required method
        //code to display the result
        Movie[] movies=new Movie[4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<movies.length;i++){
            int movieId=sc.nextInt(); 
            sc.nextLine();
            String director=sc.nextLine();
            int rating=sc.nextInt();
            sc.nextLine();
            int budget=sc.nextInt();
            sc.nextLine();
            movies[i]=new Movie(movieId,director,rating,budget);

        }
        String reqdirector=sc.nextLine();
        int reqrating=sc.nextInt();
        sc.nextLine();
        int reqbudget=sc.nextInt();
        int op1=findAvgBudgetByDirector(movies,reqdirector);
        if(op1<=0)
        System.out.println("Sorry - The given director has not yet directed any movie");
        else
        System.out.println(op1);
        Movie op2=getMovieByRatingBudget(movies,reqrating,reqbudget);
        if(op2==null)
        System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
        else
        System.out.println(op2.getmovieId());
    }

    public static int findAvgBudgetByDirector (Movie[] movies, String director)
      {
          //method logic
          int sum=0;
          int a=0;
          int c=0;
          for(int i=0;i<movies.length;i++){
              if(movies[i].getdirector().equalsIgnoreCase(director)){
                  c=c+1;
                  sum=sum+movies[i].getbudget();
              }
          }

          if(c!=0){
          a=sum/c;
          return a;}
          else
          return 0;
      }

    public static Movie getMovieByRatingBudget(Movie[] movies, int rating, int budget)
      {
          //method logic
          Movie movie2=null;
          for(int i=0;i<movies.length;i++){
              if(movies[i].getrating()==rating && movies[i].getbudget()==budget && movies[i].getbudget()%movies[i].getrating()==0){
                movie2=movies[i];
                break;  
              }
          }
          return movie2;
      }
}

class Movie
{
    //code to build Movie class
    private int movieId;
    private String director;
    private int rating;
    private int budget;
    public Movie(int movieId, String director, int rating, int budget){
        super();
        this.movieId=movieId;
        this.director=director;
        this.rating=rating;
        this.budget=budget;
    }
    public int getmovieId(){
        return movieId;
    }
    public String getdirector(){
        return director;
    }
    public int getrating(){
        return rating;
    }
    public int getbudget(){
        return budget;
    }
    public void setmovieId(){
        this.movieId=movieId;
    }
    public void setdirector(){
        this.director=director;
    }
    public void setrating(){
        this.rating=rating;
    }
public void setbudget(){
    this.budget=budget;
}

}


