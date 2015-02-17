package model;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class Test {

	@GET
	@Path("/product")
	@Produces(MediaType.APPLICATION_XML)
public static void productByCategory(@PathParam("categoryName")String categoryName){
	List<Product> result = new ArrayList<Product>();
	
	//all products 
	Model m = Model.getModel();
		if (m.c.getName() == "soccerr")
		{
			for(Product p:m.products)
			{
				result.add(p);
			}
				}
			}
}

