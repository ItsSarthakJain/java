import java.lang.*; 
public class Solution {

	public static boolean checkPalindrome(String str)
    {
		StringBuffer sb=new StringBuffer(str);
      StringBuffer rev=sb.reverse();
      if(str.equals(rev.toString()))
        return true;
      return false;
	}
}
