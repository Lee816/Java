package middle;

public class BioCalendar {
    public static final int PHYSICAL = 23;

    public static void main(String[] args) {
        int index = 1200;
        double phy = 100 * Math.sin((index % PHYSICAL) * 2 * Math.PI / PHYSICAL);
        System.out.println(phy);

    }
}
