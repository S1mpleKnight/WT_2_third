package by.bsuir.lab3.server.service.impl;

import by.bsuir.lab3.server.dao.DaoFactory;
import by.bsuir.lab3.server.dao.api.UserDao;
import by.bsuir.lab3.server.entity.User;
import by.bsuir.lab3.server.exeptions.DaoException;
import by.bsuir.lab3.server.exeptions.ServiceException;
import by.bsuir.lab3.server.service.api.UserService;

import java.util.Optional;

public class UserServiceImpl implements UserService {
    @Override
    public Optional<User> login(String login, String password) throws ServiceException {
        if (login == null || password == null) {
            return Optional.empty();
        }
        try {
            UserDao userDao = DaoFactory.getInstance().getUserDao();
            return userDao.findByLoginAndPassword(login, password);
        } catch (DaoException e) {
            throw new ServiceException(e.getMessage(), e);
        }
    }
}
