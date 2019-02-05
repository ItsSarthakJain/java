import java.util.Scanner;
public class MaxProfit {
	  public static void main(String args[]) {
		     Scanner sc=new Scanner(System.in);
				int N=sc.nextInt();
				int arr[]=new int[N];
				for(int i=0;i<N;i++)
				{
					arr[i]=sc.nextInt();
				}
				int min=arr[0],maxProfit=0;
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i]<min)
						min=arr[i];
					if(arr[i]-min>maxProfit)
						maxProfit=arr[i]-min;
				}
				System.out.println(maxProfit);
	  } 
}
