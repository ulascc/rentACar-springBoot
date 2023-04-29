package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.dataAccess.abstracts.BransRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandManager  implements BrandService {

    BransRepository bransRepository;

    @Autowired
    public BrandManager(BransRepository bransRepository) {
        this.bransRepository = bransRepository;
    }

    @Override
    public List<Brand> getAll() {
        return bransRepository.getAll();
    }
}
