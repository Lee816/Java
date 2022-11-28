public class UsingObject {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println(obj1.hashCode()); //native 10진수
        System.out.println(Integer.toHexString((obj1.hashCode()))); // 16진수
        System.out.println(obj1==obj2); //스택 영역의 레퍼런스를 비교하지만 new 키워드로 생성하는 참조 타입의 레퍼런스는 객체마다 고유하므로 항상 false 이다.
        System.out.println(obj1.equals(obj2)); //equals 비교는 1차주소(해시코드)를 비교한다. 해시코드에 대한 오버라이딩과 equals 오버라이딩을 이용하면 equals로 비교할 수 있다.
        System.out.println(obj1);
        System.out.println(obj2.toString()); //래퍼런스.toString() 메서드는 기본적으로 "타입@16진수 해시코드"를 리턴한다.

        System.out.println(obj1.getClass().getName());
        String str = obj1.getClass().getName()+ "@"+Integer.toHexString(obj1.hashCode());
        System.out.println(str);

        Object objstr = new String("Good"); //Object 타입으로 String 객체를 생성한다. "부모 이름으로 자식을 생성할 수 있다"는 래퍼런스 다형성을 보여준다.
        System.out.println(objstr.toString());
        System.out.println(objstr instanceof Object);
        System.out.println(objstr instanceof String);

        String hello = "hello";
        System.out.println(hello.getClass());
    }
}
