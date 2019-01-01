import java.util.*;
public class Main {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt(),ch=sc.nextInt(),k=0,z=1;
		for(int i=1;i<=n;i++)
        {
          k+=i;
          z*=i;
        }
      if(ch==1)
        System.out.println(k);
        else if(ch==2)
          System.out.println(z);
      else
         System.out.println("-1");
        
	}

}
