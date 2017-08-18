package info.thuannho.jsfshop.entity;

import java.util.Currency;

public class Product {
	private String name;
	
	private ProductCategory category;
	
	private Currency buyPrice;
	
	private Currency salePrice;
	
	private Manufacturer manufacturer;
	
	/**
	 * Example: 5%
	 */
	private Integer tax;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductCategory getCategory() {
		return category;
	}

	public void setCategory(ProductCategory category) {
		this.category = category;
	}

	public Currency getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(Currency buyPrice) {
		this.buyPrice = buyPrice;
	}

	public Currency getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Currency salePrice) {
		this.salePrice = salePrice;
	}

	public Integer getTax() {
		return tax;
	}

	public void setTax(Integer tax) {
		this.tax = tax;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	
}
