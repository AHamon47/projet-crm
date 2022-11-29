package com.tp.ProjetCRM.model;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@Column(name = "client_id")
	private Client client;
	@Column(name="type_presta")
	private String typePresta;
	@Column(name="designation")
	private String designation;
	@Column(name="nb_days")
	private Integer nbDays;
	@Column(name="unit_price")
	private Float unitPrice;
	@Column(name="state")
	private Boolean state;
	
	public Order(Client client, String typePresta, String designation, Integer nbDays, Float unitPrice, Boolean state) {
		this.client = client;
		this.typePresta = typePresta;
		this.designation = designation;
		this.nbDays = nbDays;
		this.unitPrice = unitPrice;
		this.state = state;
	}

	public Order() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getTypePresta() {
		return typePresta;
	}

	public void setTypePresta(String typePresta) {
		this.typePresta = typePresta;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Integer getNbDays() {
		return nbDays;
	}

	public void setNbDays(Integer nbDays) {
		this.nbDays = nbDays;
	}

	public Float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Boolean getState() {
		return state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", client=" + client + ", typePresta=" + typePresta + ", designation=" + designation
				+ ", nbDays=" + nbDays + ", unitPrice=" + unitPrice + ", state=" + state + "]";
	}
	
	public void patch(Order dataToUpdate){
		if(dataToUpdate.getClient() != null)	{
			this.client = dataToUpdate.getClient();
		}
		if(dataToUpdate.getTypePresta() != null)	{
			this.typePresta = dataToUpdate.getTypePresta();
		}
		if(dataToUpdate.getDesignation() != null)	{
			this.designation = dataToUpdate.getDesignation();
		}
		if(dataToUpdate.getNbDays() != null)	{
			this.nbDays = dataToUpdate.getNbDays();
		}
		if(dataToUpdate.getUnitPrice() != null)	{
			this.unitPrice = dataToUpdate.getUnitPrice();
		}
		if(dataToUpdate.getState() != null)	{
			this.state = dataToUpdate.getState();
		}
	}
}
