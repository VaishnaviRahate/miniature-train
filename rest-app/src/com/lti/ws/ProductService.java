package com.lti.ws;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

import com.lti.dao.ProductDao;
import com.lti.model.Product;
import com.lti.model.Status;

@Path("/product")
public class ProductService {
	
	@POST
	public Status  add(Product product , @Context HttpServletResponse response){
		//enabling support for CORS
		response.setHeader("Access-Control-Allow-Origin", " * ");
		
		ProductDao dao = new ProductDao();
		dao.insert(product);
		
		Status status = new Status();
		status.setMessage("Product added successfully!");
		
		return status;
		
	}
	
	

}
