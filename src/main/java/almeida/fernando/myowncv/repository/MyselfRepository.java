package almeida.fernando.myowncv.repository;

import almeida.fernando.myowncv.model.MySelf;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MyselfRepository extends CrudRepository<MySelf, String> {

    Optional<MySelf> findByFullName(String fullName);

}
