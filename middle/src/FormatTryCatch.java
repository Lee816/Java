public class FormatTryCatch {
    public static void main(String[] args) {
        String sNum = "123";
        String nNum = "h";
        try{
            int a=Integer.parseInt(sNum); //Integer.parseInt() 정수로 변환 Double.parseDouble() 실수형으로 변환
            System.out.println(a); //변환을 잘못 사용하면 NumberFormatException 발생
        }
        catch(NumberFormatException ee){
            System.out.println("NumberFormatException 에러메세지");
            System.err.println(ee.getMessage());
        }
        catch(Exception ee){
            System.out.println("Exception 에러메세지");
        }
        finally{
            System.out.println("무조건 실행 메세지");
        }
    }
}
