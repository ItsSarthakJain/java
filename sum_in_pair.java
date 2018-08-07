import java.util.Scanner;
class sum_in_pair
{
  public static void main(String args[])
  {
    int arr[]=new int[10],sum=0;
    int hash[]=new int[9999];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<10;i++)
    {
      arr[i]=sc.nextInt();
      hash[arr[i]]=9;
    }
    System.out.println();
    sum=sc.nextInt();
    System.out.println();
    for(int i=0;i<10;i++)
      if(hash[sum-arr[i]]==9)
        System.out.println(arr[i]+"+"+(sum-arr[i]));
  }
}
