package by.bsuir.lab3.server.dao.parser;

import by.bsuir.lab3.server.dao.parser.api.XMLStudentInfoParser;
import by.bsuir.lab3.server.dao.parser.api.XMLUserParser;
import by.bsuir.lab3.server.dao.parser.impl.XMLStudentInfoParserImpl;
import by.bsuir.lab3.server.dao.parser.impl.XMLUserParserImpl;

public class ParserFactory {

    private final XMLUserParser userParser = new XMLUserParserImpl();
    private final XMLStudentInfoParser studentInfoParser = new XMLStudentInfoParserImpl();

    public ParserFactory() {
    }

    public static ParserFactory getInstance() {
        return ParserFactory.Holder.INSTANCE;
    }

    public XMLUserParser getUserParser() {
        return userParser;
    }

    public XMLStudentInfoParser getStudentInfoParser() {
        return studentInfoParser;
    }

    private static class Holder {
        static final ParserFactory INSTANCE = new ParserFactory();
    }
}
