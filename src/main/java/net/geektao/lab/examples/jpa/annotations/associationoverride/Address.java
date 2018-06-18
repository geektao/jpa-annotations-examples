package net.geektao.lab.examples.jpa.annotations.associationoverride;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * 地址
 * 
 * @author geektao
 *
 */
@Entity
public class Address {

	@Id
	@Column(name = "ADDR_ID")
	private Integer id;
	private String zip;

	@OneToMany
	private List<PartTimeEmployee> employees = new ArrayList<PartTimeEmployee>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public List<PartTimeEmployee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<PartTimeEmployee> employees) {
		this.employees = employees;
	}

}
