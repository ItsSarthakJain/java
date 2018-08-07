import java.io.*;
class Buffer2
{
  public static void main(String args[])
  throws IOException
  {
    BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
    String s=b.readLine();
    String s2=b.readLine();
    s=s.concat(s2);
    System.out.println(s);
  }
}
