public class StringArray {
    public static void main(String[] args) {
        String[] myNum1 = new String[]{"2016-08-17","2016-09-17","2016-03-17"}; // 동적 배열 선언 및 초기화
        String[] myNum2 = {"2016-08-17","2016-09-17","2016-03-17"}; // 정적 배열 선언 및 포기화

        System.out.println(myNum2[0]);
        print(myNum1);

        myNum1 = new String[]{"2016-08-17","2016-09-17","2016-03-17","2016-04-17"};
        String[] tos = new String[myNum1.length];
        System.arraycopy(myNum1, 0, tos, 0, myNum1.length);
        print(tos);
    }

    public static void print(String[] tos){
        for(String ss : tos){
            System.out.println(ss);
        }
        System.out.println();
    }
}

/*
 * 모든 동적 배열은 다시 초기화가 가능하고, 정적 배열은 다시 초기화가 불가능 하다. 
 * 배열에서 길이는 lengh, 복사는 System.arraycopy()를 사용한다.
 */
