package com.nissan.training.airline_project.utilities;

import com.nissan.training.airline_project.dao.AdminDAOImplementation;
import com.nissan.training.airline_project.pojo.Admin;

public class RegisterAdmin extends Register{

	@Override
	public int register() {
		// TODO Auto-generated method stub
		Admin admin = new Admin(getName(),getEmail(),getPassword()(),getDob(),getContact()));
		AdminDAOImplementation adminDao = new AdminDAOImplementation();
		adminDao.addAdmin(admin);
		return 0;
	}
	
	

}
