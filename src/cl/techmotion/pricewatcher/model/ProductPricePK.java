package cl.techmotion.pricewatcher.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the product_price database table.
 * 
 */
@Embeddable
public class ProductPricePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="product_id")
	private Long productId;

	@Column(name="price_id")
	private Long priceId;

	public ProductPricePK() {
	}
	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getPriceId() {
		return this.priceId;
	}
	public void setPriceId(Long priceId) {
		this.priceId = priceId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProductPricePK)) {
			return false;
		}
		ProductPricePK castOther = (ProductPricePK)other;
		return 
			this.productId.equals(castOther.productId)
			&& this.priceId.equals(castOther.priceId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.productId.hashCode();
		hash = hash * prime + this.priceId.hashCode();
		
		return hash;
	}
}