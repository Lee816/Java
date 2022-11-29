import java.io.*;
import java.util.*;

public class BillFileWriter {
    public static void main(String[] args) {
        Billboard b1 = new Billboard(1, "노래제목1", 1, "이미지링크1", "가수1");
        Billboard b2 = new Billboard(2, "노래제목2", 2, "이미지링크2", "가수2");
        Billboard b3 = new Billboard(3, "노래제목3", 3, "이미지링크3", "가수3");

        ArrayList<Billboard> bblist = new ArrayList<>(); // ArrayList를 생성한다. ArrayList에 Billboard 객체만 저장하기 위해
                                                         // <Billboard>(제네릭)로 제한한다.
        bblist.add(b1);
        bblist.add(b2);
        bblist.add(b3);

        File f = new File("billboard");
        if (!f.exists()) { // "billboard" 디렉토리가 존재하지 않으면 (!f.exists()) "billboard" 디렉토리를 만든다. (mkdirs())
            f.mkdirs();
        }
        try (PrintWriter pw = new PrintWriter(new FileWriter("billboard\\bill.txt", false), true)) {
            for (Billboard bb : bblist) {
                pw.println(bb);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}

// try( PrintWriter 생성 ) {} 구문은 자바7에서 추가된 구문으로 finally를 사용하지 않고 {}을 끝내면 자동으로
// PrintWriter를 close한다.