package by.bsuir.lab3.server.service;

import by.bsuir.lab3.server.service.api.StudentInfoService;
import by.bsuir.lab3.server.service.api.UserService;
import by.bsuir.lab3.server.service.impl.StudentInfoServiceImpl;
import by.bsuir.lab3.server.service.impl.UserServiceImpl;

public class ServiceFactory {

    private final UserService userService = new UserServiceImpl();
    private final StudentInfoService studentInfoService = new StudentInfoServiceImpl();

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return Holder.INSTANCE;
    }

    public UserService getUserService() {
        return userService;
    }

    public StudentInfoService getStudentInfoService() {
        return studentInfoService;
    }

    private static class Holder {
        static final ServiceFactory INSTANCE = new ServiceFactory();
    }
}
