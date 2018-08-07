import java.util.Scanner;
public class palindrome
{
  public static void main(String args[])
  {
    String str1=new String(),str2=new String();
    Scanner sc=new Scanner(System.in);
    str1=sc.nextLine();
    StringBuilder sb=new StringBuilder(str1);
    sb=sb.reverse();
    if(str1.equals(sb.toString()))
      System.out.println("Yes");
      else
      System.out.println("No");
  }
}
