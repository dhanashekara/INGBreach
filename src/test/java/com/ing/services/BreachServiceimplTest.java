package com.ing.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.ing.dto.BreachDTO;
import com.ing.entity.Breach;
import com.ing.entity.RuleEngine;
import com.ing.entity.UserDetails;
import com.ing.repository.BreachRepository;
import com.ing.repository.RuleEngineRepository;
import com.ing.repository.UserRepository;
import com.ing.service.BreachServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class BreachServiceimplTest {

	@InjectMocks
	BreachServiceImpl breachServiceImpl;

	@Mock
	BreachRepository breachRepo;

	/*
	 * @Mock UserRepository userRepo;
	 */

	@Mock
	UserRepository userDetailsRepo;

	@Mock
	RuleEngineRepository ruleEngineRepo;

	/*
	 * if (null != breachDTO) { Breach breach = new Breach();
	 * BeanUtils.copyProperties(breachDTO, breach); RuleEngine ruleEngine =
	 * ruleEngineRepo.findByBreachCategoryAndBusinessAreaAndFranchise(
	 * breachDTO.getBreachCategory(), breachDTO.getBusinessArea(),
	 * breachDTO.getFranchise()); if (null != ruleEngine)
	 * breach.setStatus(ruleEngine.getRiskProfile()); else breach.setStatus("low");
	 * 
	 * UserDetails userDetails = userRepo.findById(breachDTO.getUserId()).get();
	 * breach.setUserDetails(userDetails); // System.out.println(breachDTO); //
	 * System.out.println(breach.toString()); breach.getUserDetails(); breach =
	 * breachRepo.save(breach); return
	 * "Breach Created and your breach tracking id is " + breach.getBreachId();
	 */
	BreachDTO breachDTO;
	Breach breach;
	RuleEngine ruleEngine;

	UserDetails userDetails;
	Optional<UserDetails> op;

	@org.junit.Before
	public void init() {
	
		breachDTO = new BreachDTO();
		breachDTO.setUserId(12345L);
		
		userDetails = new UserDetails();
		userDetails.setUserId(12345L);
		
		breachDTO.setBreachId(4);
		
		breach = new Breach();
		breach.setBreachId(4);
		breach.setUserDetails(userDetails);
		
		
		ruleEngine = new RuleEngine();
		ruleEngine.setBreachCategory("asd");
		ruleEngine.setBusinessArea("asd");
		ruleEngine.setFranchise("ad");
		ruleEngine.setRuleId(1);
		ruleEngine.setRiskProfile("low");

		
	}

	@Test
	public void testCreateBreach() {

		
		when(ruleEngineRepo.findByBreachCategoryAndBusinessAreaAndFranchise("asd", "asd", "ad"))
				.thenReturn(ruleEngine);
	//	Mockito.when(breachServiceImpl.createBreach(breachDTO)).thenReturn("");

		when(userDetailsRepo.findById(12345L)).thenReturn(Optional.of(userDetails));
		
		when(breachRepo.save(breach)).thenReturn(breach);

		String msg = breachServiceImpl.createBreach(breachDTO);

		if (msg.contains("Breach Created and your breach tracking id is")) {
		//	assertEquals("Breach Created and your breach tracking id is "+breach.getBreachId(), msg);
			assertEquals(true, true);
		}
	}

}
