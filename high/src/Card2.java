public class Card2 { //클래스 선언
    private String cardVal; //카드의 중요데이터로 카득밧을 문자열 타입으로 선언 접금제한자를 private으로 선언하여 데이터 보호

    public String getCardVal(){ // 카드값을 외부로 반환하는 메서드
        return cardVal;
    }

    public Card2(){ //기본 생성자 선언
        int suit = (int)(Math.random()*CardUtil.SUIT.length);  //SUIT 배열은 static이므로 객체를 생성하지 않고 사용가능

        int valu = (int)(Math.random()*CardUtil.VALU.length); //VALU 배열은 static이므로 객체를 생성하지 않고 사용가능

        cardVal = CardUtil.SUIT[suit]+CardUtil.VALU[valu]; //
    }

    public Card2(String s){
        this.cardVal=s;
    }

    public Card2(Card2 c){
        this(c.getCardVal());
    }

    @Override
    public String toString(){
        return "["+cardVal+"]";
    }
}
