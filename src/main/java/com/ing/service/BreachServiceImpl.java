package com.ing.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.dto.BreachDTO;
import com.ing.entity.Breach;
import com.ing.entity.RuleEngine;
import com.ing.entity.UserDetails;
import com.ing.exception.BreachManagementException;
import com.ing.repository.BreachRepository;
import com.ing.repository.RuleEngineRepository;
import com.ing.repository.UserRepository;
import com.ing.utility.Constant;

@Service
public class BreachServiceImpl implements BreachService {

	@Autowired
	BreachRepository breachRepo;

	@Autowired
	UserRepository userRepo;

	@Autowired
	RuleEngineRepository ruleEngineRepo;

	@Autowired
	Constant constant;

	public String createBreach(BreachDTO breachDTO) {

		if (null != breachDTO) {
			Breach breach = new Breach();
			BeanUtils.copyProperties(breachDTO, breach);
			RuleEngine ruleEngine = ruleEngineRepo.findByBreachCategoryAndBusinessAreaAndFranchise(
					breachDTO.getBreachCategory(), breachDTO.getBusinessArea(), breachDTO.getFranchise());
			if (null != ruleEngine)
				breach.setStatus(ruleEngine.getRiskProfile());
			else
				breach.setStatus("low");

			UserDetails userDetails = userRepo.findById(breachDTO.getUserId()).get();
			breach.setUserDetails(userDetails);
			// System.out.println(breachDTO);
			// System.out.println(breach.toString());
			breach.getUserDetails();
			breach = breachRepo.save(breach);
			return "Breach Created and your breach tracking id is " + breach.getBreachId();
		} else {
			throw new BreachManagementException("Please enter Valid breach Item");
		}
	}

	public String getRules() {
		return constant.RULES.get("BuisnessArea");
	}
}
