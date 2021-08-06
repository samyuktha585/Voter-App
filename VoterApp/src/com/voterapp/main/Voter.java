package com.voterapp.main;

import java.util.Scanner;

import com.voterapp.exception.*;
import com.voterapp.service.*;

public class Voter {

	public static void main(String[] args) {
		System.out.println("Please enter below details for checking eligibility...");
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age= sc.nextInt();
		System.out.println("Enter your Locality");
		String locality = sc.next();
		System.out.println("Enter your VoterID");
		int vid = sc.nextInt();
		ElectionBooth elb= new ElectionBooth();
		try{
			elb.checkage(age);
			elb.checkLocality(locality);
			elb.checkVoterId(vid);
			elb.checkEligibility(age, locality, vid);
		}
		    catch(UnderAgeException e ){
			System.out.println(e.getMessage());
		}
		    catch(LocalityNotFoundException e){
			System.out.println(e.getMessage());
		}
			catch(NoVoterIDException e){
				System.out.println(e.getMessage());
		}
		catch(NotEligibleException e){
			System.out.println(e.getMessage());
			sc.close();
		}
		}
	
	}