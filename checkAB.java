public class Solution {

	public static boolean checkAB(String input) {
      
        
                //System.exit(0);
        if(input.length()>1)
        {
            if(input.charAt(input.length()-1)=='a')
            {
                if(input.length()>=2&&input.charAt(input.length()-2)=='a')
                {
                    if(input.length()==2)
                        return true;
                   else
                   return checkAB(input.substring(0,input.length()-2));
                }
                 else if(input.length()>=3&&input.charAt(input.length()-2)=='b'&&input.charAt(input.length()-3)=='b')
                 {
                     if(input.length()==3)
                        return true;
                    else
                    return checkAB(input.substring(0,input.length()-3));
                 }
                else
                    return false;
            }
            else if(input.length()>=3&&input.charAt(input.length()-1)=='b'&&input.charAt(input.length()-2)=='b')
            {
                if(input.charAt(input.length()-3)=='a')
                    if(input.length()==3)
                        return true;
                    else
                   return checkAB(input.substring(0,input.length()-3));
                else
                    return false;
            }
            
        }
      if(input.length()==1&&input.charAt(0)=='a')
        {
          // System.out.println("j");
            return true;
        }
        return false;
            
	}
}
