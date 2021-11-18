package com.assets.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Asset {
	
	@Column
	private String asset_name;
	@Column
	private String purchase_date;
	@Column
	private String condition;
	@Column
	private String category;
	@ElementCollection
	private List<assignment_status> assignment_status= 
				new ArrayList<assignment_status>();
}









