package cogent.capstone.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import cogent.capstone.modules.Customer;

//@CrossOrigin("http://localhost:1053")
@RepositoryRestResource()
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
