import java.util.*;
public class Solution {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
      	int a=1,b=1,c=a+b,k=2;
      while(k!=n)
      {
        c=a+b;
        a=b;
        b=c;
        //System.out.println(c);
        k++;
      }
      	System.out.println(c);
		
	}

}
