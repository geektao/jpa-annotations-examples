package net.geektao.lab.examples.jpa.annotations.associationoverride;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

/**
 * 员工
 * 
 * @author geektao
 *
 */
@MappedSuperclass
public class Employee {
	@Id
	protected Integer id;
	@Version
	protected Integer version;
	@ManyToOne
	protected Address address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
