package com.insuranceapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insuranceapp.exception.InsuranceNotFoundException;
import com.insuranceapp.model.Insurance;
import com.insuranceapp.repository.IInsuranceRepository;
@Service
public class InsuranceServiceImpl implements IInsuranceService{

	
	@Autowired
	private IInsuranceRepository insuranceRepository;
	
	public IInsuranceRepository getInsuranceRepository() {
		return insuranceRepository;
	}

	public void setInsuranceRepository(IInsuranceRepository insuranceRepository) {
		this.insuranceRepository = insuranceRepository;
	}

	@Override
	public List<Insurance> getAll() {
		List<Insurance> insurances=insuranceRepository.findAll();
		return null;
	}

	@Override
	public Insurance getById(int insuranceId) {
		
//		List<Insurance> insurances=(List<Insurance>) insuranceRepository.findById(insuranceId);
//		for(Insurance insurance:insurances)
//			if(insurance.getInsuranceId()==insuranceId)
//				return insurance;
		return insuranceRepository.findById(insuranceId);
	}
	
//	private List<Insurance> getAllInsurance(){
//		return Arrays.asList(
//				new Insurance(101,"vo-h001","voya","health",10,10000),
//				new Insurance(102, "Bj-m01", "bajaj", "motor", 10, 5000),
//				new Insurance(103, "fi-life", "fidelity", "life", 15, 20000),
//				new Insurance(104, "vo-420", "voya", "health", 8, 15000));
//	}

	@Override
	public void addInsurance(Insurance insurance) {
		insuranceRepository.addInsurance(insurance);
		
	}

	@Override
	public void updateInsurance(int insuranceId, double premium) {
		insuranceRepository.updateInsurance(insuranceId, premium);
		
	}

	@Override
	public void deleteInsurance(int insuranceId) {
		insuranceRepository.deleteInsurance(insuranceId);
		
		
	}

	@Override
	public List<Insurance> getByBrand(String brand) throws InsuranceNotFoundException {
		return insuranceRepository.findByBrand(brand);
	}

	@Override
	public List<Insurance> getByBrandAndType(String brand, String type) throws InsuranceNotFoundException {
		return insuranceRepository.findByBrandAndType(brand, type);
	}

	@Override
	public List<Insurance> getByTypeAndLessPremium(String type, double premium) throws InsuranceNotFoundException {
		return insuranceRepository.findByTypeAndLessPremium(type, premium);
	}	
}


