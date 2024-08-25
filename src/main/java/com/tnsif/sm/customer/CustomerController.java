package com.tnsif.sm.customer;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;



@RestController
public class CustomerController
{


@Autowired
private	CustomerService	service;




@GetMapping("/customers")
public	List<Customer>	list()
{
	return	service.listAll();
}
	@GetMapping("/customers/{customerID}")
	public	ResponseEntity<Customer>	get(@PathVariable	Integer	customerID)
	{
		try
		{
			Customer	customer=service.get(customerID);
			return	new	ResponseEntity<Customer>(customer,HttpStatus.OK);
		}
		catch(Exception e	)
		{
			return	new	ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
		
	}
	@PostMapping("/customers")
	public	void	add(@RequestBody	Customer	customer)
	{
		service.save(customer);
	}
	
		
		
	@PutMapping("/customers/{customerID}")
	public	ResponseEntity<?>	update(@RequestBody	Customer	customer,@PathVariable	Integer	customerID)
	{
		try
		{
			
			Customer	existcustomer=service.get(customerID);
			service.save(customer);
			return	new	ResponseEntity<Customer>(customer,HttpStatus.OK);
		}
		catch(Exception e	)
		{
			return	new	ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
		
}

		@DeleteMapping("/customers/{customerID}")
		public	void	delete(@PathVariable	Integer	customerID)
		{
			service.delete(customerID);
		}
	}


	

	