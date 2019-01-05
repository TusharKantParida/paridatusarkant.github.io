package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IWhUserTypeDao;
import com.app.model.WhUserType;

@Repository
public class WhUserTypeDaoImpl implements IWhUserTypeDao {
	
	@Autowired
	private HibernateTemplate template;

	@Override
	public Integer saveWhUser(WhUserType userType) {
		return (Integer)template.save(userType);
	}

	@Override
	public void updateWhUser(WhUserType userType) {
	template.update(userType);
	}

	@Override
	public void deleteWhUser(Integer userId) {
	template.delete(userId);
	}

	@Override
	public WhUserType getWhUserTypeByType(Integer userId) {
		return template.get(WhUserType.class, userId);
	}

	@Override
	public List<WhUserType> getAllWhUsers() {
		return template.loadAll(WhUserType.class);
	}

}
