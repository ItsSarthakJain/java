public class Intersection{
	
	public static void intersection(int[] arr1, int[] arr2){
		int hsharr1[]=new int [999999],hsharr2[]=new int [999999],flag=0;
        for(int i=0;i<arr1.length;i++)
        {
            hsharr1[arr1[i]]++;
        }
        
         for(int i=0;i<arr2.length;i++)
        {
            hsharr2[arr2[i]]++;
             
        }
        if(arr1.length>arr2.length)
        {for(int i=0;i<arr2.length;i++)
            if(hsharr1[arr2[i]]>0&&hsharr2[arr2[i]]>0)
              System.out.println(arr2[i]);}
        else
        for(int i=0;i<arr1.length;i++)
            if(hsharr1[arr1[i]]>0&&hsharr2[arr1[i]]>0)
              System.out.println(arr1[i]);
	}
}
