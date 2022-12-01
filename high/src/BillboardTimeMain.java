import java.io.*;
import java.net.http.HttpClient;

import org.apache.http.*;
import org.jsoup.nodes.*;
import org.w3c.dom.Document;

public class BillboardTimeMain{
    public static void main(String[] args) {
        String newUrls = "https://www.billboard.com/aharts/hot-100/";
        HttpGet request = new HttpGet(newUrls);
        CloseableHttpClient hhttpClient = null;
        CloseableHttpResponse response = null;
        Document doc = null;
        try{
            httpClient = HttpClient.createDefault(); // 웹에 연결
            response = httpClient.execute(request); //결과 얻기
            StringBuffer entity = response.getEntity();
            if(entity != null){//결과가 있다면 결과에서 한줄씩
                String result = EntityUtils.toString(entity);
                sb.append(result); //결과저장
            }

            doc = Jsoup.parse(sb.toString()); // 전체 내용을 HTML 파싱
            String id = "charts";
            Element eid = doc.getElementById(id);
            String sdate = eid.attr("data-chart-date");
            System.out.println("이번 빌보드 차트 날짜 : "+sdate.trim());
        }catch(IOException e){
            System.out.println(e);
        }
    }
}