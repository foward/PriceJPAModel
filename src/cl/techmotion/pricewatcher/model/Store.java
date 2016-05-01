package cl.techmotion.pricewatcher.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the store database table.
 * 
 */
@Entity
public class Store implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String url;

	//bi-directional many-to-one association to Price
	@ManyToOne
	private Price price;

	public Store() {
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

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Price getPrice() {
		return this.price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

}