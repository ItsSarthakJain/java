import java.util.Arrays;
import java.util.Scanner;
class first_repeted
{
  public static void main(String args[])
  {
    int arr[]=new int[10],b[]=new int[10],k=0,large=0,j=0;
    int hash[]=new int[9999];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<10;i++)
    {
      arr[i]=sc.nextInt();
      hash[arr[i]]++;
      if(hash[arr[i]]>1)
      {
      System.out.println(arr[i]);
      break;
      }
    }
  }

}
