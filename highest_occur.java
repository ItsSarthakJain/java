// highest occurring character in the String.
public class solution {

	public static char highestOccuringCharacter(String str) {
		int hasharr[]=new int[123],max=0,num=0;
      for(int i=0;i<str.length();i++)
      {
        hasharr[(int)str.charAt(i)]++;
        if(max<hasharr[(int)str.charAt(i)])
        { 
          max=hasharr[(int)str.charAt(i)];
          num=(int)str.charAt(i);
        }
      }
      char c=(char)num;
     //System.out.print(num);
      return c;
	}
}
