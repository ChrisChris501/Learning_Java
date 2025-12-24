public class Speed_runnerSpeed {
    public static void main (String[] args){

        //Calculate Amir Speed While Late for School
        double startTime;
        double endTime;
        double schoolDistance = 18;
        double amirTime;
        double amirSpeed;

        //Convert startTime and endTime to minutes
        startTime = (7 * 60) + 45;
        endTime = (7 * 60) + 15;
        //Convert to hours
        amirTime =(startTime - endTime) /  60;
        //Average speed
        amirSpeed = schoolDistance /amirTime;
        System.out.println(amirSpeed);


       // Maria Speed Jogging Around the Park
        double singleLap = 1.2;
        double mariaTime = 35;
        double completedLaps = 5;
        double totalLap;
        double mariaSpeed;

        totalLap = singleLap * completedLaps;
        mariaTime = mariaTime / 60;
        mariaSpeed = totalLap / mariaTime;
        System.out.println(mariaSpeed);

    }
}
