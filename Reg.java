package com.niit.model;

import javax.persistence.Entity;

@Entity
public class Reg {
	
	 private String  firstname;
	 private String lastname;
	   private String emailaddress;
	   private String password;
	   private String residence;
	   private String cityname;
	   private String phoneno;
	   
	   
	 public String getfirstname() {
	      return firstname;
	   }
	   
	   public void setfirstname(String firstname) {
	      this.firstname = firstname;
	   }
	   

	   public String getlastname() {
		      return lastname;
		   }
		   
		   public void setlastname(String lastname) {
		      this.lastname = lastname;
		   }

		   public String getemailaddress() {
			      return emailaddress;
			   }
			   
			   public void setemailaddress(String emailaddress) {
			      this.emailaddress = emailaddress;
			   }
			   public String getpassword() {
				      return password;
				   }
				   
				   public void setpassword(String password) {
				      this.password= password;
				   }
				   public String getresidence() {
					      return residence;
					   }
					   
					   public void setresidence(String residence) {
					      this.residence =residence;
					   }
					   public String getcityname() {
						      return cityname;
						   }
						   
						   public void setcityname(String cityname) {
						      this.cityname = cityname;
						   }
						   public String getphoneno() {
							      return phoneno;
							   }
							   
							   public void setphoneno(String phoneno) {
							      this.phoneno = phoneno;
							   }
}


