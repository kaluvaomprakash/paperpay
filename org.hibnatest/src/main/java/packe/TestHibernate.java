package packe;

import java.util.List;
import java.util.Properties;

import javax.transaction.Transaction;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

        public static void main(String arg[]) {
        Properties prop= new Properties();
        prop.setProperty("hibernate.connection.url", "jdbc:mysql://appsdb500-1-rd.c2xawm3kje6l.us-west-2.rds.amazonaws.com/500flow");
        //You can use any database you want, I had it configured for Postgres
        prop.setProperty("dialect", "org.hibernate.dialect.MySQLDialect");
        prop.setProperty("hibernate.connection.username", "500flow");
        prop.setProperty("hibernate.connection.password", "500flow2#$");
        prop.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
        prop.setProperty("show_sql", "true"); //If you wish to see the generated sql query
        Configuration cfg = new Configuration();
        cfg.setProperties(prop);
        cfg.addAnnotatedClass(app.class);
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = (Transaction) session.beginTransaction();
        Query<app> query  = session.createQuery("from app",app.class);
        List<app> list = query.getResultList();
        System.out.println(list);



    }

    }