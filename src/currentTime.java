public class currentTime {
    public static void main(String[] args) {
        //Current time display
        long totalMilliseconds = System.currentTimeMillis();
        System.out.println("totalMilli is " + totalMilliseconds);

        long totalSeconds = totalMilliseconds / 1000;
        System.out.println("totalSec is " + totalSeconds);

        long currentSeconds = totalSeconds % 60;
        System.out.println("currentSecs is " + currentSeconds);

        long totalMinutes = totalSeconds / 60;
        System.out.println("totalMin is " + totalMinutes);

        long currentMinutes = totalMinutes % 60;
        System.out.println("currentMin " + currentMinutes);

        long totalHours = totalMinutes / 60;
        System.out.println("totalMins is " + totalMinutes);

        long currentHour = totalHours % 24;
        System.out.println("Current time is " + currentHour + "hour " + currentMinutes + "mins " + currentSeconds + "secs " + "GMT");

    }
}
