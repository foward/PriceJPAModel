package cl.techmotion.pricewatcher.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the specpc database table.
 * 
 */
@Entity
public class Specpc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String batterylong;

	private String bluetooth;

	private String color;

	private String cpuspeed;

	private String dimensions;

	private String hddcapacity;

	private String hdmi;

	private String manufacturer;

	private String model;

	private String opticunit;

	private String ports;

	private String processor;

	private String ram;

	private String ramexpandable;

	private String screen;

	private String so;

	private String webcamera;

	//bi-directional many-to-one association to Product
	@ManyToOne
	private Product product;

	public Specpc() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBatterylong() {
		return this.batterylong;
	}

	public void setBatterylong(String batterylong) {
		this.batterylong = batterylong;
	}

	public String getBluetooth() {
		return this.bluetooth;
	}

	public void setBluetooth(String bluetooth) {
		this.bluetooth = bluetooth;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCpuspeed() {
		return this.cpuspeed;
	}

	public void setCpuspeed(String cpuspeed) {
		this.cpuspeed = cpuspeed;
	}

	public String getDimensions() {
		return this.dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	public String getHddcapacity() {
		return this.hddcapacity;
	}

	public void setHddcapacity(String hddcapacity) {
		this.hddcapacity = hddcapacity;
	}

	public String getHdmi() {
		return this.hdmi;
	}

	public void setHdmi(String hdmi) {
		this.hdmi = hdmi;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOpticunit() {
		return this.opticunit;
	}

	public void setOpticunit(String opticunit) {
		this.opticunit = opticunit;
	}

	public String getPorts() {
		return this.ports;
	}

	public void setPorts(String ports) {
		this.ports = ports;
	}

	public String getProcessor() {
		return this.processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getRam() {
		return this.ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getRamexpandable() {
		return this.ramexpandable;
	}

	public void setRamexpandable(String ramexpandable) {
		this.ramexpandable = ramexpandable;
	}

	public String getScreen() {
		return this.screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public String getSo() {
		return this.so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public String getWebcamera() {
		return this.webcamera;
	}

	public void setWebcamera(String webcamera) {
		this.webcamera = webcamera;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}