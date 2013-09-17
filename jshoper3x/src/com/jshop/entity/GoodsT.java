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
 * GoodsT generated by hbm2java
 */
@Entity
@Table(name = "goods_t", catalog = "jshoper3")
public class GoodsT implements java.io.Serializable {

	private String goodsid;
	private String goodsname;
	private String brandname;
	private String nname;
	private String lname;
	private String sname;
	private String fname;
	private String navid;
	private String ltypeid;
	private String stypeid;
	private Double price;
	private Double memberprice;
	private Double points;
	private String pictureurl;
	private int quantity;
	private String salestate;
	private String unitname;
	private String keywordname;
	private String weight;
	private Integer readcount;
	private String relatedproductid;
	private String recommended;
	private String hotsale;
	private String bargainprice;
	private Integer sort;
	private Date createtime;
	private String creatorid;
	private Integer replycount;
	private String brandid;
	private String placeStore;
	private String metaKeywords;
	private String metaDescription;
	private Double cost;
	private double saleprice;
	private String isNew;
	private String htmlPath;
	private String productSn;
	private String goodsParameterValue;
	private Integer freezeStore;
	private String keywordid;
	private String unitnameid;
	private String goodsTypeId;
	private String goodsTypeName;
	private String usersetnum;
	private String isSpecificationsOpen;
	private Integer star;
	private Integer staruser;
	private Integer totalcomment;
	private String isvirtualsale;
	private String ismobileplatformgoods;
	private Integer sales;
	private Integer realsales;
	private Date updatetime;
	private int versiont;
	private String commoditylist;

	public GoodsT() {
	}

	public GoodsT(String goodsid, String goodsname, String brandname,
			String nname, String lname, String navid, String ltypeid,
			String pictureurl, int quantity, String recommended,
			Date createtime, String creatorid, double saleprice,
			Date updatetime, int versiont, String commoditylist) {
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.brandname = brandname;
		this.nname = nname;
		this.lname = lname;
		this.navid = navid;
		this.ltypeid = ltypeid;
		this.pictureurl = pictureurl;
		this.quantity = quantity;
		this.recommended = recommended;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.saleprice = saleprice;
		this.updatetime = updatetime;
		this.versiont = versiont;
		this.commoditylist = commoditylist;
	}

	public GoodsT(String goodsid, String goodsname, String brandname,
			String nname, String lname, String sname, String fname,
			String navid, String ltypeid, String stypeid, Double price,
			Double memberprice, Double points, String pictureurl, int quantity,
			String salestate, String unitname, String keywordname,
			String weight, Integer readcount, String relatedproductid,
			String recommended, String hotsale, String bargainprice,
			Integer sort, Date createtime, String creatorid,
			Integer replycount, String brandid, String placeStore,
			String metaKeywords, String metaDescription, Double cost,
			double saleprice, String isNew, String htmlPath, String productSn,
			String goodsParameterValue, Integer freezeStore, String keywordid,
			String unitnameid, String goodsTypeId, String goodsTypeName,
			String usersetnum, String isSpecificationsOpen, Integer star,
			Integer staruser, Integer totalcomment, String isvirtualsale,
			String ismobileplatformgoods, Integer sales, Integer realsales,
			Date updatetime, int versiont, String commoditylist) {
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.brandname = brandname;
		this.nname = nname;
		this.lname = lname;
		this.sname = sname;
		this.fname = fname;
		this.navid = navid;
		this.ltypeid = ltypeid;
		this.stypeid = stypeid;
		this.price = price;
		this.memberprice = memberprice;
		this.points = points;
		this.pictureurl = pictureurl;
		this.quantity = quantity;
		this.salestate = salestate;
		this.unitname = unitname;
		this.keywordname = keywordname;
		this.weight = weight;
		this.readcount = readcount;
		this.relatedproductid = relatedproductid;
		this.recommended = recommended;
		this.hotsale = hotsale;
		this.bargainprice = bargainprice;
		this.sort = sort;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.replycount = replycount;
		this.brandid = brandid;
		this.placeStore = placeStore;
		this.metaKeywords = metaKeywords;
		this.metaDescription = metaDescription;
		this.cost = cost;
		this.saleprice = saleprice;
		this.isNew = isNew;
		this.htmlPath = htmlPath;
		this.productSn = productSn;
		this.goodsParameterValue = goodsParameterValue;
		this.freezeStore = freezeStore;
		this.keywordid = keywordid;
		this.unitnameid = unitnameid;
		this.goodsTypeId = goodsTypeId;
		this.goodsTypeName = goodsTypeName;
		this.usersetnum = usersetnum;
		this.isSpecificationsOpen = isSpecificationsOpen;
		this.star = star;
		this.staruser = staruser;
		this.totalcomment = totalcomment;
		this.isvirtualsale = isvirtualsale;
		this.ismobileplatformgoods = ismobileplatformgoods;
		this.sales = sales;
		this.realsales = realsales;
		this.updatetime = updatetime;
		this.versiont = versiont;
		this.commoditylist = commoditylist;
	}

