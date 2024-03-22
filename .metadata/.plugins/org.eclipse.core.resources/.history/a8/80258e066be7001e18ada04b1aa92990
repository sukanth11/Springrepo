package com.insuranceapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.insuranceapp.model.Insurance;
@Service
public class InsuranceServiceImpl implements IInsuranceService{

	@Override
	public List<Insurance> getAll() {
		List<Insurance> insurances=getAllInsurance();
		return insurances;
	}

	@Override
	public Insurance getById(int insuranceId) {
		List<Insurance> insurances=getAllInsurance();
		for(Insurance insurance:insurances)
			if(insurance.getInsuranceId()==insuranceId)
				return insurance;
		return null;
	}
	
	private List<Insurance> getAllInsurance(){
		return Arrays.asList(
				new Insurance(101,"vo-h001","voya","health",10,10000),
				new Insurance(102, "Bj-m01", "bajaj", "motor", 10, 5000),
				new Insurance(103, "fi-life", "fidelity", "life", 15, 20000),
				new Insurance(104, "vo-420", "voya", "health", 8, 15000));
	}	
}


