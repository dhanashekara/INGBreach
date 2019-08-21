package com.ing.utility;

import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class Constant {

	// public static final Map<Integer, String> rules;
	 
	 public static final HashMap<String, String> RULES = new HashMap<>();

	    static {
	    	RULES.put("BuisnessArea", "[{'franchise':'privatebanking', options:[{'value':'business banking'},{'value':'Specialist Banking'},{'value':'Customer Experience'},{'Branch & Premier'}]},"
	        		+ "{'franchise':'RBSI',options:[{'value':'Executive Office'},{'value':'Customer Experience'},{'value':'Personal and Business Banking'},{'value':'Risk'},{'value':'Finance'},{'value':'Transformation'}]},"
	        		+ "{'franchise':'services',options:[{'value':'Payments'},{'value','Shared Services'},{'value':'CIO Tech'},{'value':'Innovation & Solutions'}]}"
	        		+ "{franchise:categorise,options:[{'value':'Loss of device/physical files'},{'value':'PIN/Card Issues'},{'value':'Loss of device/physical files'},{'value':'Loss of device/physical files'},{'value':'PIN/Card Issue'},{'value':'Loss of device/physical files'},{'value':'PIN/Card Issues'},{'value':'Information found by a third party / member of public because it was left in an insecure place'},{'value':'Loss of device/physical files'}]}"
	        		+ "]");
	    }
}
