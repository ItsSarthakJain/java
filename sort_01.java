public class SortBinaryArray{	

	public static void sortBinaryArray(int[] arr){
		int n=arr.length,count=0,k=n-1;
      for(int i=0;i<n;i++)
       {   
        if(arr[i]==1)
            count++;
        arr[i]=0;
       }
      while(count!=0)
      {
        arr[k]=1;
        k--;
        count--;
      }
	}
}