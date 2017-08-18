package info.thuannho.jsfshop.entity;

public class ElectronicAddress extends BaseEntity {
	private ElectronicAddressType electronicAddressType;
	
	private String value;

	public ElectronicAddressType getElectronicAddressType() {
		return electronicAddressType;
	}

	public void setElectronicAddressType(ElectronicAddressType electronicAddressType) {
		this.electronicAddressType = electronicAddressType;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

		
}
