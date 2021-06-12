package com.company.virtusaa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.virtusaa.entity.prescription;

public interface prescriptionRepository extends JpaRepository<prescription,String> {

	List<prescription> findByPatientName(String patientName);
}
