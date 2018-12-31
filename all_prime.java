import java.util.*;
public class Solution {
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),flag=0;
		for(int j=2;j<=n;j++)
		{
			flag=0;
			for(int i=2;(i*i)<=j;i++)
			{
				if(j%i==0)
				 {
					flag=1;
					break;
				 }
			}
			if(flag!=1)
			System.out.println(j);
		
		}
		}

}
