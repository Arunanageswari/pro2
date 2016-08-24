import java.util.*;
 
class ReverseString
{
   public static void main(String args[])
   {
      String str, rev = "";
      Scanner in = new Scanner(System.in);
  System.out.println("Enter a string to reverse");
     str = in.nextLine();
   int length = str.length();
    for ( int i = length - 1 ; i >= 0 ; i-- )
         rev = rev + str.charAt(i);
  System.out.println("Reverse of entered string is: "+str);
   }
}
