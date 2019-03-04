package almeida.fernando.myowncv.repository;

import almeida.fernando.myowncv.model.Qualification;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface QualificationRepository extends CrudRepository<Qualification, String> {

    Optional<List<Qualification>> findAllByFullName(String fullName);

}
