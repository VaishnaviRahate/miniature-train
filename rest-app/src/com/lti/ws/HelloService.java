package com.lti.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/hello")
public class HelloService {
	
	//URL For Below method  :  http://localhost:8081/rest-api/hello
	//	@GET
	//	public String sayHello() {
	//			return "Hello everyone from JAX-RS";
	//	}
	
//	//URL For Below method  :  http://localhost:8081/rest-app/api/hello?name=Sakhi
//	@GET
//	public String sayHello( @QueryParam("name") String name) {
//			return "Hello " + name + " from JAX-RS";
//	}
	
	
//	//URL For Below method  :  http://localhost:8081/rest-app/api/hello/Sakhi
		//@GET
//		@Path("/{name}")
//		public String sayHello( @PathParam("name") String name) {
//				return "Hello "  + name + " from JAX-RS";
//		}
		
		//URL For Below method  :  http://localhost:8081/rest-app/api/hello/Sakhi/21
			
		@GET
		@Path("/{name}/ {age}")
		public String sayHello( @PathParam("name") String name,  @PathParam("age") int age) {
				return "Hello "  + name + " from JAX-RS. Your age is " + age;
		}

	
	

}
