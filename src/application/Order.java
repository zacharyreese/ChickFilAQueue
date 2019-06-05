package application;

import java.util.ArrayList;
import java.util.LinkedList;

import javafx.application.Application;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Order extends Application{
  private String name;
  private double price;
  private LinkedList <MenuItem> orderItems;
  private ArrayList <MenuItem> drinkList = new ArrayList();
  private ArrayList <MenuItem> sideList = new ArrayList();
  private ArrayList <MenuItem> entreeList = new ArrayList();
  private Menu menu;
    
  
  public Order(String name, double price, LinkedList <MenuItem> orderItems){
	  this.name = name;
	  this.price = price;
	  this.orderItems = orderItems;
	 // this.menu =menu;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setPrice(double price){
    this.price = price;
  }
  public void setOrderItems(LinkedList<MenuItem> orderItems){
    this.orderItems = orderItems;
  }
  
public String getName() {
	return name;
}
public double getPrice() {
	return price;
}
public LinkedList<MenuItem> getOrderItems() {
	return orderItems;
}

public ArrayList<MenuItem> getDrinkList() {
	return drinkList;
}
public void setDrinkList(ArrayList<MenuItem> drinkList) {
	this.drinkList = drinkList;
}
public ArrayList<MenuItem> getSideList() {
	return sideList;
}
public void setSideList(ArrayList<MenuItem> sideList) {
	this.sideList = sideList;
}
public ArrayList<MenuItem> getEntreeList() {
	return entreeList;
}
public void setEntreeList(ArrayList<MenuItem> entreeList) {
	this.entreeList = entreeList;
}
public void separateItems(){
	if(this.getOrderItems().isEmpty()) {
		System.out.println("FUCK");
	}else {
	//	for(int i =0; i <this.getOrderItems().size();i++) {
		//System.out.println(this.getOrderItems().get(i).getType().toString());
	//	}
		
		int i =0;
		while(i<this.getOrderItems().size()) {
			switch (this.getOrderItems().get(i).getType()) {
				case DRINK:{
					this.drinkList.add(this.getOrderItems().get(i));
				}
				case SIDE:{
					 this.sideList.add(this.getOrderItems().get(i));
					 
				}
				case ENTREE:{
					this.entreeList.add(this.getOrderItems().get(i));
				}
			}
			i++;
		}
		
	 
	}

}
@Override
public void start(Stage primaryStage) throws Exception {
	// TODO Auto-generated method stub
	
}
 public VBox showOrder(){
	 
	 separateItems();
	 
	 VBox orderBox = new VBox();
	 
	 if(this.getEntreeList().size()>0) {
	 for(int i = 0; i < this.getEntreeList().size();i++){
		
		 orderBox.getChildren().add(new Text(this.getEntreeList().get(i).getName()));
	 }
	 }
	 
	 if(this.getSideList().size()>0) {
	 for(int i = 0; i< this.getSideList().size(); i++){
		
		 orderBox.getChildren().add(new Text(this.getSideList().get(i).getName()));
	 } 
	 }
	 
	 if(this.getDrinkList().size()>0) {
	 for(int i = 0; i< this.getDrinkList().size(); i++){
		 
		 orderBox.getChildren().add(new Text(this.getDrinkList().get(i).getName()));
	 }
	 }
	 
	 return orderBox;
	 
 }
}
