public class SecondLargest{	
	
	public static int secondLargestElement(int[] arr) 
    {
      if(arr.length==1)
        return Integer.MIN_VALUE;
      int max=Integer.MIN_VALUE;
      int hashArr[]=new int[1000000];
		for(int i=0;i<arr.length;i++)
        {
          if(max<arr[i])
            max=arr[i];
          hashArr[arr[i]]=1;
        }
      for(int i=max-1;i>=0;i--)
        if(hashArr[i]==1)
          return i;
      return Integer.MIN_VALUE;
	}
}