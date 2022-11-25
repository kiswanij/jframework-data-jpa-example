package com.app;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="person")
public class Model implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="national_id")
	private String nationalId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="address")
	private String address;
	

	public void setId(Integer id){
	  this.id=id;
	}
	
	public Integer getId(){
	 return this.id;
	}
		
	public void setNationalId(String nationalId){
	  this.nationalId=nationalId;
	}
	
	public String getNationalId(){
	 return this.nationalId;
	}
		
	public void setName(String name){
	  this.name=name;
	}
	
	public String getName(){
	 return this.name;
	}
		
	public void setEmail(String email){
	  this.email=email;
	}
	
	public String getEmail(){
	 return this.email;
	}
		
	public void setAddress(String address){
	  this.address=address;
	}
	
	public String getAddress(){
	 return this.address;
	}
		

	@Override
	public boolean equals(Object obj) {
	  if (obj == null) {
		return false;
	  }
	  return this.getId().equals(((Model) obj).getId());
	}

	@Override
	public int hashCode() {
	  if(this.id==null) { 
	    return toString().hashCode(); 
	   }
	  return this.id.hashCode();
	}
	
	@Override
	public String toString(){
	  StringBuffer buf=new StringBuffer();
	  buf.append(this.id).append(",");
	  buf.append(this.nationalId).append(",");
	  buf.append(this.name).append(",");
	  buf.append(this.email).append(",");
	  buf.append(this.address).append(",");
	  return buf.toString();
	}
}