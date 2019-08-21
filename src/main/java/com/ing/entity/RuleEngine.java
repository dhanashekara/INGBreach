package com.ing.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class RuleEngine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ruleId;
	private String franchise;
	private String businessArea;
	private String breachCategory;
	private String riskProfile;
	

}
