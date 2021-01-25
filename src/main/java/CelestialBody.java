public class CelestialBody {

    private String name;
    private double distanceFromGravityCentre;
    private int time = 0;

    public CelestialBody() {
    }

    public CelestialBody(String name, double distanceFromGravityCentre) {
        this.name = name;
        this.distanceFromGravityCentre = distanceFromGravityCentre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistanceFromGravityCentre() {
        return distanceFromGravityCentre;
    }

    public void setDistanceFromGravityCentre(int distanceFromGravityCentre) {
        this.distanceFromGravityCentre = distanceFromGravityCentre;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

}
