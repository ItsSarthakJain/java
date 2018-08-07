import java.util.Scanner;
class replace_repeted
{
  public static void main(String args[])
  {
    int arr[]=new int[10];
    int hash[]=new int[9999];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<10;i++)
      arr[i]=sc.nextInt();
    System.out.println();
    for(int i=0;i<10;i++)
        {
        hash[arr[i]]++;
        if(hash[arr[i]]==1)
              System.out.println(arr[i]);
        if(hash[arr[i]]!=1)
        System.out.println("0");
      }
  }
}
