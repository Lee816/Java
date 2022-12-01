public class CardMain {
    public static void main(String[] args) {
        String csuit1 = "H", cvalu1="6";
        String scuit2 = "H", cvalu2="3";

        //객체생성
        Card c1 = new Card("H6");
        Card c2 = new Card(csuit1+cvalu1);
        Card c3 = new Card();
        Card c4 = new Card(scuit2+cvalu2);

        System.out.printf("%s %s %s %s",c1,c2,c3,c4);
        System.out.println(c1.equals(c2)); //해시코드가 다름
        System.out.println(c1.getCardVal().equals(c2.getCardVal())); //값 동일
    }
}
