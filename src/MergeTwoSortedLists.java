import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,3,5,64,200,356,400,420);
        List<Integer> l2 = Arrays.asList(2,3,4,63,199,256,257,300,350,380,400);
        List<Integer> res = new ArrayList<>();

        int max = Math.max(l1.size(), l2.size());
        int min = Math.min(l1.size(),l2.size());
        int i=0,j=0;

        while(i<l1.size() && j < l2.size()){
         if(l1.get(i) < l2.get(j)) {
             res.add(l1.get(i));
             i++;
         }else {
             res.add(l2.get(j));
             j++;
         }

        }
        if(i < l1.size()){
            for(int ii=i;ii<l1.size();ii++)
            res.add(l1.get(ii));
        }

        if(j < l2.size()){
            for(int ii=j;ii<l2.size();ii++)
                res.add(l2.get(ii));
        }
        System.out.println(i+"-"+j );
        System.out.println(res);




    }
}
