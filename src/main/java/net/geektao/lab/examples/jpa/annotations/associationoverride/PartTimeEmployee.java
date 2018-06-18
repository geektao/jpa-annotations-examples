package net.geektao.lab.examples.jpa.annotations.associationoverride;

import javax.persistence.AssociationOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;

/**
 * 兼职员工
 * 
 * @author geektao
 *
 */
@Entity
@AssociationOverride(name = "address", joinColumns = @JoinColumn(name = "ADDR_ID"))
public class PartTimeEmployee extends Employee {

	@Column(name = "WAGE")
	protected Float hourlyWage;

}
