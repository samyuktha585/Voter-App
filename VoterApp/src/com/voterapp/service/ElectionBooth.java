package com.voterapp.service;

import com.voterapp.exception.*;

public class ElectionBooth {
	public  boolean checkage(int age) throws UnderAgeException{
		if(age<=18){
		throw new UnderAgeException("your not eligible for vote-->Under 18");
		 }
		return true;
		 }
		String[] locality={"bangalore","hyderabad","chennai"};
		
		public boolean checkLocality(String area) throws LocalityNotFoundException {
	    	boolean flag = false;
	    	for(String name : locality) {
	    		if(name.equalsIgnoreCase(area)) {
	    			flag = true;
	    			break;
	    			}
	    		}
	    		if(flag) {
	    			return true;
	    		}
	    		else
	    			{
	    			throw new LocalityNotFoundException("Locality not Found ");  
	    			}
	    }

		
		public boolean checkVoterId(int vid) throws NoVoterIDException{
	    	if (vid>=1000 && vid<=3000) {
	    		return true;
	    	}else
	    		throw new NoVoterIDException("Voter Id mismatch please check your voter id");
	    }
		public boolean checkEligibility(int age, String locality, int vid) throws NotEligibleException {		
			boolean agestatus = checkage(age);
			boolean localitystatus = checkLocality(locality);
			boolean vidstatus = checkVoterId(vid);
			if (!agestatus && !localitystatus && !vidstatus) {
				return false;
			}else
				System.out.println("Your Eligible for Vote Now,Caste Your Vote");
			System.out.println("Your Vote Your Choice");
			return true;
}
}
