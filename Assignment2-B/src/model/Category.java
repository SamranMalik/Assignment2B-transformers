package model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.internal.txw2.annotation.XmlElement;

@XmlRootElement(name="category")
public class Category {
private String name;
private String image;
List<Product> products = new ArrayList<Product>();

public Category()
{
	
}

public void setName(String name)
{
	this.name = name;
}

public void setImage(String image)
{
	this.image = image;
}

@XmlElement
public String getName()
{
	return this.name;
}
@XmlElement
public String getImage()
{
	return this.image;
}
}
