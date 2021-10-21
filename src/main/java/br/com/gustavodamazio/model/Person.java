package br.com.gustavodamazio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Table(name= "person")
public class Person {
	 @id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int id;
	 private String name;
	 @Column(columnDefinition = "text not null")
	 private String email;
	 @Column(columnDefinition = "text not null")
	 private String cellPhone;

	 
	 
	 public Person(int id, String name, String email, String cellPhone) {
	    this.id = id;
	    this.name = name;
	    this.email = email;
	    this.cellPhone = cellPhone;
	}
	 public Person() {}
	public int getId() {
	    return id;
	}
	public void setId(int id) {
	    this.id = id;
	}
	public String getName() {
	    return name;
	}
	public void setName(String name) {
	    this.name = name;
	}
	public String getEmail() {
	    return email;
	}
	public void setEmail(String email) {
	    this.email = email;
	}
	public String cellPhone() {
	    return cellPhone;
	}
	public void getCellPhone(String cellPhone) {
	    this.cellPhone = cellPhone;
	}
}
