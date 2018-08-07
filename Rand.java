import java.util.Random;
class Rand
{
public static void main(String ards[])
{
Random rand=new Random();
int n=rand.nextInt(26)+1;
int key=(n+2)/3+1;
if(n==21-2||n==28-2||n==24-2||n==25)
key--;
System.out.println("Number was "+n+"\nAlphabet is "+(char)(n+64)+"\nKeypad no is "+key);
}
}