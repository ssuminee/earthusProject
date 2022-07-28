package com.us.product.model.vo;

import java.sql.Date;

public class Product {
	
	private String proCode;
	private String category;
	private String proName;
	private String proInfo;
	private int price;
	private int stock;
	private Date proEnrollDate;
	private String proImgPath;
	private String detailImgPath;
	private String seqInfoImgPath;
	private int proCount;
	
	public Product() {}

	public Product(String proCode, String category, String proName, String proInfo, int price, int stock,
			Date proEnrollDate, String proImgPath, String detailImgPath, String seqInfoImgPath, int proCount) {
		super();
		this.proCode = proCode;
		this.category = category;
		this.proName = proName;
		this.proInfo = proInfo;
		this.price = price;
		this.stock = stock;
		this.proEnrollDate = proEnrollDate;
		this.proImgPath = proImgPath;
		this.detailImgPath = detailImgPath;
		this.seqInfoImgPath = seqInfoImgPath;
		this.proCount = proCount;
	}

	public String getProCode() {
		return proCode;
	}

	public void setProCode(String proCode) {
		this.proCode = proCode;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProInfo() {
		return proInfo;
	}

	public void setProInfo(String proInfo) {
		this.proInfo = proInfo;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Date getProEnrollDate() {
		return proEnrollDate;
	}

	public void setProEnrollDate(Date proEnrollDate) {
		this.proEnrollDate = proEnrollDate;
	}

	public String getProImgPath() {
		return proImgPath;
	}

	public void setProImgPath(String proImgPath) {
		this.proImgPath = proImgPath;
	}

	public String getDetailImgPath() {
		return detailImgPath;
	}

	public void setDetailImgPath(String detailImgPath) {
		this.detailImgPath = detailImgPath;
	}

	public String getSeqInfoImgPath() {
		return seqInfoImgPath;
	}

	public void setSeqInfoImgPath(String seqInfoImgPath) {
		this.seqInfoImgPath = seqInfoImgPath;
	}

	public int getProCount() {
		return proCount;
	}

	public void setProCount(int proCount) {
		this.proCount = proCount;
	}

	@Override
	public String toString() {
		return "Product [proCode=" + proCode + ", category=" + category + ", proName=" + proName + ", proInfo="
				+ proInfo + ", price=" + price + ", stock=" + stock + ", proEnrollDate=" + proEnrollDate
				+ ", proImgPath=" + proImgPath + ", detailImgPath=" + detailImgPath + ", seqInfoImgPath="
				+ seqInfoImgPath + ", proCount=" + proCount + "]";
	}
	
	

}