package tuan2.edu.db;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Connection {
    private static Connection intance =null;
    private EntityManagerFactory emf;


    public Connection() {
        emf = Persistence.createEntityManagerFactory("Tuan2");

    }
    public EntityManagerFactory getEmf() {
        return emf;
    }

    public static Connection getIntance() {
        if(intance == null) {
            intance = new Connection();
        }
        return intance;
    }
}
