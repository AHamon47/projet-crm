package com.tp.ProjetCRM.model;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "company_name")
	private String companyName;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email")
	private String email;
	@Column(name = "phone")
	private String phone;
	@Column(name = "address", columnDefinition = "TEXT")
	private String address;
	@Column(name = "zip_code")
	private String zipCode;
	@Column(name = "city")
	private String city;
	@Column(name = "country")
	private String country;
	@Column(name = "state", columnDefinition = "BIT")
	private ClientState state;

	public Client(String companyName, String firstName, String lastName, String email, String phone, String address,
			String zipCode, String city, String country, ClientState state) {
		this.companyName = companyName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.zipCode = zipCode;
		this.city = city;
		this.country = country;
		this.state = state;
	}

	public Client() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public ClientState getState() {
		return state;
	}

	public void setState(ClientState state) {
		this.state = state;
	}

	
	@Override
	public String toString() {
		return "Client [id=" + id + ", companyName=" + companyName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", phone=" + phone + ", address=" + address + ", zipCode=" + zipCode
				+ ", city=" + city + ", country=" + country + ", state=" + state + "]";
	}

	
	public void patch(Client dataToUpdate){
		if(dataToUpdate.getCompanyName() != null)	{
			this.companyName = dataToUpdate.getCompanyName();
		}
		if(dataToUpdate.getFirstName() != null)	{
			this.firstName = dataToUpdate.getFirstName();
		}
		if(dataToUpdate.getLastName() != null)	{
			this.lastName = dataToUpdate.getLastName();
		}
		if(dataToUpdate.getEmail() != null)	{
			this.email = dataToUpdate.getEmail();
		}
		if(dataToUpdate.getPhone() != null)	{
			this.phone = dataToUpdate.getPhone();
		}
		if(dataToUpdate.getAddress() != null)	{
			this.address = dataToUpdate.getAddress();
		}
		if(dataToUpdate.getZipCode() != null)	{
			this.zipCode = dataToUpdate.getZipCode();
		}
		if(dataToUpdate.getCity() != null)	{
			this.city = dataToUpdate.getCity();
		}
		if(dataToUpdate.getCountry() != null)	{
			this.country = dataToUpdate.getCountry();
		}
		if(dataToUpdate.getState() != null)	{
			this.state = dataToUpdate.getState();
		}
	}
}
