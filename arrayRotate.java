public class ArrayRotate {	

	public static void rotate(int[] arr, int d) 
    {
      int ar[]=new int[d];
      
		for(int i=0;i<d;i++)
        {
          ar[i]=arr[i];
        }
      int j=0;
      for(int i=d;i<arr.length;i++)
      {
        arr[j]=arr[i];
        j++;
      }
      int k=0;
      while(j<arr.length)
      {
        arr[j]=ar[k];
        k++;
        j++;
      }
	}
}