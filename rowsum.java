import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      int m=sc.nextInt(),n=sc.nextInt();
      int a[][]=new int [m][n];
      for(int i=0;i<m;i++)
        {
          for(int j=0;j<n;j++)
             a[i][j]=sc.nextInt();
        }
       for(int i=0;i<m;i++)
        {
         int sum=0;
          for(int j=0;j<n;j++)
          {
            sum+=a[i][j];
          }
         System.out.print(sum+" ");
       }
	}
}
