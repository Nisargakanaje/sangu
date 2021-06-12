package com.company.virtusaa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.virtusaa.entity.invoice;
import com.company.virtusaa.repository.invoiceRepository;

@Service
@Transactional
public class invoiceservice implements Invoiceserviceimpl {

	@Autowired
	private invoiceRepository rep;

	@Override
	public void save(invoice entity) {
		rep.save(entity);
		
	}

	@Override
	public List<invoice> view() {
		return rep.findAll();
	}
	
	

}
