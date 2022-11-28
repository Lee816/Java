public class FinallyTryCatch {
    public static void main(String[] args) {
        try{
            int x=5;
            int y=20/(5-x);
            System.out.println(y);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException 에러메세지(0으로 나누기를 시도했을때)");
        }
        finally{
            System.out.println("무조건 실행 메세지");
        }
    }
}
