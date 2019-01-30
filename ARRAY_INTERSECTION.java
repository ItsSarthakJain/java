public class Solution{	
	
	public static void intersections(int[] arr1, int[] arr2){
	  for(int i=0;i<arr1.length;i++) 
      for(int j=0;j<arr2.length;j++)
      {
		if(arr1[i]==arr2[j]&&arr1[i]!=-1&&arr2[j]!=-1)
        {
        System.out.println(arr2[j]);
        arr1[i]=-1;
          arr2[j]=-1;
        }
      }
	}
}
