package br.com.ivo.awesome.model;

import javax.persistence.Entity;

@Entity
public class Student extends AbstratctEntity  {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
