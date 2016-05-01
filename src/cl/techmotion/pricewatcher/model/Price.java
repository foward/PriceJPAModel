package cl.techmotion.pricewatcher.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the price database table.
 * 
 */
@Entity
public class Price implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Temporal(TemporalType.DATE)
	private Date dateobtained;

	private Boolean isadeal;

	@Temporal(TemporalType.DATE)
	private Date lastupdate;

	private String price;

	private Boolean pricedependsbuycard;

	private Boolean priceonlyinternet;

	private String producturl;

	//bi-directional many-to-one association to Product
	@ManyToOne
	private Product product;

	//bi-directional many-to-one association to Store
	@OneToMany(mappedBy="price")
	private List<Store> stores;

	//bi-directional many-to-one association to Warranty
	@OneToMany(mappedBy="price")
	private List<Warranty> warranties;

	public Price() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateobtained() {
		return this.dateobtained;
	}

	public void setDateobtained(Date dateobtained) {
		this.dateobtained = dateobtained;
	}

	public Boolean getIsadeal() {
		return this.isadeal;
	}

	public void setIsadeal(Boolean isadeal) {
		this.isadeal = isadeal;
	}

	public Date getLastupdate() {
		return this.lastupdate;
	}

	public void setLastupdate(Date lastupdate) {
		this.lastupdate = lastupdate;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Boolean getPricedependsbuycard() {
		return this.pricedependsbuycard;
	}

	public void setPricedependsbuycard(Boolean pricedependsbuycard) {
		this.pricedependsbuycard = pricedependsbuycard;
	}

	public Boolean getPriceonlyinternet() {
		return this.priceonlyinternet;
	}

	public void setPriceonlyinternet(Boolean priceonlyinternet) {
		this.priceonlyinternet = priceonlyinternet;
	}

	public String getProducturl() {
		return this.producturl;
	}

	public void setProducturl(String producturl) {
		this.producturl = producturl;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Store> getStores() {
		return this.stores;
	}

	public void setStores(List<Store> stores) {
		this.stores = stores;
	}

	public Store addStore(Store store) {
		getStores().add(store);
		store.setPrice(this);

		return store;
	}

	public Store removeStore(Store store) {
		getStores().remove(store);
		store.setPrice(null);

		return store;
	}

	public List<Warranty> getWarranties() {
		return this.warranties;
	}

	public void setWarranties(List<Warranty> warranties) {
		this.warranties = warranties;
	}

	public Warranty addWarranty(Warranty warranty) {
		getWarranties().add(warranty);
		warranty.setPrice(this);

		return warranty;
	}

	public Warranty removeWarranty(Warranty warranty) {
		getWarranties().remove(warranty);
		warranty.setPrice(null);

		return warranty;
	}

}