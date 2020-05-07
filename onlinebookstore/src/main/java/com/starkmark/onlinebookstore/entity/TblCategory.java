package com.starkmark.onlinebookstore.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


/**
 * The persistent class for the tbl_category database table.
 * 
 */
@Entity
@Table(name="tbl_category")
@Setter
@Getter
@ToString
//@NamedQuery(name="TblCategory.findAll", query="SELECT t FROM TblCategory t")
public class TblCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="category_name")
	private String categoryName;

	//bi-directional many-to-one association to TblBook
	@OneToMany(cascade = CascadeType.ALL, mappedBy="tblCategory")
	private List<TblBook> tblBooks;




}