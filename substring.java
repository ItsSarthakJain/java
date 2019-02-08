
public class Solution {

	public static void printSubstrings(String str){
	//int j=0;
		for(int i=0;i<str.length();i++)
         {
          for(int j=i;j<str.length();j++)
          System.out.println(str.substring(i,j+1));
        // System.out.println(str.substring(1,0));
        }
       
	}
	

}