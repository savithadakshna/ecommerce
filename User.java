package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)

private int user_id;
	private String user_name;        
	public String address;
	private String contactno;

	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address= address;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	
	@Override
	public String toString(){
		return "user_id="+user_id+", user_name="+user_name+", address="+address+", contactno="+contactno;
	}
}

