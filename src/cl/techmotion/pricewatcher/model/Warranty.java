package cl.techmotion.pricewatcher.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the warranty database table.
 * 
 */
@Entity
public class Warranty implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String extended;

	private String type;

	//bi-directional many-to-one association to Price
	@ManyToOne
	private Price price;

	public Warranty() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExtended() {
		return this.extended;
	}

	public void setExtended(String extended) {
		this.extended = extended;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Price getPrice() {
		return this.price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

}