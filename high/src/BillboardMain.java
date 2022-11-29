public class BillboardMain {
    public static void main(String[] args) {
        int rank = 1;
        String song = "노래제목";
        int lastweek = 1;
        String imagesrc = "이미지링크";
        String artist = "아티스트";
        String sf = String.format("%d, %s, %d ,%s, %s", rank, song, lastweek, imagesrc, artist);
        System.out.println(sf);
    }
}