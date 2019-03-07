public class ArrayRotate {	

	public static void rotate(int[] arr, int d) {
		int a[]=new int [arr.length],k=0;
        for(int i=d;i<a.length;i++)
        {  a[k]=arr[i];
        k++;}
        for(int i=0;i<d;i++)
            {  a[k]=arr[i];
               k++;
            }
        for (int i = 0; i < arr.length; i++) {
			arr[i]=a[i];
		}
        arr=a;
	}
}