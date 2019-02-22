import java.util.*;
public class Solution {

	public static int sum(int a[]) 
    {	
      int len =a.length;
      if(len==0)
        return 0;
      int arr[]=new int[len-1];
      for(int i=0;i<arr.length;i++)
        arr[i]=a[i];
      int result=(a[len-1]+sum(arr));
      return result;
	}
}