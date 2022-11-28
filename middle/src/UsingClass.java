import java.lang.reflect.*;

/*
 * Object의 getClass() 메서드는 Class를 반환한다. Class는 해당 클래스의 선언된 메서드와 생성자들을 반환하는 메서드를 제공한다.
 * getDeclaredConstructors()는 선언한 생성자, getMethods()는 선언된 메서드를 제공한다.
 * Class는 모든 객체에 대한 객체 자신의 정보등을 제공한다. 이를 Reflection이라고 한다.
 */

public class UsingClass {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Class classes = obj1.getClass();
        
        System.out.println(classes.getName());
        System.out.println("---------constructor--------");
        Constructor[] constructor = classes.getDeclaredConstructors();
        for(Constructor con: constructor){
            System.out.println(con.getName());
        }

        System.out.println("---------Method-----------");
        Method[] method = classes.getMethods();
        for(Method me:method){
            System.out.println(me.getName());
        }
    }
}

