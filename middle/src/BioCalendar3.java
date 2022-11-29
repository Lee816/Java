package middle;

public class BioCalendar3 {
    public static final int PHYSICAL = 23;

    public double bio(int index) {
        return 100 * Math.sin((index % PHYSICAL) * 2 * Math.PI / PHYSICAL);
    }

    public static void main(String[] args) {
        int index = 1200;
        BioCalendar3 bio3 = new BioCalendar3();
        double phy = bio3.bio(index);
        System.out.println(phy);
    }
}
