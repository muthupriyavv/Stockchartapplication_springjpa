package com.example.springwebproject1.model;


import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "company")
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int company_code;
	
	@Column(name = "comapny_name")
	private String company_name;
	
	@Column(name = "turnover")
	private BigDecimal turnover;
	
	@Column(name = "ceo")
	private String ceo;
	
	@Column(name = "board_of_directors")
	private String board_of_directors;
	
	@Column(name = "ipo_date")
	private String ipo_date;
	
	@Column(name = "briefwriteup")
	private String brief;
	
	/*@Column(name = "stock_code")
	private int stock_code;
	
	@Column(name = "sector_id")
	private int sector_id;
	*/
	

	
	
	public String getIpo_date() {
		return ipo_date;
	}
	public void setIpo_date(String ipo_date) {
		this.ipo_date = ipo_date;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	
	public BigDecimal getTurnover() {
		return turnover;
	}
	public void setTurnover(BigDecimal turnover) {
		this.turnover = turnover;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBoard_of_directors() {
		return board_of_directors;
	}
	public void setBoard_of_directors(String board_of_directors) {
		this.board_of_directors = board_of_directors;
	}
	/*
	public int getSector_id() {
		return sector_id;
	}
	public void setSector_id(int sector_id) {
		this.sector_id = sector_id;
	}
	*/
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	/*
	public int getStock_code() {
		return stock_code;
	}
	public void setStock_code(int stock_code) {
		this.stock_code = stock_code;
	}*/
	
	
	public Company(int company_code, String company_name, BigDecimal turnover, String ceo, String board_of_directors,
			String brief, String ipo_date) {
		super();
		this.company_code = company_code;
		this.company_name = company_name;
		this.turnover = turnover;
		this.ceo = ceo;
		this.board_of_directors = board_of_directors;
		this.brief = brief;
		this.ipo_date = ipo_date;
	}
	
	
	public Company() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Company [company_name=" + company_name + ", turnover=" + turnover + ", ceo=" + ceo + ", brief=" + brief
				+ "]";
	}
	
	

}

