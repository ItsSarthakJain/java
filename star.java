import java.util.*;
public class star {
	  public static void main(String args[]) {
		     Scanner sc=new Scanner(System.in);
				int N=sc.nextInt();
				int str=2,sp=0;
				for(int i=0;i<(N*2)-1;i++)
				{
					if(i<=N-1)
					{
						for(int j=0;j<N-i;j++)
							System.out.print("*");
						for(int z=0;z<sp;z++)
							System.out.print(" ");
						for(int j=0;j<N-i;j++)
							System.out.print("*");
						sp+=2;
					}
					if(i==N-1)
						sp-=4;
					else if(i>N-1)
					{
						for(int j=0;j<str;j++)
							System.out.print("*");
						for(int z=0;z<sp;z++)
							System.out.print(" ");
						for(int j=0;j<str;j++)
							System.out.print("*");
						str++;	
						sp-=2;
					}
					System.out.println("");
				}
		    }
}
