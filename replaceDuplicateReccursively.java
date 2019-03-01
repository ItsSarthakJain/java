public class Solution {

	public static String removeConsecutiveDuplicates(String input) {
		String s=new String();
      if(input.length()!=0)
        {
          if(input.length()>=2&&input.charAt(0)==input.charAt(1))
            return removeConsecutiveDuplicates(input.substring(1));
          else
           {
            s+=input.charAt(0);
            return s+removeConsecutiveDuplicates(input.substring(1));
           }   
        }
      return s;

	}

}