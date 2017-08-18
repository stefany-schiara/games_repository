package info.thuannho.jsfshop.entity;


public class Manufacturer extends BaseEntity{
	private String name;
	
	private ElectronicAddress electronicAddress;
	
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ElectronicAddress getElectronicAddress() {
		return electronicAddress;
	}

	public void setElectronicAddress(ElectronicAddress electronicAddress) {
		this.electronicAddress = electronicAddress;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
