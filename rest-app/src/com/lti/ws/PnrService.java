package com.lti.ws;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;

import com.lti.model.Passenger;
import com.lti.model.PnrStatus;
import com.lti.model.Passenger.Gender;
import com.lti.model.Passenger.Status;

@Path("/pnr")
public class PnrService {
	
	@GET
	public  PnrStatus check(@QueryParam("prnNo")int pnrNo , @Context HttpServletResponse response){
		//enabling support for CORS
		response.setHeader("Access-Control-Allow-Origin", " * ");
		
		//for the time being we will return some hardcoded data
		//In actual application, we will access the other class 
		
		PnrStatus pnrStatus = new PnrStatus();
		pnrStatus.setPnrNo(pnrNo);
		pnrStatus.setTrainNo(123456);
		pnrStatus.setTravelDate(LocalDate.of(2021, 3,20));
		
		List<Passenger> passengers = new ArrayList<>();
		Passenger p1 = new Passenger();
		p1.setName("Vaishnavi");
		p1.setGender(Gender.FEMALE);
		p1.setStatus(Status.RAC);
		
		Passenger p2= new Passenger();
		p2.setName("Shivam");
		p2.setGender(Gender.MALE);
		p2.setStatus(Status.CONFIRMED);
		
		passengers.add(p1);
		passengers.add(p2);
		pnrStatus.setPassengers(passengers);
		return pnrStatus;
		
	}

}
