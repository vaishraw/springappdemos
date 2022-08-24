package com.samples.InterfaceInjection.DAOimpl;

import org.springframework.stereotype.Component;

import com.samples.InterfaceInjection.DAO.OrderDAO;
@Component("daoV2")
public class OrderDAOimplV2 implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Create Order using Oracle DB");
		
	}

}