	@Id
	@Column(name = "GOODSID", unique = true, nullable = false, length = 20)
	public String getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	@Column(name = "GOODSNAME", nullable = false, length = 100)
	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	@Column(name = "BRANDNAME", nullable = false, length = 50)
	public String getBrandname() {
		return this.brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	@Column(name = "NNAME", nullable = false, length = 50)
	public String getNname() {
		return this.nname;
	}

	public void setNname(String nname) {
		this.nname = nname;
	}

	@Column(name = "LNAME", nullable = false, length = 50)
	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Column(name = "SNAME", length = 50)
	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Column(name = "FNAME", length = 50)
	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	@Column(name = "NAVID", nullable = false, length = 20)
	public String getNavid() {
		return this.navid;
	}

	public void setNavid(String navid) {
		this.navid = navid;
	}

	@Column(name = "LTYPEID", nullable = false, length = 20)
	public String getLtypeid() {
		return this.ltypeid;
	}

	public void setLtypeid(String ltypeid) {
		this.ltypeid = ltypeid;
	}

	@Column(name = "STYPEID", length = 20)
	public String getStypeid() {
		return this.stypeid;
	}

	public void setStypeid(String stypeid) {
		this.stypeid = stypeid;
	}

	@Column(name = "PRICE", precision = 22, scale = 0)
	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Column(name = "MEMBERPRICE", precision = 22, scale = 0)
	public Double getMemberprice() {
		return this.memberprice;
	}

	public void setMemberprice(Double memberprice) {
		this.memberprice = memberprice;
	}

	@Column(name = "POINTS", precision = 22, scale = 0)
	public Double getPoints() {
		return this.points;
	}

	public void setPoints(Double points) {
		this.points = points;
	}

	@Column(name = "PICTUREURL", nullable = false, length = 2000)
	public String getPictureurl() {
		return this.pictureurl;
	}

	public void setPictureurl(String pictureurl) {
		this.pictureurl = pictureurl;
	}

	@Column(name = "QUANTITY", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Column(name = "SALESTATE", length = 1)
	public String getSalestate() {
		return this.salestate;
	}

	public void setSalestate(String salestate) {
		this.salestate = salestate;
	}

	@Column(name = "UNITNAME", length = 45)
	public String getUnitname() {
		return this.unitname;
	}

	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}

	@Column(name = "KEYWORDNAME", length = 45)
	public String getKeywordname() {
		return this.keywordname;
	}

	public void setKeywordname(String keywordname) {
		this.keywordname = keywordname;
	}

	@Column(name = "WEIGHT", length = 20)
	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	@Column(name = "READCOUNT")
	public Integer getReadcount() {
		return this.readcount;
	}

	public void setReadcount(Integer readcount) {
		this.readcount = readcount;
	}

	@Column(name = "RELATEDPRODUCTID", length = 500)
	public String getRelatedproductid() {
		return this.relatedproductid;
	}

	public void setRelatedproductid(String relatedproductid) {
		this.relatedproductid = relatedproductid;
	}

	@Column(name = "RECOMMENDED", nullable = false, length = 1)
	public String getRecommended() {
		return this.recommended;
	}

	public void setRecommended(String recommended) {
		this.recommended = recommended;
	}

	@Column(name = "HOTSALE", length = 1)
	public String getHotsale() {
		return this.hotsale;
	}

	public void setHotsale(String hotsale) {
		this.hotsale = hotsale;
	}

	@Column(name = "BARGAINPRICE", length = 1)
	public String getBargainprice() {
		return this.bargainprice;
	}

	public void setBargainprice(String bargainprice) {
		this.bargainprice = bargainprice;
	}

	@Column(name = "SORT")
	public Integer getSort() {
		return this.sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Column(name = "REPLYCOUNT")
	public Integer getReplycount() {
		return this.replycount;
	}

	public void setReplycount(Integer replycount) {
		this.replycount = replycount;
	}

	@Column(name = "BRANDID", length = 20)
	public String getBrandid() {
		return this.brandid;
	}

	public void setBrandid(String brandid) {
		this.brandid = brandid;
	}

	@Column(name = "PLACE_STORE", length = 100)
	public String getPlaceStore() {
		return this.placeStore;
	}

	public void setPlaceStore(String placeStore) {
		this.placeStore = placeStore;
	}

	@Column(name = "META_KEYWORDS")
	public String getMetaKeywords() {
		return this.metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	@Column(name = "META_DESCRIPTION")
	public String getMetaDescription() {
		return this.metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	@Column(name = "COST", precision = 22, scale = 0)
	public Double getCost() {
		return this.cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	@Column(name = "SALEPRICE", nullable = false, precision = 22, scale = 0)
	public double getSaleprice() {
		return this.saleprice;
	}

	public void setSaleprice(double saleprice) {
		this.saleprice = saleprice;
	}

	@Column(name = "IS_NEW", length = 1)
	public String getIsNew() {
		return this.isNew;
	}

	public void setIsNew(String isNew) {
		this.isNew = isNew;
	}

	@Column(name = "HTML_PATH")
	public String getHtmlPath() {
		return this.htmlPath;
	}

	public void setHtmlPath(String htmlPath) {
		this.htmlPath = htmlPath;
	}

	@Column(name = "PRODUCT_SN", length = 45)
	public String getProductSn() {
		return this.productSn;
	}

	public void setProductSn(String productSn) {
		this.productSn = productSn;
	}

	@Column(name = "GOODS_PARAMETER_VALUE", length = 5000)
	public String getGoodsParameterValue() {
		return this.goodsParameterValue;
	}

	public void setGoodsParameterValue(String goodsParameterValue) {
		this.goodsParameterValue = goodsParameterValue;
	}

	@Column(name = "FREEZE_STORE")
	public Integer getFreezeStore() {
		return this.freezeStore;
	}

	public void setFreezeStore(Integer freezeStore) {
		this.freezeStore = freezeStore;
	}

	@Column(name = "KEYWORDID", length = 20)
	public String getKeywordid() {
		return this.keywordid;
	}

	public void setKeywordid(String keywordid) {
		this.keywordid = keywordid;
	}

	@Column(name = "UNITNAMEID", length = 20)
	public String getUnitnameid() {
		return this.unitnameid;
	}

	public void setUnitnameid(String unitnameid) {
		this.unitnameid = unitnameid;
	}

	@Column(name = "GOODS_TYPE_ID", length = 20)
	public String getGoodsTypeId() {
		return this.goodsTypeId;
	}

	public void setGoodsTypeId(String goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}

	@Column(name = "GOODS_TYPE_NAME", length = 45)
	public String getGoodsTypeName() {
		return this.goodsTypeName;
	}

	public void setGoodsTypeName(String goodsTypeName) {
		this.goodsTypeName = goodsTypeName;
	}

	@Column(name = "USERSETNUM", length = 45)
	public String getUsersetnum() {
		return this.usersetnum;
	}

	public void setUsersetnum(String usersetnum) {
		this.usersetnum = usersetnum;
	}

	@Column(name = "IS_SPECIFICATIONS_OPEN", length = 1)
	public String getIsSpecificationsOpen() {
		return this.isSpecificationsOpen;
	}

	public void setIsSpecificationsOpen(String isSpecificationsOpen) {
		this.isSpecificationsOpen = isSpecificationsOpen;
	}

	@Column(name = "STAR")
	public Integer getStar() {
		return this.star;
	}

	public void setStar(Integer star) {
		this.star = star;
	}

	@Column(name = "STARUSER")
	public Integer getStaruser() {
		return this.staruser;
	}

	public void setStaruser(Integer staruser) {
		this.staruser = staruser;
	}

	@Column(name = "TOTALCOMMENT")
	public Integer getTotalcomment() {
		return this.totalcomment;
	}

	public void setTotalcomment(Integer totalcomment) {
		this.totalcomment = totalcomment;
	}

	@Column(name = "ISVIRTUALSALE", length = 1)
	public String getIsvirtualsale() {
		return this.isvirtualsale;
	}

	public void setIsvirtualsale(String isvirtualsale) {
		this.isvirtualsale = isvirtualsale;
	}

	@Column(name = "ISMOBILEPLATFORMGOODS", length = 1)
	public String getIsmobileplatformgoods() {
		return this.ismobileplatformgoods;
	}

	public void setIsmobileplatformgoods(String ismobileplatformgoods) {
		this.ismobileplatformgoods = ismobileplatformgoods;
	}

	@Column(name = "SALES")
	public Integer getSales() {
		return this.sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	@Column(name = "REALSALES")
	public Integer getRealsales() {
		return this.realsales;
	}

	public void setRealsales(Integer realsales) {
		this.realsales = realsales;
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

	@Column(name = "COMMODITYLIST", nullable = false, length = 1000)
	public String getCommoditylist() {
		return this.commoditylist;
	}

	public void setCommoditylist(String commoditylist) {
		this.commoditylist = commoditylist;
	}

}
