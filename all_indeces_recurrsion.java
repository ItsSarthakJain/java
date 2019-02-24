
public class Solution 
{
  static int arr[]=new int[0];
  public static int[] recurrsion(int input[],int start,int x)
  {
   //  System.out.println("vh");
    if(start==input.length)
    {
     return arr;
    }
    if(input[start]==x)
    { 
      int ar[]=new int[arr.length+1];
     // System.out.println("vh");
      for(int i=0;i<arr.length;i++)
      {  
        ar[i]=arr[i];
       // System.out.println("vh");
      }
      ar[arr.length]=start;
      arr=ar;
      return recurrsion (input,++start,x);
    }
    else
      return recurrsion (input,++start,x);
  }
	public static int[] allIndexes(int input[], int x) 
    {
	//	this.input=input;	
      int len =input.length;
      if(len==0)
        return new int[0];
      else
         return recurrsion(input,0,x);
	}
	
}