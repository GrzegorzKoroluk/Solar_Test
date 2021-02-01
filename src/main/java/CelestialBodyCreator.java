

public class CelestialBodyCreator extends CelestialBody{

    public final double gravityConstant = 6.674 * Math.pow(10,-11);
    public final double sunMass = 1.988400 * Math.pow(10,24) ;

    private int time = 0;
    public int getTime() { return time; }
    public void setTime(int time) { this.time = time; }

//    Scanner numberOfSeconds = new Scanner(System.in);

//    CelestialBody mercury = new CelestialBody("Mercury", 57.9);
//    CelestialBody venus = new CelestialBody("Venus", 108.2);
//    CelestialBody earth = new CelestialBody("Earth", 149.6);
//    CelestialBody mars = new CelestialBody("Mars", 227.9);
//    CelestialBody jupiter = new CelestialBody("Jupiter", 778.4);
//    CelestialBody saturn = new CelestialBody("Saturn", 1426.7);
//    CelestialBody uranus = new CelestialBody("Uranus", 2871.0);
//    CelestialBody neptune = new CelestialBody("Neptune", 4498.3);

//    public Object listOfBodies = new Object[]{mercury, venus, earth, mars, jupiter, saturn, uranus, neptune};


//    public void giveTime() throws IOException {
//        int x = 1;
//
//        do {
//            try {
//                System.out.println("Welcome to Solar System Simulator. We're starting at initial position, \n" +
//                        "where all objects are aligned to a horizontal line. \n" +
//                        "To see positions after a given period, please give a number of seconds here: ");
//                setTime(numberOfSeconds.nextInt());
//            } catch (Exception e) {
//                System.out.println("Invalid character(s). Please put only numbers.");
//                x = 2;
//            }
//            mercuryCalculations(getTime());
//        } while (x == 1);
//    }

//    public void mercuryCalculations(int givenNumberOfSeconds) {
//
//        if (listOfBodies != null && listOfBodies.getClass().isArray()) {
//            for (Object each : (Object[])listOfBodies) {
//                double orbitalSpeed = Math.sqrt(gravityConstant * sunMass / (mercury.getDistanceFromGravityCentre() * Math.pow(10,9)));
//                System.out.printf("Mercury Orbital Speed is: %.2f km/s\n", orbitalSpeed);
//                double orbitalPeriod = 2 * Math.PI * Math.sqrt(Math.pow((mercury.getDistanceFromGravityCentre() * Math.pow(10,9)),3) / (gravityConstant * sunMass)) / 1000;
//                System.out.printf("Mercury Orbital Period is: %.2f days\n", (orbitalPeriod/86400));
//                double orbitalAngle = Math.toRadians(((givenNumberOfSeconds % orbitalPeriod) / orbitalPeriod) * 360);
//                double coordinateX = mercury.getDistanceFromGravityCentre() * Math.cos(orbitalAngle);
//                System.out.println("Coordinate X: " + coordinateX);
//                double coordinateY = mercury.getDistanceFromGravityCentre() * Math.sin(orbitalAngle);
//                System.out.println("Coordinate Y: " + coordinateY);
//            }
//        }
//
//    }

}
