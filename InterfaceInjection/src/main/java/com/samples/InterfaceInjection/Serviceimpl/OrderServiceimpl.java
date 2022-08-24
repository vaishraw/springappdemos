package com.samples.InterfaceInjection.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.samples.InterfaceInjection.DAO.OrderDAO;
import com.samples.InterfaceInjection.Service.OrderService;

@Component("orderservice")
public class OrderServiceimpl implements OrderService {
	
	@Autowired
	@Qualifier("daoV2")
	private OrderDAO orderDAO;
	

	public OrderDAO getOrderDAO() {
		return orderDAO;
	}


	public void setOrderDAO(OrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}


	@Override
	public void placeOrder() {
		System.out.println("Inside OrderServiceimpl.placeOrder() Method...");
		orderDAO.createOrder();

	}

}
