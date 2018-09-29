package com.nissan.training.airline_project.dao;

import com.nissan.training.airline_project.pojo.Admin;

public interface IAdminDAO {
	abstract int addCustomer(Admin c);
	abstract int showCustomer(int id);
	abstract int showAllCustomer();
	abstract int updateCustomer(int id);
	abstract int delete(int id);
}
