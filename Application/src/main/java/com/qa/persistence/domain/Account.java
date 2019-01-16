package com.qa.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column (length = 20)
	private String firstName;
	@Column (length = 20)
	private String lastName;
	@Column (length = 4)
	private String accountNumber;

}
