import Entity.Endereco;
import Entity.Pessoa;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joao", "Silva", "joaaaoo_silva04@gmail.com", new Endereco(
                "Afonso Neves", "New York"
        ));
        Endereco e1 = new Endereco("Pedro Barbosa", "Brasilia");
        Pessoa p2 = new Pessoa("Roberto", "Ferreira", "ferreira_berto123@gmail.com", e1);
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
