
public class Solution {
	
	public static boolean checkMember(int n)
    {	
      	int a=0,b=1,c=1;
      while(c<=n)
      {
        c=a+b;
        a=b;
        b=c;
        if(c==n)
      return true;
      }
		if(c==n)
      return true;
      else
      return false;
      }
}
