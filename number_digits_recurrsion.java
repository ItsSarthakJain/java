public class Solution {

	public static int count(int n){
		if(n == 0){
			return 0;
		}
      int no=(n-=(n%10));
		int smallAns = count(no/10);
		return smallAns + 1;
	}

}