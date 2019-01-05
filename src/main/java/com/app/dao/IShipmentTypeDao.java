package com.app.dao;

import java.util.List;

import com.app.model.ShipmentType;

public interface IShipmentTypeDao {
	Integer saveShipmentType(ShipmentType shipmentType);
	void    deleteShipmentType(Integer id);
	void    updateShipmentType(ShipmentType shipmentType);
	ShipmentType getShipmentTypeById(Integer id);
	List<ShipmentType> getAllShipmentTypes();

}
