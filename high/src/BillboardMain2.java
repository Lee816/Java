public class BillboardMain2 {
    public static void main(String[] args) {
        Billboard b1 = new Billboard(1, "노래제목1", 1, "이미지링크", "가수");
        showAbout(b1);

        Billboard b = b1;
        showAbout(b);
    }

    public static void showAbout(Billboard bb) {
        String sf = String.format("%d, %s, %d, %s, %s", bb.getRank(), bb.getSong(), bb.getLastweek(), bb.getImagesrc(),
                bb.getArtist());
        System.out.println(sf);
    }
}
