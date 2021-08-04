package cogent.capstone.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import cogent.capstone.modules.Owner;

@RepositoryRestResource()
public interface OwnerDao extends JpaRepository<Owner, Integer> {

}
