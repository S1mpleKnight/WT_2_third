package by.bsuir.lab3.server.service.validator;

import by.bsuir.lab3.server.service.validator.impl.BirthdayValidatorImpl;
import by.bsuir.lab3.server.service.validator.impl.GradeBookValidatorImpl;
import by.bsuir.lab3.server.service.validator.impl.LoginPasswordValidatorImpl;
import by.bsuir.lab3.server.service.validator.impl.StudentInfoValidatorImpl;
import by.bsuir.lab3.server.service.validator.impl.UpdateStudentInfoValidatorImpl;

public class ValidatorFactory {

    private final Validator bithdayValidator = new BirthdayValidatorImpl();
    private final Validator gradeBookValidator = new GradeBookValidatorImpl();
    private final Validator loginPasswordValidator = new LoginPasswordValidatorImpl();
    private final Validator studentInfoValidator = new StudentInfoValidatorImpl();
    private final Validator updateStudentInfoValidator = new UpdateStudentInfoValidatorImpl();

    private ValidatorFactory() {
    }

    public static ValidatorFactory getInstance() {
        return Holder.INSTANCE;
    }

    public Validator getBithdayValidator() {
        return bithdayValidator;
    }

    public Validator getGradeBookValidator() {
        return gradeBookValidator;
    }

    public Validator getStudentInfoValidator() {
        return studentInfoValidator;
    }

    public Validator getUpdateStudentInfoValidator() {
        return updateStudentInfoValidator;
    }

    public Validator getLoginPasswordValidator() {
        return loginPasswordValidator;
    }

    private static class Holder {
        static final ValidatorFactory INSTANCE = new ValidatorFactory();
    }
}
