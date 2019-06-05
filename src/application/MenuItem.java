package application;

import javafx.beans.property.SimpleStringProperty;

public class MenuItem{
  private String name, description;
  private itemType type;
  private double price;
  private SimpleStringProperty simpleName;
  public MenuItem(String name, double price, String type){
	  this.setName(name);
	  this.price = price;
	  this.setType(type); 
  }

  public enum itemType{
    DRINK, SIDE, ENTREE

  }

public String getName() {
	return name;
}

public void setName(String name) {
	this.simpleName = new SimpleStringProperty(name);
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public itemType getType() {
	return type;
}
 
public void setType(String type) {
	
	this.type = itemType.valueOf(type.toUpperCase());
	
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}
  
  
}
