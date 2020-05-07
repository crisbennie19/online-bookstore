package com.starkmark.onlinebookstore.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class book {
	

	@Id
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	private boolean active;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	private String description;

	@Column(name="image_url")
	private String imageUrl;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updated")
	private Date lastUpdated;

	private String name;

	private String sku;

	@Column(name="unit_price")
	private BigDecimal unitPrice;

	@Column(name="units_in_stock")
	private int unitsInStock;

	//bi-directional many-to-one association to TblCategory
	//@ManyToOne
	//@JoinColumn(name="category_id")
	//private TblCategory tblCategory;

}
