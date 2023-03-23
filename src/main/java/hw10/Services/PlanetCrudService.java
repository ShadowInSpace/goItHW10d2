package hw10.Services;

import hw10.entities.Planet;
import hw10.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.NoSuchElementException;

public class PlanetCrudService {
    private final SessionFactory sessionFactory;
    public PlanetCrudService() {
        this.sessionFactory = HibernateUtil.getInstance().getSessionFactory();
    }

    public void postPlanet(Planet planet){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(planet);
        transaction.commit();
        session.close();
    }
    public Planet getById(String id){
        Session session = sessionFactory.openSession();
        Planet planet = session.get(Planet.class, id);
        if(planet==null) {
            throw new NoSuchElementException("Planet with id " + id + " not found");
        }
        session.close();
        return planet;
    }

    public void deletePlanet(Planet planet){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.remove(planet);
        transaction.commit();
        session.close();
    }
}
