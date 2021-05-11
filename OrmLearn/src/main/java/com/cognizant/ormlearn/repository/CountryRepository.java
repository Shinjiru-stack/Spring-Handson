package com.cognizant.ormlearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Country;

//Annotate withh @Repository
@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
}