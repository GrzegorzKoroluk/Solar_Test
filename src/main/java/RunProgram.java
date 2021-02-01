import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.IOException;

public class RunProgram {
    public static void main(String[] args) throws IOException {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("solar_system_test");

        CelestialBody celestialBody = new CelestialBody();
        celestialBody.setId(1);
        celestialBody.setName("Mercury");
        celestialBody.setDistanceFromGravityCentre(57.9);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.persist(celestialBody);
        entityManager.getTransaction().commit();
        entityManagerFactory.close();
    }
}
