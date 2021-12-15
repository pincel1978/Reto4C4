package com.cuatroa.retodos.repository;

import com.cuatroa.retodos.model.Clone;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cuatroa.retodos.repository.crud.CloneCrudRepository;

/**
 *
 * @author desaextremo
 */
@Repository
public class CloneRepository {
    @Autowired
    private CloneCrudRepository gatgetCrudRepository;

    public List<Clone> getAll() {
        return gatgetCrudRepository.findAll();
    }

    public Optional<Clone> getClone(int productId) {
        return gatgetCrudRepository.findById(productId);
    }
    
    public Clone create(Clone gadget) {
        return gatgetCrudRepository.save(gadget);
    }

    public void update(Clone product) {
        gatgetCrudRepository.save(product);
    }
    
    public void delete(Clone product) {
        gatgetCrudRepository.delete(product);
    }
    
    public List<Clone> clonesByPrice(double precio){
        return gatgetCrudRepository.findByPriceLessThanEqual(precio);
    }
}
