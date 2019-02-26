public class solution {

	public static double findGeometricSum(int m){
	 if(m>=0)
      {
	   return 1+(findGeometricSum(--m))*0.5;
      }
      else
      {
       return 0;
      }
	}
}
