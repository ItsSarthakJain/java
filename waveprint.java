
public class Solution {

	
	// input - input 2D array
	public static void wavePrint(int a[][]){
	int flg=0;
      for(int i=0;i<a[0].length;i++)
      {
         if(flg==1)
        for(int j=a.length-1;j>=0;j--)
        {
          System.out.print(a[j][i]+" ");
          flg=0;
        }
        else
        for(int j=0;j<a.length;j++)
        {
          System.out.print(a[j][i]+" ");
          flg=1;
        }
      }

	}

	
}
