package info.thuannho.jsfshop.entity;

/**
 * Present of each product in store
 * @author Gau
 *
 */
public class ProductStore extends BaseEntity {
	private Product product;
	
	private Integer quantity;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public ProductStore(Product product, Integer quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}
	
	
}
