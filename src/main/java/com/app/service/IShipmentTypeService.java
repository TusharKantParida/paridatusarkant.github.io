package com.app.service;

import java.util.List;

import com.app.model.ShipmentType;

public interface IShipmentTypeService {
	Integer saveShipmentType(ShipmentType shipmentType);
	void    deleteShipmentType(Integer id);
	void    updateShipmentType(ShipmentType shipmentType);
	ShipmentType getShipmentTypeById(Integer id);
	List<ShipmentType> getAllShipmentTypes();

}
