package com.nissan.training.airline_project.dao;

import com.nissan.training.airline_project.pojo.Admin;

public interface IAdminDAO {
	abstract int addAdmin(Admin c) throws ClassNotFoundException;
	abstract int showAdmin(int id);
	abstract int showAllAdmin();
	abstract int updateAdmin(int id);
	abstract int delete(int id);
}
