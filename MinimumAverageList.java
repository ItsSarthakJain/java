import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class MinimumAverageList {



    public static ArrayList<List> splitArrayList(ArrayList arrayList){

        ArrayList<List> listOfArrays=new ArrayList<List>();
        AtomicInteger previousIndex= new AtomicInteger();
        previousIndex.set(0);

        arrayList.forEach((element) -> {if ((Integer)element%2!=0) {

            listOfArrays.add(arrayList.subList(previousIndex.get(),arrayList.indexOf(element)));
            previousIndex.set(arrayList.indexOf(element)+1);

        }});

        listOfArrays.add(arrayList.subList(previousIndex.get(),arrayList.size()-1));

        return listOfArrays;
    }

    public static int minimumAverage(ArrayList arrayList){

        ArrayList<List> sublist=splitArrayList(arrayList);

        int subListSize=sublist.size();
        int minimumSum=0;

        for (List list:sublist) {
            list.sort(Comparator.naturalOrder());
            minimumSum+=(int)list.get(0);
        }

        int minimumAverage=minimumSum/subListSize;

        return minimumAverage;
    }
    public static void main(String[] args) {

        ArrayList<Integer> arrayList=new ArrayList<Integer>();

        Scanner scanner=new Scanner(System.in);

        while(true)
        {
            int input = scanner.nextInt();

            if(input<0)
                break;

            arrayList.add(input);

        }

        System.out.println("Average of minimums is:"+minimumAverage(arrayList));

    }

}
