
// Implement a class Time with attributes hours, minutes, and seconds. Add a method to add two time objects.
public class Time {
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    int hours;
    int minutes;
    int seconds;

    public int toSeconds() {
        return (this.hours * 3600) + (this.minutes * 60) + this.seconds;
    }

    public Time fromSeconds(int totalSeconds) {

        /// tmam seconds ko 3600 par divide karke hours nikal lo
        int hours = totalSeconds / 3600;

        // abb %= sy remainder nikal lo, hours k baad jo bachey wo seconds hain
        totalSeconds %= 3600;

        // ab bachey seconds ko 60 par divide karke minutes nikal lo
        int minutes = totalSeconds / 60;

        // abb %= sy remainder nikal lo, minutes k baad jo bachey wo seconds hain
        int seconds = totalSeconds % 60;

        // ab ye 3 values ko return kar do
        return new Time(hours, minutes, seconds);
    }

}
