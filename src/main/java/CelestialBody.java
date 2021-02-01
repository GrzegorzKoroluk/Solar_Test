import javax.persistence.*;

@Entity
@Table(name = "celestial_bodies")
public class CelestialBody {

    @Id
    @Column(name = "Id")
    @GeneratedValue(generator = "incrementor")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "Name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Column(name="Distance")
    private double distanceFromGravityCentre;

    public double getDistanceFromGravityCentre() {
        return distanceFromGravityCentre;
    }

    public void setDistanceFromGravityCentre(double distanceFromGravityCentre) {
        this.distanceFromGravityCentre = distanceFromGravityCentre;
    }


    public CelestialBody() {
    }

    public CelestialBody(String name, double distanceFromGravityCentre) {
        this.name = name;
        this.distanceFromGravityCentre = distanceFromGravityCentre;
    }
}