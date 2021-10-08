package com.ph.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ph.fleetapp.models.VehicleType;
import com.ph.fleetapp.repositories.VehicleTypeRepository;

@Service
public class VehicleTypeService {

	@Autowired
	private VehicleTypeRepository vehicleTypeServiceRepository;
	
	public List<VehicleType> getVehicleTypes(){
		return vehicleTypeServiceRepository.findAll();
	}
	
	public void save(VehicleType vehicleTypeService) {
		vehicleTypeServiceRepository.save(vehicleTypeService);
	}
	
	public Optional<VehicleType> findById(int id) {
		return vehicleTypeServiceRepository.findById(id);
	}
	
	public void delete(Integer id) {
		vehicleTypeServiceRepository.deleteById(id);
	}
	
}
