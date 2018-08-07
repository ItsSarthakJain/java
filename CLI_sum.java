import java.util.*;
class CLI_sum
{
  public static void main(String args[])
  {
    int s=args.length;
    int sum=0;
    System.out.println("sum of the command line imput is "+s);
    int i=0;
    while(i!=s)
    {
      sum+=Integer.parseInt(args[i]);
      i++;
    }
    System.out.println("Sum is "+sum);
  }
}
