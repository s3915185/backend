package com.example.springbootkafkaredis.repository;


import com.example.springbootkafkaredis.model.ManufacturingOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturingOrderRepository extends JpaRepository<ManufacturingOrder, Integer> {
}
