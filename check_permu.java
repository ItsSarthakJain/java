import java.util.Arrays;
public class solution {

	public static boolean isPermutation(String a, String b) {
       if(a.length()!=b.length())
      return false;
      char input1[]=a.toCharArray();
    char input2[]=b.toCharArray();  
      Arrays.sort(input1);
      Arrays.sort(input2);
      if(Arrays.equals(input1,input2))
      return true;
      return false;
	}
}
