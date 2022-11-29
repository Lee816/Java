package middle;

public class BitNShiftMain {
    public static String shifts(int a) {
        String s = "";
        for (int i = 0; i <= 31; i++) {
            int aa = a % 2;
            s = (aa >= 0) ? aa + s : (-aa) + s;
            a >>= 1;
        }
        return s;
    }

    public static void main(String[] args) {
        int intNums1 = 123;
        int intNums2 = -123;
        System.out.println(shifts(intNums1));
        System.out.println(shifts(intNums2));
    }
}
