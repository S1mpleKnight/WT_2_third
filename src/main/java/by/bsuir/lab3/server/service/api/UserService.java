package by.bsuir.lab3.server.service.api;

import by.bsuir.lab3.server.entity.User;
import by.bsuir.lab3.server.exeptions.ServiceException;

import java.util.Optional;

public interface UserService {
    Optional<User> login(String login, String password) throws ServiceException;
}
