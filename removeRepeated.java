import java.util.Scanner;
public class removeRepeated
{
  public static void main(String args[])
  {
    int arr[]=new int[10];
    int hash[]=new int[9999];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<10;i++)
      arr[i]=sc.nextInt();
      for(int i=0;i<10;i++)
        {
          if(hash[arr[i]]==-1)
          continue;
        hash[arr[i]]++;
        if(hash[arr[i]]==1)
              System.out.println(i);
        if(hash[arr[i]]>1)
        {
        System.out.println(i);
        hash[arr[i]]=-1;
        }
      }
  }
}
