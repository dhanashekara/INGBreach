package com.ing.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Breach {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long breachId;
	private String franchise;
	private String businessArea;
	private String breachCategory;
	private String priority;
	private String status;
	private String collegueFullName;
	private String supplier;
	private String nameReported;
	private String companyName;
	private String contactDetails;
	private LocalDate awareDate;
	private LocalDate breachDate;
	private String aware;
	private String awareMade;
	private String categerizeBreach;
	private String hasNumber;
	private String informationMisplaced;
	private String summaryBreach;
	private String breachLocation;
	private String franchiseCaused;
	private String buisnessCaused;
	private String customerBreachHappenned;
	private String customerName;
	private String informationCompromised;

	@ManyToOne
	@JoinColumn(name = "userId")
	private UserDetails userDetails;

}
