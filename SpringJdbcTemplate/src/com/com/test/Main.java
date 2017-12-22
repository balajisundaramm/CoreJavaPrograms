package com.com.test;

import com.dao.DerbyDao;
import com.domainModel.Person;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

/**
 * Created by Balaji on 6/12/17.
 */
public final class Main {
    private Main() {

    }

    public static void main(String[] args) {
        DerbyDao dao = new DerbyDao();
        // Initialize the datasource, could /should be done of Spring
        // configuration
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/LabTables");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        // Inject the datasource into the dao
        dao.setDataSource(dataSource);

        dao.create("Lars", "Vogel");
        dao.create("Jim", "Knopf");
        dao.create("Lars", "Man");
        dao.create("Spider", "Man");
        System.out.println("Now select and list all persons");
        List<Person> list = dao.selectAll();
        for (Person myPerson : list) {
            System.out.print(myPerson.getFirstName() + " ");
            System.out.println(myPerson.getLastName());
        }
        System.out.println("Now select and list all persons " +
                "with have the firstname Lars and lastname Vogel");
        list = dao.select("Lars", "Vogel");
        for (Person myPerson : list) {
            System.out.print(myPerson.getFirstName() + " ");
            System.out.println(myPerson.getLastName());
        }

        // Clean-up
        //dao.deleteAll();
        System.out.println("Delete spiderman");
        dao.delete("Spider","Man");
    }
}
