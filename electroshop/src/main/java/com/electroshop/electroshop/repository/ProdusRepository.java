package com.electroshop.electroshop.repository;

import com.electroshop.electroshop.model.Produs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdusRepository extends JpaRepository<Produs, Long> {
}
