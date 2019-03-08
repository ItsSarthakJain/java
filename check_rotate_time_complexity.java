public class CheckRotation {	

	public static int arrayRotateCheck(int[] arr){
		int i=0,count=0;
        while(arr[i]<=arr[i+1])
        { 
            i++;  
            count++;
            if(i==arr.length-1)
                break;
        }
        if(count+1<arr.length)
        return count+1;
        return 0;
	}
}