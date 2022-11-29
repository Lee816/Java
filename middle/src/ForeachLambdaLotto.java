package middle;

import java.util.*;
import java.util.function.*;

public class ForeachLambdaLotto {
    public static void main(String[] args) {
        List<Integer> mmlists = Arrays.asList(1, 6, 16, 2, 23, 33);
        // 여러수를 리스트에 저장한다. 리스트에 저장할 수가 int 타입일때 랩퍼 클래스 Integer를 사용한다.
        mmlists.forEach(m -> {
            // 리스트에 저장된 정수를 한개씩출력하기 위해 리스트의 forEach 메서드를 이용한다. 리스트의 forEach는 향상된 for처럼
            // index없이 순서대로 한개씩 작업할 수 있다.
            System.out.println(m);
        });
        System.out.println();
        Consumer<Integer> consume = (Integer m) -> {
            System.out.println(m);
        };
        mmlists.forEach(consume);
    }
}
