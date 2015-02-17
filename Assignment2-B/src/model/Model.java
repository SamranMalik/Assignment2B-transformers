package model;
import java.util.ArrayList;
import java.util.List;
public class Model {
	
	private static Model model = new Model();
	List<Product> products = new ArrayList<Product>();
	Category c = new Category();
	private Model()
	{
		c.setName("soccerr");
		products.add(new Product("shoes","shoes",c));
		products.add(new Product("gloves","gloves",c));
		products.add(new Product("shins","shins",c));
	}
	
	public static Model getModel()
	{
		return model;
	}
}
