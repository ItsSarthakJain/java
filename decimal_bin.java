import java.util.*;
public class Main {
	
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);		
      int i=sc.nextInt();
      StringBuilder bin=new StringBuilder("");
      while(i!=0)
      {
        if(i%2==0)
          bin.append('0');
        else 
          bin.append('1');
        i/=2;
      }
      bin.reverse();
      System.out.println(bin);
    }
}
