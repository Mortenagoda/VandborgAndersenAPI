package dk.vandborgandersen.api.security.service;

import dk.vandborgandersen.api.security.domain.Session;
import dk.vandborgandersen.api.security.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @author Morten Andersen (mortena@gmail.com)
 */
@Component
public class AuthService {

    private DataSource dataSource;
    private UserService userService;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public boolean authenticate(Session session) {
        User user = userService.findByUsername(session.getUsername());
        if (user == null) {
            session.setUsernameNotFound(true);
        } else if (!session.getPassword().equals(user.getPassword())) {
            session.setIncorrectPassword(true);
        } else {
            session.setAuthenticated(true);
            session.setPassword("");
            return true;
        }
        return false;
    }
}
