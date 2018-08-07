import java.io.*;
class Buffer1
{
  public static void main(String args[])
  throws IOException
  {
    BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
    int s=Integer.parseInt(b.readLine());
    System.out.println(s);
  }
}
