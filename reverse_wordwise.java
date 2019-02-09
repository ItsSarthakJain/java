import java.util.*;
import java.util.StringTokenizer;  
public class Solution {
	public static String reverseWordWise(String input) {
	StringTokenizer st=new StringTokenizer(input," ",true);
    String sbb=new String("");
      while(st.hasMoreTokens())
      {
       //sbb=(st.nextToken());
       // sbb.reverse();
        sbb=st.nextToken()+sbb;
      }
     // System.out.println("Reversed string is : " + sbb);
      return sbb.toString();
	}
}
