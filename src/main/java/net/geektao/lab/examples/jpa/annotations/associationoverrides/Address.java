package net.geektao.lab.examples.jpa.annotations.associationoverrides;

public class Address {

	private Integer id;
	private String zip;

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

}
