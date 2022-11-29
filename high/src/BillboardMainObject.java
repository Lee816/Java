public class BillboardMainObject {
    public static void main(String[] args) {
        Billboard b1 = new Billboard(1, "노래제목1", 1, "이미지링크1", "가수1");
        Billboard b2 = new Billboard(2, "노래제목2", 2, "이미지링크2", "가수2");
        Billboard b3 = new Billboard(3, "노래제목3", 3, "이미지링크3", "가수3");

        showAbout(b1);
        showAbout(b2);
        showAbout(b1, b2);
        showAbout(b1, b2, b3);

        Billboard[] b = new Billboard[3];
        b[0] = new Billboard(1, "노래제목1", 1, "이미지링크1", "가수1");
        b[1] = b2;
        b[2] = b3;
        showAbout(b[0], b[1]);
        showAbout(b);

    }

    public static void showAbout(Billboard bb) { // 1개인자일때 사용
        System.out.println("1---------------------------------");
        String sf = String.format("%d, %s, %d, %s, %s", bb.getRank(), bb.getSong(), bb.getLastweek(), bb.getImagesrc(),
                bb.getArtist());
        System.out.println(sf);
    }

    public static void showAbout(Billboard... b) { // 2개 이상의 인자일때 사용
        System.out.println("2===================================>");
        for (Billboard bill : b) {
            showAbout(bill);
        }
        System.out.println("<===================================2");
    }
}
