import java.util.Scanner;
public class anagram
{
  public static void main(String args[])
  {
    String str1=new String(),str2=new String();
    Scanner sc=new Scanner(System.in);
    int sum1=0,sum2=0;
    str1=sc.nextLine();
    str2=sc.nextLine();
    int flag=0;
    if(str1.length()!=str2.length())
    System.out.println("no");
    else
    {
    for(int i=0;i<str1.length();i++)
     {
       sum1+=(int)str1.charAt(i);
       sum2+=(int)str2.charAt(i);
     }
     if(sum1==sum2)
    System.out.println("yes");
    else
      System.out.println("no");
    }
  }
}
