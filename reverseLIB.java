import java.util.Scanner;
public class reverseLIB
{
  public static void main(String args[])
  {
    String str1=new String(),str2=new String();
    Scanner sc=new Scanner(System.in);
    str1=sc.nextLine();
    StringBuilder sb=new StringBuilder(str1);
    sb.reverse();
      System.out.println(sb);
  }
}
