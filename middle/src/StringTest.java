public class StringTest {
    public static void main(String[] args) {
        String text = "Hello Java4Android";
        String com = "HEllo Java4Android";

        System.out.println(text.charAt(2)); //2번째 인덱스의 문자를 출력한다.
        System.out.println(text.concat("s")); // concat()은 +와 같은 의미로 오른쪽에 문자를 붙인다.
        System.out.println(text.contains("And")); // 문자열을 포함하고 있는지 반펼한다.
        System.out.println(text.equals(com)); // 두 문자열이 같은지 판별한다.
        System.out.println(text.equalsIgnoreCase(com)); // 대소문자를 구별하지 않고 두 문자열이 같은지 판별한다.
        System.out.println(text.indexOf("a")); // 문자열 또는 문자가 처음 발견된 위치를 반환한다.
        System.out.println(text.lastIndexOf("a")); // 문자열 또는 문자가 가장 뒤쪽에서 발견된 위치를 반환한다.
        System.out.println(text.trim()); // 양쪽의 공백을 제거한다.
        System.out.println(text.length()); // 문자열의 길이를 반환하며 공백도 포함된다.
        System.out.println(text.substring(7)); // 입력된 위치의 문자열 앞쪽을 자른 다음 그 위치부터 뒤쪽을 반환한다.
        System.out.println(text.substring(7,11)); // index1부터 index2번째 까지 반환한다.
        System.out.println(text.replace("","-")); // str1 을 str2로 변환한다.
        System.out.println(text.replaceAll("","-")); // str1 을 str2로 변환한다.
        System.out.println(text.toUpperCase()); // 모두 대문자로 변경한다.
        System.out.println(text.toLowerCase()); // 모두 소문자로 변경한다.

        String[] sp = text.split(" "); // 문자를 기분으로 문자열을 잘라 배열로 반환한다.
        for(int i=0; i<sp.length;i++){
            System.out.println(i+"\t\t"+sp[i]+"\t\t"+sp[i].length());
        }
    }
}
