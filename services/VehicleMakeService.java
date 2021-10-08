package com.ph.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ph.fleetapp.models.VehicleMake;
import com.ph.fleetapp.repositories.VehicleMakeRepository;

@Service
public class VehicleMakeService {

	@Autowired
	private VehicleMakeRepository vehicleMakeRepository;
	
	public List<VehicleMake> getVehicleMakes(){
		return vehicleMakeRepository.findAll();
	}
	
	public void save(VehicleMake vehicleMake) {
		vehicleMakeRepository.save(vehicleMake);
	}
	
	public Optional<VehicleMake> findById(int id) {
		return vehicleMakeRepository.findById(id);
	}
	
	public void delete(Integer id) {
		vehicleMakeRepository.deleteById(id);
	}
	
}
