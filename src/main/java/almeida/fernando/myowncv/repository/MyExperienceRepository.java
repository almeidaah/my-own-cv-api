package almeida.fernando.myowncv.repository;

import almeida.fernando.myowncv.model.Experience;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface MyExperienceRepository extends CrudRepository<Experience, String> {

    Optional<List<Experience>> findAllByFullName(String fullName);

}
