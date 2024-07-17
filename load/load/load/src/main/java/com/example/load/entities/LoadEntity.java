package com.example.load.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table
public class LoadEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer shipperId;
	@Column
	private String loadingPoint;

	private String unloadingPoint;

	private String productType;

	private String truckType;

	private int noOfTrucks;

	private double weight;
	
	private Date date;

}
