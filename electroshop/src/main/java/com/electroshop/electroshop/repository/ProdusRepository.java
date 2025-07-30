package com.electroshop.electroshop.repository;

import com.electroshop.electroshop.model.Produs;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface ProdusRepository extends JpaRepository<Produs, Long> {
    List<Produs> findByBrandContainingIgnoreCase(String brand);
    List<Produs> findByCategorieId(Long categorieId);



}
