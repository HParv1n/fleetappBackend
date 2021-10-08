package com.ph.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ph.fleetapp.models.Client;

@Repository
public interface ClientRepositroy extends JpaRepository<Client, Integer> {

}
