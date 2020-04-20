package com.jpastart.author;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {
	@Id
	private int authorid;
	private String firstname;
	private String middlename;
	private String lastname;
	private int phoneno;
	public int getAuthorid() {
		return authorid;
	}
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	
	
	public Author() {
		super();
	}
	public Author(int authorid, String firstname, String middlename, String lastname, int phoneno) {
		super();
		this.authorid = authorid;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Author [authorid=" + authorid + ", firstname=" + firstname + ", middlename=" + middlename
				+ ", lastname=" + lastname + ", phoneno=" + phoneno + "]";
	}
	
	
	
}
