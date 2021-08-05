package cogent.capstone.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import cogent.capstone.modules.Property;

@RepositoryRestResource
public interface PropertyRepository extends JpaRepository<Property, Integer> {

}