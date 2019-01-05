package com.app.servive.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IWhUserTypeDao;
import com.app.model.WhUserType;
import com.app.service.IWhUserTypeService;

@Service
public class WhUserTypeServiceImpl implements IWhUserTypeService {

	@Autowired
	private IWhUserTypeDao dao;
	
	@Transactional
	public Integer saveWhUser(WhUserType userType) {
		return (Integer)dao.saveWhUser(userType);
	}

	@Transactional
	public void updateWhUser(WhUserType userType) {
	dao.updateWhUser(userType);
	}

	@Transactional
	public void deleteWhUser(Integer userId) {
	dao.deleteWhUser(userId);
	}

	@Transactional(readOnly=true)
	public WhUserType getWhUserTypeByType(Integer userId) {
		return dao.getWhUserTypeByType(userId);
	}

	@Transactional(readOnly=true)
	public List<WhUserType> getAllWhUsers() {
		return dao.getAllWhUsers();
	}

}
