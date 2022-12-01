
public class CardUtil {
    public static final int SUTDA = 2;
    public static final String[] SUIT = {"H","C"};
    public static final String[] VALU = {"A","2","3","4","5","6","7","8","9","T"};

    // 카드값에서 1번째 값을 정수값으로 반환한다. 카드값이 "H6" 일때 6을 반환
    public static int toVal(Card c){
        return toVal(c.getCardVal().charAt(1)); 
    } 

    // 카드값에서 index번때 값을 얻는다.
    public static int toVal(Card c,int index){
        return toVal(c.getCardVal().charAt(index));
    }

    public static int toVal(char cc){
        int tot=0;
        switch(cc){
            case 'A' : tot=1; break;
            case 'T' : tot=10; break;
            case 'J' : tot=11; break;
            case 'Q' : tot=12; break;
            case 'K' : tot=13; break;
            default : tot=cc-'0'; break;
        }
        return tot;
    }
}

// static은 객체를 생성하지 않고 사용하기 위해 만든 키워드이다. static이 붙은 메서드나 변수는 "클래스이름.메서드" 나 "클래스이름.변수" 처럼 사용한다.