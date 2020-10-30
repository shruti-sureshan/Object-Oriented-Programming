class InvaliddataException extends Exception
{  
    InvaliddataException(String s)
   {  
        super(s);  
    }  
}
class Errors 
{
  int[] a={3,0,7,12,23};
void calculate() throws InvaliddataException
 {
  if(a[1]==0)
  throw new InvaliddataException("Cannot perform division");
 else
 System.out.println(a[0]/a[1]);
 }
}
class Handle
{
public static void main(String args[])
{
 Errors er=new Errors();
try
{
er.calculate();
}
catch(Exception m)
      {       
           System.out.println("Exception occured: "+m);
      }  
finally
{
          System.out.println("Sorry! Wrong place.");
}
          System.out.println("Lets continue.");
}
}
Output:
D:\shruti>java Handle
Exception occured: InvaliddataException: Cannot perform division
Sorry! Wrong place.
Lets continue.
