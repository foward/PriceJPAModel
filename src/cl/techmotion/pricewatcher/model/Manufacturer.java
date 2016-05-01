package cl.techmotion.pricewatcher.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the manufacturer database table.
 * 
 */
@Entity
public class Manufacturer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String name;

	//bi-directional many-to-one association to Product
	@OneToMany(mappedBy="manufacturer")
	private List<Product> products;

	public Manufacturer() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product addProduct(Product product) {
		getProducts().add(product);
		product.setManufacturer(this);

		return product;
	}

	public Product removeProduct(Product product) {
		getProducts().remove(product);
		product.setManufacturer(null);

		return product;
	}

}