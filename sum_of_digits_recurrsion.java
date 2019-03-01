public class solution {

	public static int sumOfDigits(int m){
     if(m>0)
      {
	   return m%10+sumOfDigits(m/10);
      }
      else
        return m;
	}
}
