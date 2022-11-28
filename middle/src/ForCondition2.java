import java.util.*;

public class ForCondition2 {
    public static void main(String[] args) {
        List<Integer> ilist = new ArrayList<>();
        int s=0;
        for(int i=0;i<=10;i++){
            ilist.add(i);
        }
        for(int m: ilist){
            if(m%2==1){
                s += m*m;
                System.out.println(m*m);
            }
        }
        System.out.println();
        System.out.println(s);

    }
}
