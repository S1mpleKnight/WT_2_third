package by.bsuir.lab3.server.service.api;

import by.bsuir.lab3.server.entity.StudentInfo;
import by.bsuir.lab3.server.exeptions.ServiceException;

import java.util.List;
import java.util.Optional;

public interface StudentInfoService {
    List<StudentInfo> findAll() throws ServiceException;

    Optional<StudentInfo> findByGradeBookNumber(String gradeBookNumber) throws ServiceException;

    List<StudentInfo> findBySpeciality(String speciality) throws ServiceException;

    boolean saveStudentInfo(String name, String surname, String patronymic, String stringBirthday, String sex, String gradeBookNumber, String speciality) throws ServiceException;

    boolean updateStudentInfoByGradeBookNumber(String gradeBookNumberToSearch, String name, String surname, String patronymic, String stringBirthday, String sex, String gradeBookNumber, String speciality) throws ServiceException;
}
