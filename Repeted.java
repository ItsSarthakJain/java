import java.util.Scanner;
public class Repeted
{
  public static void main(String args[])
  {
    String str=new String();
    int hash[]=new int[9999],index=0;
    Scanner sc=new Scanner(System.in);
    str=sc.nextLine();
    for(int i=0;i<str.length();i++)
      {
        index=(int)str.charAt(i);
        
	if(hash[index]==-1)
	continue;
	hash[index]++;
        if(hash[index]>1&&hash[index]!=-1)
	{
        System.out.println((char)index);
	hash[index]=-1;
	}
      }
  }
}
