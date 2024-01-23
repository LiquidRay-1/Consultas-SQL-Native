package com.example.world.repository;

import com.example.world.model.Comercial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComercialRepository extends JpaRepository<Comercial,Integer> {
}
