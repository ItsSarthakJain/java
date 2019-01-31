public class Solution
 {	
	
	public static void pairSum(int[] arr, int x)
    {
       for(int i=0;i<arr.length;i++) 
      {
         for(int j=i+1;j<arr.length;j++)
          {
          if(arr[j]+arr[i]==x&&arr[j]!=-1)
            {
            if(arr[j]<arr[i])
          System.out.println(arr[j]+" "+arr[i]);
            else
              System.out.println(arr[i]+" "+arr[j]);
            //arr[i]=-1;
           //arr[j]=-1;
            }
          }
       }
	}
  
 }