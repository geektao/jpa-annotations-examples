package net.geektao.lab.examples.jpa.annotations.associationoverrides;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;

@Entity
@AssociationOverrides({ @AssociationOverride(name = "address", joinColumns = @JoinColumn(name = "ADDR_ID")),
		@AssociationOverride(name = "id", joinColumns = @JoinColumn(name = "PTID")) })
public class PartTimeEmployee extends Employee {

	@Column(name = "WAGE")
	protected Float hourlyWage;

}
