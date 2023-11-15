package com.laghridat.controle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laghridat.controle.entities.Employe;
import com.laghridat.controle.entities.Servicee;

import jakarta.persistence.Entity;

@Repository
public interface ServiceRepository extends JpaRepository<Servicee, Long>{

}
