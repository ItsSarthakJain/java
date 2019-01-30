public class Solution{	
	
	public static int findUnique(int[] arr){
      int lar=arr[0];
      for(int i=0;i<arr.length;i++)
      if(lar<arr[i])
        lar=arr[i];    
      int hasharr[]=new int[lar+1];
      for(int i=0;i<arr.length;i++)
		hasharr[arr[i]]++;
      for(int i=0;i<=lar;i++)
		if(hasharr[i]==1)
          return i;
      return 0;
	}
}
