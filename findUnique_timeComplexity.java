public class FindUnique{	

	public static int findUnique(int[] arr){
		int hsharr[]=new int [999999],flag=0;
        for(int i=0;i<arr.length;i++)
        {
            hsharr[arr[i]]++;

        }
        for(int i=0;i<arr.length;i++)
           if(hsharr[arr[i]]==1)
               return arr[i];
        
    return 0;
	}
}