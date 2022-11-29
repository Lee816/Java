package middle;

public class BioCalendar2 {
    public static final int PHYSICAL = 23;

    public static double bio(int index) {
        return 100 * Math.sin((index % PHYSICAL) * 2 * Math.PI / PHYSICAL);
    }

    public static void main(String[] args) {
        int index = 1200;
        System.out.println(bio(index));

    }
}
