package com.app.dao;

import java.util.List;

import com.app.model.OrderMethod;
import com.app.model.ShipmentType;

public interface IOrderMethodDao {
public	Integer saveOrderMethod(OrderMethod orderMethod);
public  void    deleteOrderMethod(Integer id);
public	 void    updateOrderMethod(OrderMethod orderMethod);
public 	OrderMethod getOrderMethodById(Integer id);
public List<OrderMethod> getAllOrderMethods();
}
