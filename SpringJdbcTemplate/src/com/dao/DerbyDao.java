package com.dao;

import com.com.daoMapper.PersonRowMapper;
import com.domainModel.Person;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Balaji on 6/12/17.
 */
public class DerbyDao implements IDao{
    private DataSource dataSource;

    public void setDataSource(DataSource ds) {
        dataSource = ds;
    }

    public void create(String firstName, String lastName) {
        JdbcTemplate insert = new JdbcTemplate(dataSource);
        insert.update("INSERT INTO `LabTables`.`Person` (`FIRSTNAME`, `LASTNAME`) VALUES (?,?);",
                new Object[] { firstName, lastName });
    }
//"insert into register (name,email,pswd) values(?,?,?)"
    //INSERT INTO `LabTables`.`Person` (`FIRSTNAME`, `LASTNAME`) VALUES ('Gokul', 'M');
    public List<Person> select(String firstname, String lastname) {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select
                .query(
                        "select  FIRSTNAME, LASTNAME from Person where FIRSTNAME = ? AND LASTNAME= ?",
                        new Object[] { firstname, lastname },
                        new PersonRowMapper());
    }

    public List<Person> selectAll() {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("select FIRSTNAME, LASTNAME from Person",
                new PersonRowMapper());
    }

    public void deleteAll() {
        JdbcTemplate delete = new JdbcTemplate(dataSource);
        delete.update("DELETE from Person");
    }

    public void delete(String firstName, String lastName) {
        JdbcTemplate delete = new JdbcTemplate(dataSource);
        delete.update("DELETE from Person where FIRSTNAME= ? AND LASTNAME = ?",
                new Object[] { firstName, lastName });
    }
}
