import java.util.*;

public class BillboardArrayMain {
    public static void main(String[] args) {
        ArrayList<Billboard> bills = new ArrayList<>();
        bills.add(new Billboard(1, "노래제목1", 1, "이미지링크1", "가수1"));
        bills.add(new Billboard(2, "노래제목2", 2, "이미지링크2", "가수2"));
        bills.add(new Billboard(3, "노래제목3", 3, "이미지링크3", "가수3"));

        System.out.println(bills.size());
        showAbout(bills.get(0));
        bills.remove(1);
        System.out.println(bills.size());
        System.out.println("-------------");
        for (Billboard bb : bills) {
            showAbout(bb);
        }
    }

    public static void showAbout(Billboard bb) {
        String sf = String.format("%d, %s, %d, %s, %s", bb.getRank(), bb.getSong(), bb.getLastweek(), bb.getImagesrc(),
                bb.getArtist());
        System.out.println(sf);
    }
}
