
public class Solution {

	
	public static void swapAlternate(int[] arr){
	int n=arr.length,temp=0;
      int k=0,l=n-1;	
      for(int i=0;i<n-1;i++)
      {
        if(i%2==0)
{
        temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
}      }
     
	}
	
}
