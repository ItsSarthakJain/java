import java.util.Scanner;
public class permutations
{
  public static void main(String args[])
  {
    String str1=new String();
    Scanner sc=new Scanner(System.in);
    str1=sc.nextLine();
    double fact=1;
    for(int i=str1.length();i>0;i--)
        fact*=i;
      System.out.println(fact);
  }
}
