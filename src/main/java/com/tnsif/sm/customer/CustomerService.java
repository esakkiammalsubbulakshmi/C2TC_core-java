package com.tnsif.sm.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public	class	CustomerService
{

@Autowired
private	CustomerRepository	repo;

public	List<Customer>	listAll()

{
	return	repo.findAll();
}

public Customer get(Integer customerID) {
	
	return	repo.findById(customerID).get();
}
public	void	save(Customer	customer)
{
	repo.save(customer);
}

public void delete(Integer customerID) 
{
    repo.deleteById(customerID);
}



	}
	