package dk.vandborgandersen.api.security.service;

import dk.vandborgandersen.api.security.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 * @author Morten Andersen (mortena@gmail.com)
 */
@Service
public interface UserService extends CrudRepository<User, String> {

    public User findByUsername(String username);

}
