package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IShipmentTypeDao;
import com.app.model.ShipmentType;

@Repository
public class ShipmentTypeDaoImpl implements IShipmentTypeDao{
	@Autowired
	private HibernateTemplate template;

	@Override
	public Integer saveShipmentType(ShipmentType shipmentType) {
		return (Integer)template.save(shipmentType);
	}

	@Override
	public void deleteShipmentType(Integer id) {
		template.delete(new ShipmentType(id));
		
	}

	@Override
	public void updateShipmentType(ShipmentType shipmentType) {
		template.update(shipmentType);
		
	}

	@Override
	public ShipmentType getShipmentTypeById(Integer id) {
		return template.get(ShipmentType.class, id);
	}

	@Override
	public List<ShipmentType> getAllShipmentTypes() {
		return template.loadAll(ShipmentType.class);
	}
	

}
