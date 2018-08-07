import java.util.Scanner;

class large_small
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner (System.in);
    int a[]=new int[10],large=0,small=99999;
    for(int i=0;i<10l;i++)
    {
    a[i]=sc.nextInt();
    if(large<a[i])
    large=a[i];
    if(small>a[i])
    small=a[i];
    }
    System.out.println("Large is:"+large+" small is:"+small);
  }
}
