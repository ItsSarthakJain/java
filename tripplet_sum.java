public class Solution{	

	public static void tripletSum(int[] arr, int x)
    {
		for(int i=0;i<arr.length;i++)
        {
          int sum=0;
          sum+=arr[i];
          for(int j=i+1;j<arr.length;j++)
          {
            sum+=arr[j];
            for(int k=j+1;k<arr.length;k++)
            {
              if((sum+arr[k])==x)
              {
                if(arr[i]<=arr[j]&&arr[i]<=arr[k]&&arr[j]<=arr[k])
                System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                
                else if(arr[i]<=arr[j]&&arr[i]<=arr[k]&&arr[k]<=arr[j])
                System.out.println(arr[i]+" "+arr[k]+" "+arr[j]);
                
                else if(arr[j]<=arr[i]&&arr[j]<=arr[k]&&arr[i]<=arr[k])
                System.out.println(arr[j]+" "+arr[i]+" "+arr[k]);
                
                else if(arr[j]<=arr[i]&&arr[j]<=arr[k]&&arr[k]<=arr[i])
                System.out.println(arr[j]+" "+arr[k]+" "+arr[i]);
                
                else if(arr[k]<=arr[i]&&arr[k]<=arr[j]&&arr[i]<=arr[j])
                System.out.println(arr[k]+" "+arr[i]+" "+arr[j]);
                
                else if(arr[k]<=arr[i]&&arr[k]<=arr[j]&&arr[j]<=arr[i])
                System.out.println(arr[k]+" "+arr[j]+" "+arr[i]);
              }
            }
            sum=arr[i];
          }
        }
	}
}
