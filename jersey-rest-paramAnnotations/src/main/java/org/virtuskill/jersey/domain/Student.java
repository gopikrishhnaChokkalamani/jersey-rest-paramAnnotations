package org.virtuskill.jersey.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

	private long id;
	private String name;
	private Date admissionDate;
	private String section;
	private String school;

	public Student() {
		this.admissionDate = new Date();
	}

	public Student(long id, String name, String section, String school) {
		super();
		this.id = id;
		this.name = name;
		this.admissionDate = new Date();
		this.section = section;
		this.school = school;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}
	
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
}
