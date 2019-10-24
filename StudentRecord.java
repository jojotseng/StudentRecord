public class StudentRecord
{
   //contains scores.length values and scores.length > 1
   private int [] scores;
   
   //Constructs a StudentRecord object with an array of scores.
   public StudentRecord(int [] s)
   {
      scores = s;
   }
   
   /** returns the average (arithmetic mean) of the values in scores
    *  whose subscripts are between first and last, inclusive
    *  PRECONDITION: 0 <= first <= last < scores.length
    */
   public double average(int first, int last)
   {
      double sum=0.0;
      for(int i=first; i<=last;i++)
      {
          sum+=scores[i];
          sum/= ((last-first)+1);
      }
      return sum;

   }
    
   /** returns true if each successive value in scores is greater than
    *  or equal to the previous value; false otherwise.
    */
   private boolean hasImproved()
   {
       boolean isIncreasing=true;
       for (int i=scores.length-1 ; i>=1 ; i--)
       if (scores[i-1]>scores[i])
       
           isIncreasing = false;
            return isIncreasing; //here so the class compiles
   }  
   
   /** if the values in scores have improved, returns the average of
    *  the elements in scores with indexes greater than or equal to 
    *  scores.length/2; otherwise, returns the average of all the 
    *  values in scores
    */
   public double finalAverage()
   {
       if(hasImproved())
       {
           return average(scores.length/2,scores.length-1);
       }
       else
       {
           return average(0,scores.length-1);
       }
   } 
}