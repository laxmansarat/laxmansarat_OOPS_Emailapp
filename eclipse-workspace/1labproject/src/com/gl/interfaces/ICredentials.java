package com.gl.interfaces;

import com.gl.model.Employee;

public interface ICredentials {

	public String generateEmailAddress(String firstName,String lastName,String department);
	public String generatePassword();
	public void showICrendentials(Employee employee);
	void showICredentials();
	void showICredentials(Employee emp);
	
	
	
	
	
}
