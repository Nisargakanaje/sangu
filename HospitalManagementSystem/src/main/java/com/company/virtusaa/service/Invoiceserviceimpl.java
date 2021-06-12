package com.company.virtusaa.service;

import java.util.List;

import com.company.virtusaa.entity.invoice;

public interface Invoiceserviceimpl {
	public void save(invoice entity);
	public List<invoice> view();

}
