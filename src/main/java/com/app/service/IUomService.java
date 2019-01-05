package com.app.service;

import java.util.List;

import com.app.model.Uom;

public interface IUomService {
	Integer saveUom(Uom uom);
	void    deleteUom(Integer id);
	void    updateUom(Uom uom);
	Uom getUomById(Integer id);
	List<Uom> getAllUom();

}
