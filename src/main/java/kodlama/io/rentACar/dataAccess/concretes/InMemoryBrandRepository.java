package kodlama.io.rentACar.dataAccess.concretes;

import kodlama.io.rentACar.dataAccess.abstracts.BransRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryBrandRepository implements BransRepository {
    List<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"bmw"));
        brands.add(new Brand(2,"mercedes"));
        brands.add(new Brand(3,"audi"));
        brands.add(new Brand(4,"fiat"));
    }

    @Override
    public List<Brand> getAll() {
        return brands ;
    }
}
