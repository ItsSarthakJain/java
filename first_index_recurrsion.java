
public class Solution {

  public static int recurrsion(int input[],int start,int x)
  {
    if(input.length==start)
    {
      return -1;
    }
    if(input[start]==x)
      return start;
    else
      return recurrsion (input,++start,x);
  }
	public static int firstIndex(int input[], int x) 
    {
	    return recurrsion(input,0,x);
	}
	
}