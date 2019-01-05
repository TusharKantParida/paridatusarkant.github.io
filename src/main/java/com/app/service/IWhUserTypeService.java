package com.app.service;

import java.util.List;

import com.app.model.WhUserType;

public interface IWhUserTypeService {
	public Integer saveWhUser(WhUserType userType);
	public void updateWhUser(WhUserType userType);
	public void deleteWhUser(Integer userId);
	public WhUserType getWhUserTypeByType(Integer userId);
	public List<WhUserType> getAllWhUsers();
}
