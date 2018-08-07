import java.util.Arrays;
import java.util.Scanner;
class rearrange_pos_neg
{
  public static void main(String args[])
  {
    int arr[]=new int[10],b[]=new int[10],k=0,j=0,c[]=new int[10];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<10;i++)
    {
      arr[i]=sc.nextInt();
      if(arr[i]>=0)
      {
      b[j]=arr[i];
      j++;
      }
      else
      {
      c[k]=arr[i];
      k++;
      }
    }
    j=0;
    k=0;
    System.out.println();
    for(int i=0;i<10;i++)
    {
      if(i%2!=0)
      {
      arr[i]=b[j];
      j++;
      }
      else
      {
      arr[i]=c[k];
      k++;
      }
    }
    for(int i=0;i<10;i++)
    System.out.println(arr[i]);
  }

}
