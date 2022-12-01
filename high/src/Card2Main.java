public class Card2Main {
    public static void main(String[] args) {
        Card2 c1 = new Card2("H4");
        Card2 c2 = new Card2("H4");
        Card2 c3 = new Card2(c1);

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.getCardVal());
        System.out.println(c2.getCardVal());

        System.out.println(c1.equals(c2)); // hashCode를 비교 값은 false
        System.out.println(c1.equals(c3)); // hashCode를 비교 값은 false

        for(int i=0;i<CardUtil.SUIT.length;i++){
            for(int j=0; j< CardUtil.VALU.length;j++){
                Card2 c = new Card2();
                System.out.println(c);
            }
            System.out.println();
        }
    }
}
