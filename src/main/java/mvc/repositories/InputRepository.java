package mvc.repositories;

import mvc.models.InputModel;
import org.springframework.data.repository.CrudRepository;

public interface InputRepository extends CrudRepository<InputModel, Integer> {
}
