package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SHIPMENT_TYPE_TAB")
public class ShipmentType {
	@Id
	@GeneratedValue
	@Column(name="sid")
	private Integer id;
	@Column(name="smode")
	private String shipMode;
	@Column(name="scode")
	private String shipCode;
	@Column(name="senbleship")
	private String enableShipment;
	@Column(name="sgrd")
	private String shipGrad;
	@Column(name="sdsc")
	private String shipDesc;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getShipMode() {
		return shipMode;
	}
	public void setShipMode(String shipMode) {
		this.shipMode = shipMode;
	}
	public String getShipCode() {
		return shipCode;
	}
	public void setShipCode(String shipCode) {
		this.shipCode = shipCode;
	}
	public String getEnableShipment() {
		return enableShipment;
	}
	public void setEnableShipment(String enableShipment) {
		this.enableShipment = enableShipment;
	}
	public String getShipGrad() {
		return shipGrad;
	}
	public void setShipGrad(String shipGrad) {
		this.shipGrad = shipGrad;
	}
	public String getShipDesc() {
		return shipDesc;
	}
	public void setShipDesc(String shipDesc) {
		this.shipDesc = shipDesc;
	}
	@Override
	public String toString() {
		return "ShipmentType [id=" + id + ", shipMode=" + shipMode + ", shipCode=" + shipCode + ", enableShipment="
				+ enableShipment + ", shipGrad=" + shipGrad + ", shipDesc=" + shipDesc + "]";
	}
	public ShipmentType() {
		super();
	}
	public ShipmentType(Integer id) {
		super();
		this.id = id;
	}
	
}
