package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IUomDao;
import com.app.model.Uom;

@Repository 
public class UomDaoImpl implements IUomDao {
	@Autowired
	private HibernateTemplate template;

	@Override
	public Integer saveUom(Uom uom) {
	return (Integer)template.save(uom);
	}

	@Override
	public void deleteUom(Integer id) {
	template.delete(new Uom(id));
	}

	@Override
	public void updateUom(Uom uom) {
     template.update(uom);
	}

	@Override
	public Uom getUomById(Integer id) {
		return template.get(Uom.class,id);
	}

	@Override
	public List<Uom> getAllUom() {
		return template.loadAll(Uom.class);
	}

}
