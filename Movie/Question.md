
Create Movie class with the attributes like movieId(int), director(String), rating(int), budget(int). 

Also create Solution class with the main method and implement two methods - findAvgBudgetByDirector and getMovieByRatingBudget.

findAvgBudgetByDirector method: This method will take two parameters as input- array of Movie objects and string parameter director and returns the average of the budget attribute from Movie objects directed by the director passed as parameter. If no movie with the given director is present in the array of movie objects, then the method should return 0.

getMovieByRatingBudget method: This method will take two int parameters rating and budget, along with the array of movie objects and returns the movie object, if the input parameters rating and budget, matches with the rating and budget attribute of the movie object respectively.

Also check if rating is a factor of budget. If any of the conditions are not met, then the method should return null.

For findAvgBudgetByDirector method, the main method should print the average budget as it is if the returned value is greater than 0, or it should print "Not yet directed any movie".

For getMovieByRatingBudget method, the main method should print the movieId of the returned movie object. If the returned value is null then it should print "No movie is available".

