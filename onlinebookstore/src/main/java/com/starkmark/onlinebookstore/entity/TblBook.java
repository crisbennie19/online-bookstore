package com.starkmark.onlinebookstore.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the tbl_book database table.
 * 
 */
@Entity
@Table(name="tbl_book")
@Setter
@Getter
@ToString
//@NamedQuery(name="TblBook.findAll", query="SELECT t FROM TblBook t")
public class TblBook implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private byte active;

	@Column(name="date_created")
	private Date dateCreated;

	private String description;

	@Column(name="image_url")
	private String imageUrl;

	@Column(name="last_updated")
	private Date lastUpdated;

	private String name;

	private String sku;

	@Column(name="unit_price")
	private BigDecimal unitPrice;

	@Column(name="units_in_stock")
	private int unitsInStock;

	//bi-directional many-to-one association to TblCategory
	@ManyToOne
	@JoinColumn(name="category_id")
	private TblCategory tblCategory;





}