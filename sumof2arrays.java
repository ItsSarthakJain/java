public class SumOfTwoArrays{	

	public static int[] sumOfTwoArrays(int[] arr1, int[] arr2)
    {
      int diff=0;
      int sum[]=new int [((arr1.length<=arr2.length)?arr2.length:arr1.length)+1];
      int k=sum.length-1;
		if(arr1.length<=arr2.length)
        {
          int j=arr1.length-1,rem=0;
          for(int i=arr2.length-1;i>=0;i--)
          {
            int sec,sm=0;
            sec=(j<0)?0:arr1[j];
            sm=arr2[i]+sec+rem;
            rem=sm/10;
            sm%=10;
            sum[k]=sm;
            k--;
            j--;
          }
          sum[k]=rem;
        }
      	else if(arr2.length<arr1.length)
        {
          int j=arr2.length-1,rem=0;
          for(int i=arr1.length-1;i>=0;i--)
          {
            int sec,sm=0;
            sec=(j<0)?0:arr2[j];
            sm=arr1[i]+sec+rem;
            rem=sm/10;
            sm%=10;
            sum[k]=sm;
            k--;
            j--;
          }
          sum[k]=rem;
        }

        return sum;
    }

}