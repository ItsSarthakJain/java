import java.util.StringTokenizer;
public class solution {

	public static String removeAllOccurrencesOfChar(String str, char c) {
      String s=new String("");
      s+=c;
	 	StringTokenizer st=new StringTokenizer(str,s);
      StringBuffer sb=new StringBuffer("");
      while(st.hasMoreTokens())
      {
        sb.append(st.nextToken());
      }
      return sb.toString();
	}
	}
