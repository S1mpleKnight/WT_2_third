package by.bsuir.lab3.server.dao.api;

import by.bsuir.lab3.server.entity.StudentInfo;
import by.bsuir.lab3.server.exeptions.DaoException;

import java.util.List;
import java.util.Optional;

public interface StudentInfoDao {
    List<StudentInfo> findAll() throws DaoException;

    Optional<StudentInfo> findByGradeBookNumber(String gradeBookNumber) throws DaoException;

    List<StudentInfo> findBySpeciality(String gradeBookNumber) throws DaoException;

    void updateStudentInfoByGradeBookNumber(String gradeBookNumber,StudentInfo studentInfo) throws DaoException;

    void saveStudentInfo(StudentInfo studentInfo) throws DaoException;
}
