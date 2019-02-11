
public class Solution {

	
	public static void findLargest(int a[][]){
		int flg=0,rw=0,cl=0,sum1=0,sum2=0,max1=0,max2=0;
	
     
      for(int i=0;i<a.length;i++)
        {
         sum1=0;
          for(int j=0;j<a[i].length;j++)
          {
            sum1+=a[i][j];
          }
       
        if(sum1>max1)
        {
          max1=sum1;
          rw=i;
        }
       }
      for(int i=0;i<a[0].length;i++)
        {
         sum2=0;
        int j=0;
          for(j=0;j<a.length;j++)
          {
            sum2+=a[j][i];
          }
       // System.out.println(sum2);
        if(sum2>max2)
        {
          max2=sum2;
         // flg=1;
         //   System.out.println("hh");
          cl=i;
        }
       }
      if(max1>=max2)
      System.out.println("row "+rw+" "+max1);//+" "+a.length+" "+a[0].length);
      else
        System.out.println("column "+cl+" "+max2);

	}

	
}
