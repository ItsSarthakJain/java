
public class Solution {

	public static void printPattern(int n){
		int k=n,z=(n*2)-1,l=0,s=n;
		for(int i=1;i<=n;i++)
        {
          while(l!=0)
          {
            System.out.print(s+" ");
            l--;
            s--;
          }
          for(int j=0;j<z;j++)
          {
            System.out.print(k+" ");
          }
          s=k+1;
          k--;
          z-=2;
          l=i-1;
          while(l!=0)
          {
            System.out.print(s+" ");
            l--;
            s++;
          }
          l=i;
          s=n;
          System.out.println();
        }
      l=n-2;
      s=n;
      z=3;
      k=2;
      int f=n-2;
		for(int i=1;i<n;i++)
        {
          while(l!=0)
          {
            System.out.print(s+" ");
            l--;
            s--;
          }
          for(int j=1;j<=z;j++)
          {
            System.out.print(k+" ");
          }
          s=k+1;
          k++;
          l=n-2;
          z+=2;
          while(s!=n+1)
          {
            System.out.print(s+" ");
            f--;
            s++;
          }
          f--;
          l=n-2-i;
          s=n;
          System.out.println();
        }
	}
}
