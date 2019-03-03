
public class Solution {
	public static int partition(int[] input,int si,int ei)
    {
        int pivotPos=0,i=si+1,count=0;
         while(i<=ei)
        {
            /// finding no of smaller and equall elements to pivot element
            if(input[i]<=input[si])
                count++;
            i++;
        }
            //// changing the pivot position
            pivotPos=si+count;
            int temp=input[si];
            input[si]=input[si+count];
            input[si+count]=temp;
          
            
            int strt=si;
            int end=ei;
            while(strt<pivotPos&&end>pivotPos)
            {
                if(input[strt]>input[pivotPos])
                {
                    if(input[end]<=input[pivotPos])
                    {
                        temp=input[strt];
                        input[strt]=input[end];
                        input[end]=temp;
                       
                        strt++;
                        end--;
                    }
                    else
                      end--;  
                }
                else
                strt++;
            }
            
        return pivotPos;
    }
    public static void sort(int[] input,int si,int ei)
    {
        if(si>=ei)
            return;
        int pivotPos=partition(input,si,ei);
        sort(input,si,pivotPos-1);
        sort(input,pivotPos+1,ei);
    }
	public static void quickSort(int[] input) 
    {
		sort(input,0,input.length-1);
	}
	
}