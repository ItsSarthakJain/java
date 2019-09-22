import java.util.Scanner;

public class FindMinAvg {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int min=Integer.MAX_VALUE;
        int divisions=0;
        int sum_of_minimums=0;

        while(true)
        {
            int input=sc.nextInt();
            if(input%2==0&&input>0)
            {
                if(input<min)
                   min=input;
            }
            else if(input%2!=0||input<0)
            {
                if(min!=Integer.MAX_VALUE)
                    sum_of_minimums+=min;
                else
                    divisions-=1;
                divisions+=1;
                min=Integer.MAX_VALUE;
                if (input<0)
                    break;
            }
        }
        System.out.println(sum_of_minimums/divisions);
    }
}
