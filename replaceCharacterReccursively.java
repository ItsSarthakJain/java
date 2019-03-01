
public class Solution {

	public static String replaceCharacter(String input, char c1, char c2) {
		String s=new String();
      if(input.length()!=0)
        {
          if(input.charAt(0)==c1)
            return s+c2+replaceCharacter(input.substring(1),c1,c2);
          else
           {
            s+=input.charAt(0);
            return s+replaceCharacter(input.substring(1),c1,c2);
           }   
        }
      return s;

	}
}
