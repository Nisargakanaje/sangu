package com.company.virtusaa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.virtusaa.entity.invoice;


public interface invoiceRepository extends JpaRepository<invoice,Integer> {

}