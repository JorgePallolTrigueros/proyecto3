package com.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Manufacture;

@Repository
public interface ManufactureRepository extends JpaRepository<Manufacture, Long>{

}
