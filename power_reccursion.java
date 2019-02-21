public class Solution {

	public static int power(int x, int n) {
		if(n>0)
        {
          return (x*power(x,--n));
        }
      else
       return 1;
	}
}
