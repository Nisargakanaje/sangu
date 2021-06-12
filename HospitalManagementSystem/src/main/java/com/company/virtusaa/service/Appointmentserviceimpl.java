package com.company.virtusaa.service;

import java.util.List;
import java.util.Optional;

import com.company.virtusaa.entity.appointment;

public interface Appointmentserviceimpl {
	List<appointment> listAll();
	void save(appointment appointment);
	 void delete(Integer id);
	 int setConfirmation(String confirmation, Integer id);
	 int setPrescription(String confirmation, Integer id);
	 Optional<appointment> get(Integer id) ;
	 List<appointment> findByPatientName(String patientName);
	 List<appointment> findByDoctorName(String doctorName);
	 List<appointment> findByDate(String date, String doctorName);
}
