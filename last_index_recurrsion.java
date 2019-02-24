
public class Solution {

  public static int recurrsion(int input[],int start,int x)
  {
    if(start==0)
    {
      return -1;
    }
    if(input[start]==x)
      return start;
    else
      return recurrsion (input,--start,x);
  }
  
	public static int lastIndex(int input[], int x) 
    {
		return recurrsion(input,input.length-1,x);
	}
	
}