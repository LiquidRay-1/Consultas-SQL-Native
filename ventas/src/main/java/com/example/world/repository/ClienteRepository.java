package com.example.world.repository;

import com.example.world.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Integer> {
    @Query("SELECT c FROM Cliente c WHERE c.id = :id")
    Cliente buscarPedidosCliente(@Param("id")Integer id);

    @Query(value = "SELECT * FROM Cliente WHERE id=:id", nativeQuery = true)
    Cliente buscarPedidosClienteNATIVE(@Param("id")Integer id);
}

