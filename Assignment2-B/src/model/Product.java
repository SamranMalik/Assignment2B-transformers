package model;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.internal.txw2.annotation.XmlElement;

@XmlRootElement(name="product")
public class Product {
private String name;
private String image;
Category cat;

public Product(String name,String image,Category cat)
{
	this.name = name;
	this.image = image;
	cat = new Category();
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
