import java.io.*;
import java.util.*;

public class Billfiles {
    public static void main(String[] args) {
        File f = new File("billboard");
        File[] fd = f.listFiles();
        for (File ff : fd) {
            String fname = ff.getName(); // 파일 명
            String post = fname.substring(fname.lastIndexOf(".") + 1);
            System.out.println(fname + " " + post); // 이름,확장자
            System.out.println(ff.getAbsolutePath()); // 전체경로
            System.out.println(new Date(ff.lastModified())); // 수정일
            try (BufferedReader br = new BufferedReader(new FileReader(ff.getAbsolutePath()))) {
                String msg = "";
                while ((msg = br.readLine()) != null) {
                    System.out.println(msg);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("-----------------------------");
        }
    }
}
