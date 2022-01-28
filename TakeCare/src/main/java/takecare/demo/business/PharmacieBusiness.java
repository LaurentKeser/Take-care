package takecare.demo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import takecare.demo.DB.PharmacieDB;
import takecare.demo.model.Pharmacies;

@Service
public class PharmacieBusiness {
    @Autowired
    private PharmacieDB pharmacieDB;

    public Iterable<Pharmacies> allPharmacies() {
        return pharmacieDB.findAll();
    }


}
