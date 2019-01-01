import java.util.*;
public class Main {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt(),s,z=1,zz=1;
		while(zz<=n)
        {  
          s=(3*z)+2;
          if(s%4!=0)
            {System.out.print(s+" ");
          zz++;}
          z++;
        }
      
        
	}

}
