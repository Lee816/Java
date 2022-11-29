import java.io.*;
import java.net.*;
import java.util.*;

public class WikipediaMain2 {
    public static void main(String[] args) {
        ArrayList<String> htmls = new ArrayList<String>();
        String newUrls = "https://ko.wikpedia.org/wiki/ISO_3166-1";
        URL url = null;
        try {
            url = new URL(newUrls); // 주소찾기
            // 주소지에 빨때 꽃기
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "utf-8"), 8);
            // [Java 자바입출력] BufferedReader/BufferedWriter
            String line = null;
            while ((line = reader.readLine()) != null) { // 한줄씩 읽어서
                if (!line.trim().equals("")) { // 공백이 아니면 출력
                    System.out.println(line.trim());
                }
            }
        } catch (Exception e) {
            System.out.println("Wiki Flag Parsing error !!!");
        }
        for (String str : htmls) {
            System.out.println(str);
            ;
        }
    }
}
