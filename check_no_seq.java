import java.util.*;
public class Main {
	
	public static void main(String[] args) 
    
    {
      
	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt(),flag1=0,flag2=0,flag3=0,flag4=0,k=0,kk=0;	
      Integer[] a = new Integer[n]; 
      for(int i=0;i<n;i++)
      {
        a[i]=new Integer(sc.nextInt());
      }
      Integer[] arr1 =a;
      Integer[] arr2 =a;
      Arrays.sort(arr1, Collections.reverseOrder());
      Arrays.sort(arr2);
      Integer[] p1 =new Integer[n];
      Integer[] p2 =new Integer[n];
      Arrays.sort(arr1, Collections.reverseOrder());
      Arrays.sort(arr2);
     for(int i=0;i<n;i++)
      {
        if(a[i]!=arr1[i])
        {
        flag1=1;
        break;
        } 
      }
      for(int i=0;i<n;i++)
      {
        if(a[i]!=arr2[i])
        {
          flag2=1;
          break;
        } 
      }
      for(int i=0;i<n;i+=2)
      {
        p1[k]=a[i];
        k++;
      }
      for(int i=1;i<n;i+=2)
      {
        p1[kk]=a[i];
        kk++;
      }
      Integer[] p1arr1 =p1;
      Integer[] p1arr2 =p1;
     // Arrays.sort(p2, Collections.reverseOrder());
      //Arrays.sort(p1arr2);
      for(int i=0;i<k;i++)
      {
        if(p1arr1[i]!=p1[i])
        {
        flag3=1;
        break;
        } 
      }
      for(int i=0;i<k;i++)
      {
        if(p1arr2[i]!=p1[i])
        {
          flag4=1;
          break;
        } 
      }
      
      if((flag1==0&&flag2==0)&&!(flag3==0&&flag4==0))
        System.out.print("false");
      else if((flag1==0&&flag2==0)&&(flag3==0&&flag4==0))
        System.out.print("true");
        
    }
}
