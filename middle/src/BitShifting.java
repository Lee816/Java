public class BitShifting {
    public static final int BITMASK = 1;
    public String makeBit(int value){
        char[] val = new char[32];
        for(int i=31;i>=0;i--){
            if((value&BITMASK)==1){
                val[i]='1';
            }
            else {
                val[i]='0';
            }
            value >>>= 1;
        }
        return new String(val);
    }

    public static void main(String[] args) {
        int ival = 2345;
        int eval = -2345;
        BitShifting bitsh = new BitShifting();
        String vals = bitsh.makeBit(ival);
        System.out.println(vals);
        vals=bitsh.makeBit(eval);
        System.out.println(vals);
        char[] vs = vals.toCharArray(); //문자열.toCharArray()는 문자열 내부에 저장된 문자들을 char[]로 변환한다.
        System.out.println(vs[0]);
    }
}
