package cl.techmotion.pricewatcher.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the product database table.
 * 
 */
@Entity
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String description;

	private String name;

	private String picturepath;

	//bi-directional many-to-one association to Price
	@OneToMany(mappedBy="product")
	private List<Price> prices;

	//bi-directional many-to-one association to Category
	@ManyToOne
	private Category category;

	//bi-directional many-to-one association to Manufacturer
	@ManyToOne
	private Manufacturer manufacturer;

	//bi-directional many-to-one association to Specpc
	@OneToMany(mappedBy="product")
	private List<Specpc> specpcs;

	public Product() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicturepath() {
		return this.picturepath;
	}

	public void setPicturepath(String picturepath) {
		this.picturepath = picturepath;
	}

	public List<Price> getPrices() {
		return this.prices;
	}

	public void setPrices(List<Price> prices) {
		this.prices = prices;
	}

	public Price addPrice(Price price) {
		getPrices().add(price);
		price.setProduct(this);

		return price;
	}

	public Price removePrice(Price price) {
		getPrices().remove(price);
		price.setProduct(null);

		return price;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Manufacturer getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public List<Specpc> getSpecpcs() {
		return this.specpcs;
	}

	public void setSpecpcs(List<Specpc> specpcs) {
		this.specpcs = specpcs;
	}

	public Specpc addSpecpc(Specpc specpc) {
		getSpecpcs().add(specpc);
		specpc.setProduct(this);

		return specpc;
	}

	public Specpc removeSpecpc(Specpc specpc) {
		getSpecpcs().remove(specpc);
		specpc.setProduct(null);

		return specpc;
	}

}