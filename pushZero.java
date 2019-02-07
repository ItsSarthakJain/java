public class PushZerosAtEnd {
	
	public static void pushZerosAtEnd(int[] arr)
    {
      int j=0;
		for(int i=0;i<arr.length;i++)
        {
          if(arr[i]!=0)
          {
            arr[j]=arr[i];
            j++;
          }
        }
      while(j<arr.length)
      {
        arr[j]=0;
        j++;
      }
	}
}