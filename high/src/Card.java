public class Card {

    private String cardVal;

    public String getCardVal(){
        return cardVal;
    }

    public Card(){// 기본생성자
        this("H2"); // this.carVal = "H2" 와 동일
    }

    public Card(String s){ // 테스트용
        this.cardVal = s;
    }

    public Card(Card c){ // 복사 생성자
        this(c.getCardVal()); // this.cardVal = c.getCard(); 와 동일
    }

    @Override
    public String toString(){
        return "["+cardVal+"]";
    }
}
