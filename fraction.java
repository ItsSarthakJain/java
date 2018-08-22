import java.util.Scanner;
import java.util.*;

class fraction
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    float profit[]=new float[4],weight[]=new float[4],temp;
       int max,s=0;
       max=sc.nextInt();
    for(int i=0;i<4;i++)
    {
      profit[i]=sc.nextFloat();
      weight[i]=sc.nextFloat();
    }
    for(int i=0;i<4;i++)
    {
      for(int j=i+1;j<3;j++)
      {
        if(profit[i]/weight[i]<profit[j]/weight[j])
        {
          temp=profit[i];
          profit[i]=profit[j];
          profit[j]=temp;
          temp=weight[i];
          weight[i]=weight[j];
          weight[j]=temp;
        }
      }
    }
  int i=0,count=0;
  while(s!=max)
  {
    if(i==4)
    break;
    if(weight[i]<=max-s)
    {
    count+=profit[i];
    s+=weight[i];
    i++;
    }
    if(weight[i]>max-s)
     {
       count+=(profit[i]/weight[i])*(max-s);
       i++;
       break;
     }
  }
  System.out.println(count);
  }
}
