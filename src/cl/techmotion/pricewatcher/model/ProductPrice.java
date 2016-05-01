package cl.techmotion.pricewatcher.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the product_price database table.
 * 
 */
@Entity
@Table(name="product_price")
public class ProductPrice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private ProductPricePK id;

	public ProductPrice() {
	}

	public ProductPricePK getId() {
		return this.id;
	}

	public void setId(ProductPricePK id) {
		this.id = id;
	}

}