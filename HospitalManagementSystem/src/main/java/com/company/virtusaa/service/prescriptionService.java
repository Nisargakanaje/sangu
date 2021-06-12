package com.company.virtusaa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.virtusaa.entity.prescription;
import com.company.virtusaa.repository.prescriptionRepository;

@Service
@Transactional
public class prescriptionService implements Prescriptionserviceimpl {
	
	@Autowired
	private prescriptionRepository repository;

	@Override
	public void save(prescription Prescription) {
		repository.save(Prescription);
		
	}

	@Override
	public List<prescription> findByPatientName(String patientName) {
		return repository.findByPatientName(patientName);
	}
	

}


















//public void save(prescription Prescription) {
//repository.save(Prescription);
//}
//
//public List<prescription> findByPatientName(String patientName){
//
//	return repository.findByPatientName(patientName);
//}
