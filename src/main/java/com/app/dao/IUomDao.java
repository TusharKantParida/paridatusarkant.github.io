package com.app.dao;

import java.util.List;
import com.app.model.Uom;

public interface IUomDao {
	Integer saveUom(Uom uom);
	void    deleteUom(Integer id);
	void    updateUom(Uom uom);
	Uom getUomById(Integer id);
	List<Uom> getAllUom();


}
