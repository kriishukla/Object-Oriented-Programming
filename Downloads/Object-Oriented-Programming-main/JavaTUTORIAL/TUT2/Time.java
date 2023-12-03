public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int totalSeconds) {
 
        hours = totalSeconds / 3600; 
        totalSeconds %= 3600;
        minutes = totalSeconds / 60; 
        seconds = totalSeconds % 60;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        // Example usage:
        int totalSeconds = 3665; // 1 hour, 1 minute, and 5 seconds
        Time time = new Time(totalSeconds);

        System.out.println("Hours: " + time.getHours());
        System.out.println("Minutes: " + time.getMinutes());
        System.out.println("Seconds: " + time.getSeconds());
        System.out.println("Time in HH:MM:SS format: " + time);
    }
}
