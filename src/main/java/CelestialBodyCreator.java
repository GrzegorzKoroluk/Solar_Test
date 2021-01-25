import java.io.IOException;
import java.util.Scanner;

public class CelestialBodyCreator extends CelestialBody{

    public final double gravityConstant = 6.674 * Math.pow(10,-11);
    public final double sunMass = 1.988400 * Math.pow(10,24) ;

    Scanner numberOfSeconds = new Scanner(System.in);

    CelestialBody mercury = new CelestialBody("Mercury", 57.9);
    CelestialBody venus = new CelestialBody("Venus", 108.2);

    public void giveTime() throws IOException {
        int x = 1;

        do {
            try {
                System.out.println("Welcome to Solar System Simulator. We're starting at initial position, \n" +
                        "where all objects are aligned to a horizontal line. \n" +
                        "To see positions after a given period, please give a number of seconds here: ");
                setTime(numberOfSeconds.nextInt());
            } catch (Exception e) {
                System.out.println("Invalid character(s). Please put only numbers.");
                x = 2;
            }
            mercuryCalculations(getTime());
        } while (x == 1);
    }

    public void mercuryCalculations(int givenNumberOfSeconds) {
        double orbitalSpeed = Math.sqrt(gravityConstant * sunMass / (mercury.getDistanceFromGravityCentre() * Math.pow(10,9)));
        System.out.printf("Mercury Orbital Speed is: %.2f km/s", orbitalSpeed);
        double orbitalPeriod = 2 * Math.PI * Math.sqrt(Math.pow((mercury.getDistanceFromGravityCentre() * Math.pow(10,9)),3) / (gravityConstant * sunMass)) / 1000;
        System.out.printf("\nMercury Orbital Period is: %.2f days\n", (orbitalPeriod/86400));
        double orbitalAngle = Math.toRadians(((givenNumberOfSeconds % orbitalPeriod) / orbitalPeriod) * 360);
        double coordinateX = mercury.getDistanceFromGravityCentre() * Math.cos(orbitalAngle);
        System.out.println("Coordinate X: " + coordinateX);
        double coordinateY = mercury.getDistanceFromGravityCentre() * Math.sin(orbitalAngle);
        System.out.println("Coordinate Y: " + coordinateY);
    }

}
