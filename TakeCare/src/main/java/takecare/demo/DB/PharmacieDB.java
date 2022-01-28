package takecare.demo.DB;

import org.springframework.data.repository.CrudRepository;
import takecare.demo.model.Pharmacies;

public interface PharmacieDB extends CrudRepository<Pharmacies, Integer> {
}
