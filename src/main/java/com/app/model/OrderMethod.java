package com.app.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;


@Entity
@Table(name="ordmethod")
public class OrderMethod {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="oid")
	private Integer oid;
	@Column(name="oMode")
	private String orderMode;
	@Column(name="oCode")
	private String orderCode;
	@Column(name="eType")
	private String exeType;
	@Column(name="oDsc")
	private String orderDesc;
	
	@ElementCollection(fetch=FetchType.EAGER)
	@CollectionTable(name="OrdAccpt",joinColumns=@JoinColumn(name="oid"))
	@OrderColumn(name="pos")
	@Column(name="oaccpt")
	private List<String> orderAccept;

	public OrderMethod() {
		super();
	}

	public OrderMethod(Integer oid, String orderMode, String orderCode, String exeType, String orderDesc,
			List<String> orderAccept) {
		super();
		this.oid = oid;
		this.orderMode = orderMode;
		this.orderCode = orderCode;
		this.exeType = exeType;
		this.orderDesc = orderDesc;
		this.orderAccept = orderAccept;
	}

	public Integer getOid() {
		return oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public String getOrderMode() {
		return orderMode;
	}

	public void setOrderMode(String orderMode) {
		this.orderMode = orderMode;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getExeType() {
		return exeType;
	}

	public void setExeType(String exeType) {
		this.exeType = exeType;
	}

	public String getOrderDesc() {
		return orderDesc;
	}

	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

	public List<String> getOrderAccept() {
		return orderAccept;
	}

	public void setOrderAccept(List<String> orderAccept) {
		this.orderAccept = orderAccept;
	}

	@Override
	public String toString() {
		return "OrderMethod [oid=" + oid + ", orderMode=" + orderMode + ", orderCode=" + orderCode + ", exeType="
				+ exeType + ", orderDesc=" + orderDesc + ", orderAccept=" + orderAccept + ", getOid()=" + getOid()
				+ ", getOrderMode()=" + getOrderMode() + ", getOrderCode()=" + getOrderCode() + ", getExeType()="
				+ getExeType() + ", getOrderDesc()=" + getOrderDesc() + ", getOrderAccept()=" + getOrderAccept()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
