public class BioCalendar {
    public static final int PHYSICAL = 23;
    public static void main(String[] args) {
        System.out.println(PHYSICAL);
        int index = PHYSICAL;
        double vals = 2*Math.PI/index; //Math.PI 이미 정의되어 있는 상수 3.14
        System.out.println(vals + "라디안");
    }
}
