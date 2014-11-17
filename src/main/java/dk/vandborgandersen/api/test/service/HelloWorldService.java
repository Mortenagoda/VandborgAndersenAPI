package dk.vandborgandersen.api.test.service;

import dk.vandborgandersen.api.test.domain.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

/**
 * @author Morten Andersen (mortena@gmail.com)
 */
@Service
public interface HelloWorldService extends CrudRepository<HelloWorld, String> {

}
