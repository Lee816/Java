

public class JavaTypeConversion {
    public static void main(String[] args) {
        String slat = "   37.52127220511242   ";
        //공백 제거후 double로 타입 변환
        double latitude = Double.parseDouble(slat.trim());
        System.out.println(latitude);
    }
}
