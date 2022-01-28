package takecare.demo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import takecare.demo.DB.PharmacieDB;
import takecare.demo.model.Pharmacies;

import java.util.Optional;

@Service
public class PharmacieBusiness {
    @Autowired
    private PharmacieDB pharmacieDB;

    public Iterable<Pharmacies> allPharmacies() {
        return pharmacieDB.findAll();
    }

    public Pharmacies getPharmacie(int id) {
        Optional<Pharmacies> pharmacie = pharmacieDB.findById(id);

        if (!pharmacie.isEmpty()) {
            return pharmacie.get();
        }
        return null;
    }


}
