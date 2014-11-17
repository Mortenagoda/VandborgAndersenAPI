package dk.vandborgandersen.api.security.web;

import dk.vandborgandersen.api.security.domain.Session;
import dk.vandborgandersen.api.security.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Morten Andersen (mortena@gmail.com)
 */
@RestController
public class AuthController {

    private AuthService authService;

    @RequestMapping("/helloAuth")
    public String test() {
        return "Hello world";
    }

    @RequestMapping("/sessions")
    public ResponseEntity addSession(Session session) {
        if (authService.authenticate(session)) {
            return new ResponseEntity<Session>(session, HttpStatus.OK);
        } else {
            return new ResponseEntity<Session>(new Session(), HttpStatus.UNAUTHORIZED);
        }
    }

    @Autowired
    public void setAuthService(AuthService authService) {
        this.authService = authService;
    }
}
