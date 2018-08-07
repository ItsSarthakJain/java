import java.util.Scanner;
public class reverse
{
  public static void main(String args[])
  {
    String str1=new String(),str2=new String();
    Scanner sc=new Scanner(System.in);
    str1=sc.nextLine();
    for(int i=str1.length()-1;i>=0;i--)
      str2+=str1.charAt(i);
      System.out.println(str2);
  }
}
