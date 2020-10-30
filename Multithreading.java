import java.util.Scanner;
class TA extends Thread
       {
             public void run()
                  {
                     char ch='A';
                     int i;
                      for(i=0;i<=4;i++)
                            {
                                  System.out.println(ch);
                                  ch++;
                              try
                                    {
                                            sleep(100);
                                     }
                             catch(Exception e)
                                 {
                                         System.out.println("Exception occured="+e);
                                   }
                        }
         }
}


class T1 extends Thread
        {
             public void run()
                  {
                       int i;
                        for(i=1;i<=5;i++)
                          {
                                System.out.println(i);
                                 try
                                     {
                                         sleep(100);
                                      }
                              catch(Exception e)
                                 {
                                         System.out.println("Exception occured="+e);
                                   }
                  }
       }
}

class T  
        {
               public static void main(String args[])
                   {
                        TA ta=new TA();
                        T1 t1=new T1();
                         ta.start();
                         t1.start();
                    }
        }
OUTPUT:
D:\shruti>javac T.java
D:\shruti>java T
A
1
2
B
3
C
D
4
5
E
D:\shruti>


