import java.util.StringTokenizer;  
public class Solution {

	public static int countWords(String str){
	
		StringTokenizer st=new StringTokenizer(str," ");
      return st.countTokens();
	}
	

}
