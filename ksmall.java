import java.util.Arrays;
import java.util.Scanner;
class ksmall
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
      if(arr[i]>large)
      large=arr[i];
    }
    System.out.println();
    k=sc.nextInt();
    System.out.println();
    for(int i=0;i<=large;i++)
    {
      if(hash[i]==1)
      {
        b[j]=i;
        j++;
      }
      if(hash[i]>1)
      {
      Arrays.fill(b,j,10,i);
      j+=hash[i];
      }
    }
      System.out.println(b[k]);
  }

}
