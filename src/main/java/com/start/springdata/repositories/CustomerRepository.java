package main.java.com.start.springdata.repositories;

import main.java.com.start.springdata.entities.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by ÊAnita on 13/5/2018.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}