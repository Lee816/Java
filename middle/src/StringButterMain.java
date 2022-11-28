public class StringButterMain {
    public static void main(String[] args) {
        StringButter sb1 = new StringButter();

        sb1.append("안녕하세요").append("또만나요").append("기다려봐");
        System.out.println(sb1.toSting()+sb1.hashCode());

        sb1.replace(0,2,"나 보기가 역겨워");
        System.out.println(sb1.toSting()+sb1.hashCode());

        sb1.reverse();
        System.out.println(sb1.toSting());

        sb1.delete(10,15);
        System.out.println(sb1.toSting());

        replaces(sb1);
        System.out.println(sb1.toSting());
    }

    public static void replaces(StringButter sb){
        sb.reverse();
        sb.replace(0,3,"GoGo");
    }
}
