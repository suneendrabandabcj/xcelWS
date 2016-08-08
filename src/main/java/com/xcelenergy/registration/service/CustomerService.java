package com.xcelenergy.registration.service;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.xcelenergy.registration.dao.CustomerDAO;
import com.xcelenergy.registration.model.Customer;

/**
 * provide methods for customer registration and to register for service plan.
 * 
 * @author Bootcamp User 000
 *
 */
public class CustomerService {

	/**
	 * register customer
	 * 
	 * @param customer
	 * @throws Exception
	 */
	public void registerCustomer(Customer customer) throws Exception {
		long customerId = CustomerDAO.saveCustomer(customer);
		getCustomerDetailsById(customerId);
		PowerService.getServicePlans();
	}

	/**
	 * Get Customer details by ID by using REST call
	 * 
	 * @param customerId
	 */
	public void getCustomerDetailsById(long customerId) {

		Client client = Client.create();
		WebResource webResource = client
				.resource("http://localhost:8080/XcelCustomerWS/rest/CustomerService/getCustomer/" + customerId);
		ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
		if (response.getStatus() != 201) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
		} else {
			Customer customerDetails = response.getEntity(Customer.class);
			System.out.println("*****************Customer Details******************");
			System.out.println("CustomerID: "+customerDetails.getCustomerId());
			System.out.println("CustomerName: "+customerDetails.getFirstName()+", "+customerDetails.getLastName());
			System.out.println("CustomerEmail: "+customerDetails.getEmail());
			
		}
	}
}
