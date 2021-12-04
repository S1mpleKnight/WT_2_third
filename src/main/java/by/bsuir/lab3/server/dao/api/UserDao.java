package by.bsuir.lab3.server.dao.api;

import by.bsuir.lab3.server.entity.User;
import by.bsuir.lab3.server.exeptions.DaoException;

import java.util.Optional;

public interface UserDao {
    Optional<User> findByLoginAndPassword(String login, String password) throws DaoException;
}
