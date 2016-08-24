
import java.util.*;
import java.lang.*;
import java.io.*;
public class Test{
   public static void main(String args[]){
   	int n;
   	Sanner s=new Scanner(System.in);
      String Str = s.NextLine();
      n=str.length();
      System.out.print("Return Value :" );
      System.out.println(Str.substring(n/2, n-(n/2)) );
   }
}
