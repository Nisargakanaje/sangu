package com.company.virtusaa.service;

import java.util.List;

import com.company.virtusaa.entity.prescription;

public interface Prescriptionserviceimpl {
	public void save(prescription Prescription);
	public List<prescription> findByPatientName(String patientName);

}
