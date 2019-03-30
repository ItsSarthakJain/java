import java.util.*;
public class MyClass {
    public static int check(int a[])
    {
        int count=0;
        int sum=0,num=0;
        for(int j=a.length-1;j>=0;j--)
        if(a[j]>0){
        num=a[j];
            break;
        }
        for(int i=0;i<=a.length-1;i++)
        {
              sum=sum+a[i];
              if(a[i]>0)
              num=a[i];
        } 
        sum-=num;
        if(sum==num)
          count++;
        return count;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int add=0;
        int arr[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            arr2[i]=arr[i];
            add+=arr[i];
        }
        Arrays.sort(arr);
        int count=0;
        int j=n;
        int num=-1;
        for(int i=0;i<n;i++)
        {
            int add2=0;
            int temp=arr[arr.length-1-i];
            arr[arr.length-1-i]=0;
            int sum=check(arr);
            if(sum>0)
            {
                for(int s=0;s<n;s++)
                add2+=arr[s];
                num=add-add2;
                for(int l=0;l<n;l++)
                if(num==arr2[l])
               { 
                   System.out.print(l+1+" ");
                   arr2[l]=-1;
                   break;
               }
            }
            count+=sum;
            arr[arr.length-1-i]=temp;
        }
        System.out.println("");
            System.out.println(count);
    }
}
