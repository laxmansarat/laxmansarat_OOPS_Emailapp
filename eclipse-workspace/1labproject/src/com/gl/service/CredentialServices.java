package com.gl.service;

import com.gl.interfaces.ICredentials;
import java.util.Random;
import com.gl.model.Employee;

public class CredentialServices implements ICredentials {

	@Override
	public String generateEmailAddress(String firstName, String lastName, String department) {
	String rtnValue =null;
	rtnValue = firstName + lastName + "@" + department + ".greatlearning.com";
	
		return rtnValue;
	}

	@Override
	public String generatePassword() {
		
		String caps =  "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small = "abcdefghijklmnopqrstuvwxyz";
		String special = "@!$%^*";
		StringBuffer rtnValue =new StringBuffer();
		Random random = new Random();
		int rand = random.nextInt(caps.length());
			rtnValue.append(caps.charAt(rand));
			
			rand = random.nextInt(small.length());
			rtnValue.append(small.charAt(rand));
			
			rand = random.nextInt(special.length());
			rtnValue.append(special.charAt(rand));
	}
	@Override
	public void showICrendentials(Employee employee) {
		System.out.println(employee);
		
	}

	private Object n(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void showICredentials() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showICredentials(Employee emp) {
		// TODO Auto-generated method stub
		
	}

}



