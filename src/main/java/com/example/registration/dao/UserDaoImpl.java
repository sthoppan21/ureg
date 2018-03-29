package com.example.registration.dao;

import com.example.registration.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;

@Component
public class UserDaoImpl implements UserDao {
    JdbcTemplate jdbcTemplate;

    private final String SQL_INSERT_PERSON =
            "insert into regtab (id, firstname, middlename, surname, age, dob, address1, address2, state, pincode, email, mobilenumber  ) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    @Autowired
    public UserDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    public boolean createUser(User user) {
        System.out.println(user.getSurname());
        return jdbcTemplate.update(SQL_INSERT_PERSON, user.getId(), user.getfirstname(), user.getmiddlename(), user.getSurname(), user.getAge(), user.getDob(), user.getAddress1(), user.getAddress2(), user.getState(),
                user.getPincode(), user.getEmail(), user.getMobilenumber()) > 0;
    }
}
