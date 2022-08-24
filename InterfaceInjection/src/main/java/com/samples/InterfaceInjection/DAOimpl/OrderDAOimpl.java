package com.samples.InterfaceInjection.DAOimpl;

import org.springframework.stereotype.Component;

import com.samples.InterfaceInjection.DAO.OrderDAO;
@Component("dao")
public class OrderDAOimpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Create Order in mySQL DB");
	}

}
