public class CheckRotation {	

	public static int arrayRotateCheck(int[] arr){
          int i=0;
          while((arr[i]<=arr[i+1]))
          {
            i++;
            if(i>=arr.length||(i+1)>=arr.length)
              break;
         }
     ++i; 
      return ((i==arr.length)?0:i);
	}
}