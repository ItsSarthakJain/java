public class Solution {
	
	public static boolean checkNumber(int input[], int x) 
    {
	  int len =input.length;
      if(len==0 )
        return false;
       int arr[]=new int[len-1];
      for(int i=0;i<arr.length;i++)
        arr[i]=input[i];
      if(input[len-1]==x)
          return true;
      else
      {  
      boolean b=checkNumber(arr,x);
      return b;
      }	
    }
}