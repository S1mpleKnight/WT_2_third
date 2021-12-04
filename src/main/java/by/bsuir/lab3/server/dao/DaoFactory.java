package by.bsuir.lab3.server.dao;

import by.bsuir.lab3.server.dao.api.StudentInfoDao;
import by.bsuir.lab3.server.dao.api.UserDao;
import by.bsuir.lab3.server.dao.impl.StudentInfoDaoImpl;
import by.bsuir.lab3.server.dao.impl.UserDaoImpl;

public class DaoFactory {
    private final UserDao userDao = new UserDaoImpl();
    private final StudentInfoDao studentInfoDao = new StudentInfoDaoImpl();

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        return Holder.INSTANCE;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public StudentInfoDao getStudentInfoDao() {
        return studentInfoDao;
    }

    private static class Holder {
        static final DaoFactory INSTANCE = new DaoFactory();
    }
}
