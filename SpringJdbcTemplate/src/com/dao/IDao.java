package com.dao;

import com.domainModel.Person;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Balaji on 6/12/17.
 */
public interface IDao {
    void setDataSource(DataSource ds);

    void create(String firstName, String lastName);

    List<Person> select(String firstname, String lastname);

    List<Person> selectAll();

    void deleteAll();

    void delete(String firstName, String lastName);
}
