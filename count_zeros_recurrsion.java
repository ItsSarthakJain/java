
public class solution {

	public static int countZerosRec(int m)
    {
      if(m>1)
      {
        if(m%10==0)
	    return countZerosRec(m/10)+1;
 		else
        return countZerosRec(m/10);
      }
      else
        return 0;
	}
}
