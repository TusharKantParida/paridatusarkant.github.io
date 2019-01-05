package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IOrderMethodDao;
import com.app.model.OrderMethod;

@Repository
public class OrderMethodDaoImpl implements IOrderMethodDao{
	@Autowired
	private HibernateTemplate template;

	@Override
	public Integer saveOrderMethod(OrderMethod orderMethod) {
		return (Integer)template.save(orderMethod);
	}

	@Override
	public void deleteOrderMethod(Integer id) {
		OrderMethod o=new OrderMethod();
		o.setOid(id);
		template.delete(o);
	}

	@Override
	public void updateOrderMethod(OrderMethod orderMethod) {
	template.update(orderMethod);
	}

	@Override
	public OrderMethod getOrderMethodById(Integer id) {
		return template.get(OrderMethod.class, id);
	}

	@Override
	public List<OrderMethod> getAllOrderMethods() {
		return template.loadAll(OrderMethod.class);
	}

}
