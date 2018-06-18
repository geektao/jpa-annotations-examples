package net.geektao.lab.examples.jpa.annotations.associationoverrides;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
public class Employee {
	@Id 
	protected Integer id;
	@Version 
	protected Integer version;
	@ManyToOne 
	protected Address address;
}
