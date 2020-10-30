/*WAP to read 5 names of students from command line and store them in a vector. Sort the list in alphabetical order and display using enumeration interface. */

import java.util.*;
    class Enum
    {
        public static void main(String args[])
        {
            Vector<String> v = new Vector<String>();
            v.addElement("XYZ");
            v.addElement("LMN");
            v.addElement("ABC");
            v.addElement("PQR");  
            v.addElement("GHI");         
            
            Enumeration e=v.elements();
            System.out.println("BEFORE SORTING : ");
            while(e.hasMoreElements())
            {
                System.out.println(e.nextElement());
            }

            Collections.sort(v);
            Enumeration e1=v.elements();
            System.out.println("After SORTING : ");
            while(e1.hasMoreElements())
            {
                System.out.println(e1.nextElement());
            }
        }
    }

/*
OUTPUT-
D:\shruti>javac Enum.java
D:\shruti>java Enum
BEFORE SORTING :
XYZ
LMN
ABC
PQR
GHI

After SORTING :
ABC
GHI
LMN
PQR
XYZ
D:\shruti>
*/