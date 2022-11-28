import java.util.*;
import java.util.stream.*;

public class ForLambdaCondition {
    public static void main(String[] args) {
        List<Integer> ilist = new ArrayList<>();
        int s=0;
        for ( int i=0;i<=10;i++){
            ilist.add(i);
        }
        ilist=ilist.stream().filter(i->i%2==1).map(i->i*i).collect(Collectors.toList()); //collect()는 새로운 리스트를 저장한다는 의미이다.
        ilist.forEach(i->{System.out.println(i);});
        System.out.println();

        s=ilist.stream().reduce(0,Integer::sum);
        System.out.println(s);
    }

}
