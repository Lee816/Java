public class StringMain {
    public static void main(String[] args) {
        String city1 = "Asia";
        String city2 = "Europe";
        String city3 = new String("Asia");
        String city7 = "Asia";

        System.out.println(city1);
        System.out.println(city1.length());
        System.out.println(city1==city2);
        System.out.println(city1.equals(city2));
        System.out.println(city1==city3);
        System.out.println(city1==city7);
        System.out.println(city1.equals(city3));
        System.out.println(city1.equals(city7));

        String city4 = String.format("%s-%s", city1,city2);
        System.out.println(city4);
        String city5 = city1+"-"+city2+1+2;
        System.out.println(city5);
        String city6 = 1+2+city1+"-"+city2;
        System.out.println(city6);
    }
}
/*
 * new 키워드로 생성한 객체의 Stack의 래퍼런스는 같을 수 없다. 또한 Heap의 해시코드도 같을수 없다 .
 * 그러나 String은 Heap의 풀(pool)을 이용하므로, 같은 문자열에 대하여 new로 생성한 문자열의 Stack 래퍼런스는 다르지만
 * Heap의 해시코드는 동일하다. 같은 문자열에 대하여 new 로 생성하지 않은 문자열은 Stack의 레퍼런스와 Heap의 해시코드가 동일하다. String의 생성 방법에 따라 Stack의 레퍼런스는 다를수 있지만, Heap의 해시코드는 동일하다.
 */

