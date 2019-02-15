public class solution {

	public static String removeConsecutiveDuplicates(String input) {
	    char arr[]=input.toCharArray();
      String s="";
      int f=0;
      for(int i=0;i<arr.length-1;i++)
      {
       
          while(arr[i]==arr[i+1])
          {
            i++;
          if(i==arr.length-1)
          {
            break;
          }
          }
        s=s+arr[i];
      }
      if(arr[arr.length-1]!=arr[arr.length-2])
     s=s+arr[arr.length-1]; 
     return s;
	}
}
