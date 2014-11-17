package dk.vandborgandersen.api.security.service;

import dk.vandborgandersen.api.security.domain.APIToken;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Morten Andersen (mortena@gmail.com)
 */
public interface APITokenService extends CrudRepository<APIToken, String> {

}
