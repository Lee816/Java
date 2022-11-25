public class BioCalendar2 {
    public static final int PHYSICAL = 23;
    public static void main(String[] args) {
        System.out.println(PHYSICAL);
        int index = PHYSICAL;
        int days = 1200;
        double vals = (days%index)*2*Math.PI/index;
        System.out.println(Math.toDegrees(vals) + "도");
    }
}
