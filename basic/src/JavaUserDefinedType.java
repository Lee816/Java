// 사용자 정의 클래스 (파일 이름과 클래스 이름이 다르기 때문에 public 불가능)
class JLocation {
    public double lat;
    public double lng;
}

public class JavaUserDefinedType {
    public static void main(String[] args) {
        // 두개의 기본 타입
        double latitude = 37.52127220511242;
        double longitude = 127.0074462890625;
        // 사용자 정의 객체를 생성
        JLocation jloc = new JLocation();
        jloc.lat = latitude;
        jloc.lng = longitude;

        JLocation newLoc = jloc;
        System.out.println(newLoc.lat);
    }
}
