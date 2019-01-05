package com.app.service;

import java.util.List;

import com.app.model.OrderMethod;

public interface IOrderMethodService {
	public	Integer saveOrderMethod(OrderMethod orderMethod);
	public  void    deleteOrderMethod(Integer id);
	public	 void    updateOrderMethod(OrderMethod orderMethod);
	public 	OrderMethod getOrderMethodById(Integer id);
	public List<OrderMethod> getAllOrderMethods();

}
