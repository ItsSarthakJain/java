import java.util.*;
public class Main {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
      // Write your code here
		int i=sc.nextInt(),rem,dup=i,no=0,k=0;
      while(dup!=0)
      {
        rem=dup%10;
        dup=dup/10;
        no+=(rem)*(int)(Math.pow(2,k));
        k++;
      }
      System.out.println(no);
	}
}
