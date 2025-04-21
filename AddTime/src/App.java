public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Time t1 = new Time(1, 2, 3);

        Time t2 = new Time(4, 5, 6);

        // t1 ko seconds mein convert kar lo
        int t1InSeconds = t1.toSeconds();

        // t2 ko seconds mein convert kar lo
        int t2InSeconds = t2.toSeconds();

        // ab dono ko add kar do
        int totalSeconds = t1InSeconds + t2InSeconds;

        // ab ye total seconds ko time mein convert kar lo

        Time t3 = t1.fromSeconds(totalSeconds);

        System.out.println("Time 1: " + t1.hours + ":" + t1.minutes + ":" + t1.seconds);

    }
}
