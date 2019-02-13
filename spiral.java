public class solution {

	public static void spiralPrint(int a[][]){
		// Write your code here
      int rowStart = 0;
      int colStart = 0;
      int rowEnd = a.length-1;
      int colEnd = a[0].length-1;
      int count = 0;
      while(count < a.length*a[0].length){
        for(int i = colStart;i<=colEnd;i++)
        {
          System.out.print(a[rowStart][i]+" ");
          count++;
        }
        rowStart++;
        for(int i=rowStart;i<=rowEnd;i++)
        {
           System.out.print(a[i][colEnd]+" ");
          count++;
        }
        colEnd--;
        for(int i=colEnd;i>=colStart;i--)
        {
          System.out.print(a[rowEnd][i]+" ");
          count++;
        }
        rowEnd--;
        for(int i=rowEnd;i>=rowStart;i--)
        {
          System.out.print(a[i][colStart]+" ");
          count++;
        }
        colStart++;
        
      }
	}
}