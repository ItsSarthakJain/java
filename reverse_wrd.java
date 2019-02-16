import java.util.StringTokenizer;
public class Solution {

	// Return the reversed string. No need to print
	public static String reverseEachWord(String input) {
	StringTokenizer st=new StringTokenizer(input," ",true);
    StringBuffer sbb=new StringBuffer("");
      while(st.hasMoreTokens())
      {
       StringBuffer sb=new StringBuffer(st.nextToken());
        sb.reverse();
        sbb.append(sb);
      }
     // System.out.println("Reversed string is : " + sbb);
      return sbb.toString();
	}
}
