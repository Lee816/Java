import java.util.function.*;
import java.util.*;

public class ForCondition3 {
    public static void main(String[] args) {
        List<Integer> ilist = new ArrayList<>();
        int s=0;
        for(int i=0; i<=100;i++){
            ilist.add(i);
        }
        // Stream은 "순차적으로 나열된 데이터"이다. Stream은 Stream에 저장된 데이터를 쉽고 편하게 연산(filter, map, reduce)할 수 있는 기능을 제공한다.
        s=ilist.stream().reduce(0, Integer::sum);
        System.out.println(s);
        s=0;

        s=ilist.stream().filter(i->i%2==1).reduce(0, Integer::sum);
        System.out.println(s);

        s=ilist.stream().filter(i->i%2==1).reduce(0, (x,y)->x+y);
        System.out.println(s);

        s=ilist.stream().filter(i->i%2==1).reduce(0, 
            new BinaryOperator<Integer>() {
                @Override
                public Integer apply(Integer t, Integer u){
                    return t+u;
                }
            });
        System.out.println(s);

    }
}
