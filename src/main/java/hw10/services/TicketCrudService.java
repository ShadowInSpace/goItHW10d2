package hw10.services;

import hw10.entities.Client;
import hw10.entities.Ticket;
import hw10.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.sql.Timestamp;
import java.util.NoSuchElementException;

public class TicketCrudService {
    private final SessionFactory sessionFactory;
    public TicketCrudService() {
        this.sessionFactory = HibernateUtil.getInstance().getSessionFactory();
    }

    public void postTicket(Ticket ticket){
        if(ticket.getClient()==null||ticket.getFrom()==null||ticket.getTo()==null||ticket.getFrom().equals(ticket.getTo()))throw new RuntimeException("incorrect ticket");
ticket.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(ticket);
        transaction.commit();
        session.close();
    }
    public Ticket getById(int id){
        Session session = sessionFactory.openSession();
        Ticket ticket = session.get(Ticket.class, Integer.toUnsignedLong(id));
        if(ticket==null) {
            throw new NoSuchElementException("Ticket with id " + id + " not found");
        }
        session.close();
        return ticket;
    }

    public void deleteTicket(Ticket ticket){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.remove(ticket);
        transaction.commit();
        session.close();
    }
}
