import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double startLat;
        double startLong;
        double endLat;
        double endLong;
        double distance;

        System.out.println("Enter the latitude of the starting location: ");
        startLat = in.nextDouble();
        System.out.println("Enter the longitude of the starting location: ");
        startLong = in.nextDouble();
        System.out.println("Enter the latitude of the ending location: ");
        endLat = in.nextDouble();
        System.out.println("Enter the longitude of the ending location: ");
        endLong = in.nextDouble();

        GeoLocation start = new GeoLocation(startLat, startLong);
        GeoLocation end = new GeoLocation(endLat, endLong);

        distance = start.distanceFrom(end);
        System.out.println("The distance is " + distance + " miles.");
    }
}