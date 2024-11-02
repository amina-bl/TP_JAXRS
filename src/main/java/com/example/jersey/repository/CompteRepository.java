package com.example.jersey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jersey.entity.Compte;

public interface CompteRepository extends JpaRepository<Compte, Long>{

}
