package com.jshop.entity;

// Generated 2013-9-17 20:50:28 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * OrderInvoiceT generated by hbm2java
 */
@Entity
@Table(name = "order_invoice_t", catalog = "jshoper3")
public class OrderInvoiceT implements java.io.Serializable {

	private String orderInvoiceid;
	private String orderid;
	private String invType;
	private String invPayee;
	private String amount;
	private String userid;
	private String state;
	private String username;
	private String invContent;
	private Date createtime;

	public OrderInvoiceT() {
	}

	public OrderInvoiceT(String orderInvoiceid, String orderid, String invType,
			String invPayee, String amount, String userid, String state,
			String username, Date createtime) {
		this.orderInvoiceid = orderInvoiceid;
		this.orderid = orderid;
		this.invType = invType;
		this.invPayee = invPayee;
		this.amount = amount;
		this.userid = userid;
		this.state = state;
		this.username = username;
		this.createtime = createtime;
	}

	public OrderInvoiceT(String orderInvoiceid, String orderid, String invType,
			String invPayee, String amount, String userid, String state,
			String username, String invContent, Date createtime) {
		this.orderInvoiceid = orderInvoiceid;
		this.orderid = orderid;
		this.invType = invType;
		this.invPayee = invPayee;
		this.amount = amount;
		this.userid = userid;
		this.state = state;
		this.username = username;
		this.invContent = invContent;
		this.createtime = createtime;
	}

	@Id
	@Column(name = "ORDER_INVOICEID", unique = true, nullable = false, length = 20)
	public String getOrderInvoiceid() {
		return this.orderInvoiceid;
	}

	public void setOrderInvoiceid(String orderInvoiceid) {
		this.orderInvoiceid = orderInvoiceid;
	}

	@Column(name = "ORDERID", nullable = false, length = 20)
	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	@Column(name = "INV_TYPE", nullable = false, length = 10)
	public String getInvType() {
		return this.invType;
	}

	public void setInvType(String invType) {
		this.invType = invType;
	}

	@Column(name = "INV_PAYEE", nullable = false, length = 45)
	public String getInvPayee() {
		return this.invPayee;
	}

	public void setInvPayee(String invPayee) {
		this.invPayee = invPayee;
	}

	@Column(name = "AMOUNT", nullable = false, length = 20)
	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Column(name = "USERID", nullable = false, length = 20)
	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Column(name = "STATE", nullable = false, length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "USERNAME", nullable = false, length = 50)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "INV_CONTENT", length = 45)
	public String getInvContent() {
		return this.invContent;
	}

	public void setInvContent(String invContent) {
		this.invContent = invContent;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}
