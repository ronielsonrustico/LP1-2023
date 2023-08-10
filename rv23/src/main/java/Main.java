import Entity.Pessoa;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa()
        Pessoa p2 = new Pessoa()
        Pessoa p3 = new Pessoa()
        Pessoa p4 = new Pessoa()

                Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.begInTransaction();

        session.persist(p1);
        session.persist(p2);
        session.persist(p3);
        session.persist(p4);

        transaction.commit();

    }
}
