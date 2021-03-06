package com.jshop.entity;

// Generated 2014-7-25 23:44:43 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * GoodsBelinkedT generated by hbm2java
 */
@Entity
@Table(name = "goods_belinked_t", catalog = "jshoper3")
public class GoodsBelinkedT implements java.io.Serializable {

	private String id;
	private String maingoodsid;
	private String belinkedproductinfo;
	private String mode;
	private String state;
	private String creatorid;
	private Date createtime;
	private Date updatetime;
	private int versiont;
	private String sxlinkedgoodsid;
	private String mainproductid;
	private String shopid;

	public GoodsBelinkedT() {
	}

	public GoodsBelinkedT(String id, String maingoodsid,
			String belinkedproductinfo, String mode, String state,
			String creatorid, Date createtime, Date updatetime, int versiont,
			String sxlinkedgoodsid) {
		this.id = id;
		this.maingoodsid = maingoodsid;
		this.belinkedproductinfo = belinkedproductinfo;
		this.mode = mode;
		this.state = state;
		this.creatorid = creatorid;
		this.createtime = createtime;
		this.updatetime = updatetime;
		this.versiont = versiont;
		this.sxlinkedgoodsid = sxlinkedgoodsid;
	}

	public GoodsBelinkedT(String id, String maingoodsid,
			String belinkedproductinfo, String mode, String state,
			String creatorid, Date createtime, Date updatetime, int versiont,
			String sxlinkedgoodsid, String mainproductid, String shopid) {
		this.id = id;
		this.maingoodsid = maingoodsid;
		this.belinkedproductinfo = belinkedproductinfo;
		this.mode = mode;
		this.state = state;
		this.creatorid = creatorid;
		this.createtime = createtime;
		this.updatetime = updatetime;
		this.versiont = versiont;
		this.sxlinkedgoodsid = sxlinkedgoodsid;
		this.mainproductid = mainproductid;
		this.shopid = shopid;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 20)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "MAINGOODSID", nullable = false, length = 20)
	public String getMaingoodsid() {
		return this.maingoodsid;
	}

	public void setMaingoodsid(String maingoodsid) {
		this.maingoodsid = maingoodsid;
	}

	@Column(name = "BELINKEDPRODUCTINFO", nullable = false, length = 5000)
	public String getBelinkedproductinfo() {
		return this.belinkedproductinfo;
	}

	public void setBelinkedproductinfo(String belinkedproductinfo) {
		this.belinkedproductinfo = belinkedproductinfo;
	}

	@Column(name = "MODE", nullable = false, length = 1)
	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	@Column(name = "STATE", nullable = false, length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", nullable = false, length = 0)
	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	@Column(name = "VERSIONT", nullable = false)
	public int getVersiont() {
		return this.versiont;
	}

	public void setVersiont(int versiont) {
		this.versiont = versiont;
	}

	@Column(name = "SXLINKEDGOODSID", nullable = false, length = 20)
	public String getSxlinkedgoodsid() {
		return this.sxlinkedgoodsid;
	}

	public void setSxlinkedgoodsid(String sxlinkedgoodsid) {
		this.sxlinkedgoodsid = sxlinkedgoodsid;
	}

	@Column(name = "MAINPRODUCTID", length = 20)
	public String getMainproductid() {
		return this.mainproductid;
	}

	public void setMainproductid(String mainproductid) {
		this.mainproductid = mainproductid;
	}

	@Column(name = "SHOPID", length = 20)
	public String getShopid() {
		return this.shopid;
	}

	public void setShopid(String shopid) {
		this.shopid = shopid;
	}

}
