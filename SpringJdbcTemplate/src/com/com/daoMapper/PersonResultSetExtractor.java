package com.com.daoMapper;

import com.domainModel.Person;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Balaji on 6/12/17.
 */
public class PersonResultSetExtractor implements ResultSetExtractor {
    @Override
    public Object extractData(ResultSet resultSet) throws SQLException, DataAccessException {
        Person person = new Person();
        person.setFirstName(resultSet.getString(1));
        person.setLastName(resultSet.getString(2));
        return person;
    }
}
