package com.xcelenergy.registration.dao;

import java.io.Serializable;

import org.hibernate.Session;

import com.xcelenergy.registration.model.Customer;
import com.xcelenergy.registration.utils.DBSessionManagement;

public class CustomerDAO {

	public static long saveCustomer(Customer customer) throws Exception {
		
		Session session = DBSessionManagement.getSessionFactory().openSession();
		long customerId;
		try {
			session.beginTransaction();
			Serializable generatedId = session.save(customer);
			System.out.println(generatedId);
			customerId= Long.parseLong(generatedId.toString());
			System.out.println("customerID "+customerId);
			session.getTransaction().commit();
		} catch (Exception e) {
			throw e;
		}finally {
			DBSessionManagement.shutdown();
		}
		return customerId;
	}
}
