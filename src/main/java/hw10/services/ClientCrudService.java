package hw10.services;


import hw10.entities.Client;
import hw10.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.NoSuchElementException;

public class ClientCrudService {
private final SessionFactory sessionFactory;
    public ClientCrudService() {
        this.sessionFactory = HibernateUtil.getInstance().getSessionFactory();
    }

        public void postClient(Client client){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(client);
        transaction.commit();
        session.close();
    }
    public Client getById(int id){
        Session session = sessionFactory.openSession();
        Client client = session.get(Client.class, Integer.toUnsignedLong(id));
        if(client==null) {
            throw new NoSuchElementException("Client with id " + id + " not found");
        }
        session.close();
        return client;
    }

    public void deleteClient(Client client){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.remove(client);
        transaction.commit();
        session.close();
    }

}
