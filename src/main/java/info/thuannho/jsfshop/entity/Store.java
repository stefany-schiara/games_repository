package info.thuannho.jsfshop.entity;

import java.util.List;

public class Store extends BaseEntity {

	private String storeName;
	
	private Address address;

	private List<ProductStore> products;
	
	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<ProductStore> getProducts() {
		return products;
	}

	public void setProducts(List<ProductStore> products) {
		this.products = products;
	}
	
}
