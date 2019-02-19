public class Solution {

	public static String compress(String str) {
	char arr[]=str.toCharArray();
      String s="";
      int f=0;
      for(int i=0;i<arr.length-1;i++)
      {
       int count=0;
          while(arr[i]==arr[i+1])
          {
            i++;
            count++;
          if(i==arr.length-1)
          {
            break;
          }
          }
        s=s+arr[i];
        if(count>=1)
          s+=++count;
       /// System.out.println(count);
      }
      if(arr[arr.length-1]!=arr[arr.length-2])
     s=s+arr[arr.length-1];
      return s;
	}

}
