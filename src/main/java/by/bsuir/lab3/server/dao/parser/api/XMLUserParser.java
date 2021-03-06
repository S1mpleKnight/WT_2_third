package by.bsuir.lab3.server.dao.parser.api;

import by.bsuir.lab3.server.entity.User;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Optional;

public interface XMLUserParser {
    Optional<User> takeUser(String path, String login, String password) throws IOException, SAXException, ParserConfigurationException;
}
