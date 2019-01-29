package arrayas;
import java.util.*;
public class array {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	 if(n%2==0)
	        n++;
			int l=n/2,z=1,sz=1,zz=1;
			for(   int i=0;i<n;i++)
			{
				if(i==n)
				{
				l=1;
				z-=4;
				}
	              if(i<=(n/2))
	              {
				for(int k=l;k>0;k--)
					System.out.print(" ");
				l--;
	              }
	              else
	              {
	                for(int k=1;k<=zz;k++)
					System.out.print(" ");
	                zz++;
	              }
	              int j=1;
				for(j=1;j<=z;j++)
				{
					System.out.print(j);
				}
	          if(i==n)
	          {
	            z=n/2;
	          }
	              if(i<n/2)
	              {
	                z+=2;
	              }
				else
	            {
	              z-=2;
	            }
				System.out.println("");
				}
}
}
