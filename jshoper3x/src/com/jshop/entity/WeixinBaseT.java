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
 * WeixinBaseT generated by hbm2java
 */
@Entity
@Table(name = "weixin_base_t", catalog = "jshoper3")
public class WeixinBaseT implements java.io.Serializable {

	private String id;
	private String url;
	private String token;
	private String appid;
	private String secret;
	private String accessToken;
	private String status;
	private String account;
	private String serviceAccount;
	private Date createtime;
	private Date updatetime;
	private String creatorid;
	private String jshoperxid;
	private String shopid;

	public WeixinBaseT() {
	}

	public WeixinBaseT(String id, String url, String appid, String secret,
			String accessToken, String status, String account,
			String serviceAccount, Date createtime, Date updatetime,
			String creatorid) {
		this.id = id;
		this.url = url;
		this.appid = appid;
		this.secret = secret;
		this.accessToken = accessToken;
		this.status = status;
		this.account = account;
		this.serviceAccount = serviceAccount;
		this.createtime = createtime;
		this.updatetime = updatetime;
		this.creatorid = creatorid;
	}

	public WeixinBaseT(String id, String url, String token, String appid,
			String secret, String accessToken, String status, String account,
			String serviceAccount, Date createtime, Date updatetime,
			String creatorid, String jshoperxid, String shopid) {
		this.id = id;
		this.url = url;
		this.token = token;
		this.appid = appid;
		this.secret = secret;
		this.accessToken = accessToken;
		this.status = status;
		this.account = account;
		this.serviceAccount = serviceAccount;
		this.createtime = createtime;
		this.updatetime = updatetime;
		this.creatorid = creatorid;
		this.jshoperxid = jshoperxid;
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

	@Column(name = "URL", nullable = false)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "TOKEN")
	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Column(name = "APPID", nullable = false, length = 256)
	public String getAppid() {
		return this.appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	@Column(name = "SECRET", nullable = false, length = 512)
	public String getSecret() {
		return this.secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	@Column(name = "ACCESS_TOKEN", nullable = false, length = 512)
	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	@Column(name = "STATUS", nullable = false, length = 1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "ACCOUNT", nullable = false, length = 256)
	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	@Column(name = "SERVICE_ACCOUNT", nullable = false, length = 256)
	public String getServiceAccount() {
		return this.serviceAccount;
	}

	public void setServiceAccount(String serviceAccount) {
		this.serviceAccount = serviceAccount;
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

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Column(name = "JSHOPERXID", length = 20)
	public String getJshoperxid() {
		return this.jshoperxid;
	}

	public void setJshoperxid(String jshoperxid) {
		this.jshoperxid = jshoperxid;
	}

	@Column(name = "SHOPID", length = 20)
	public String getShopid() {
		return this.shopid;
	}

	public void setShopid(String shopid) {
		this.shopid = shopid;
	}

}
