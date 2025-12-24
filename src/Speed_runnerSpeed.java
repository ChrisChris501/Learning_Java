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



       // The Train Ride
        double trainDistance = 290;
        double leavesBerlin;
        double arrivesHamburg;
        double totalTravelTime;
        double trainSpeed;

        //Convert hours to minutes
        arrivesHamburg = (4 * 60) + 30;
        leavesBerlin = 2 * 60;
        totalTravelTime = arrivesHamburg - leavesBerlin;
        trainSpeed = trainDistance / totalTravelTime;
        System.out.println(trainSpeed);

        /* (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30
        seconds. Write a program that displays the average speed in miles per hour. (Note that 1 mile is 1.6 kilometers.)

                -> speed = distance / time; // Formula
        "Speed of athlete is (speed) miles/hr"; // Output */

        double distance;
        double time;
        double speed;
        double speedInMiles = 24;

        //Time to hours
        time = ((60 * 60) + (40.0 * 60) + 35) / 3600;
        System.out.println(time);

        //Speed to kilometers
        distance = speedInMiles * 1.6;

        // Calculating speed
        speed = distance / time;
        System.out.println("Average speed = " + speed);
    }
}
