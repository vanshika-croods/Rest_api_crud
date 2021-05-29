package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name="rest_st")
public class StudentVO {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private String userName;
	
	private String password;
}
