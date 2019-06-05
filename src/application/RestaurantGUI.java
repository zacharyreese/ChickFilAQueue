package application;
import javafx.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


public class RestaurantGUI implements Initializable{
	 
@FXML	public Text text0;
@FXML	public Text text1;
@FXML  	public Text text2;
@FXML	public Text text3;
@FXML	public Text text4;
@FXML	public Text text5;
	 	
	 	
private LinkedList<Order> orderList2 = new LinkedList<Order>();
@FXML private TableView<MenuItem> order0;
@FXML private TableView<MenuItem> order1;
@FXML private TableView<MenuItem> order2;
@FXML private TableView<MenuItem> order3;
@FXML private TableView<MenuItem> order4;
@FXML private TableView<MenuItem> order5;

@FXML private TableColumn<MenuItem, String> itemNameCol0;
@FXML private TableColumn<MenuItem, String> itemNameCol1;
@FXML private TableColumn<MenuItem, String> itemNameCol2;
@FXML private TableColumn<MenuItem, String> itemNameCol3;
@FXML private TableColumn<MenuItem, String> itemNameCol4;
@FXML private TableColumn<MenuItem, String> itemNameCol5;



ObservableList<ObservableList<MenuItem>> obsOrderList = FXCollections.observableArrayList();

ObservableList<MenuItem> obsOrderList0 = FXCollections.observableArrayList();
ObservableList<MenuItem> obsOrderList1 = FXCollections.observableArrayList();
ObservableList<MenuItem> obsOrderList2 = FXCollections.observableArrayList();
ObservableList<MenuItem> obsOrderList3 = FXCollections.observableArrayList();
ObservableList<MenuItem> obsOrderList4 = FXCollections.observableArrayList();
ObservableList<MenuItem> obsOrderList5 = FXCollections.observableArrayList();

 public void setList(Order newOrder) {
	 orderList2.add(newOrder);
	 getCurrentOrderObs();

	 

	 
	
	 }
	 
 



public void setOrderNames() {
	
}





public void orderCompleteBtn() {
	orderList2.removeFirst();
	getCurrentOrderObs();
}
public void clearWindow() {
}

@Override
public void initialize(java.net.URL location, ResourceBundle resources) {
	obsOrderList.addAll(obsOrderList0,obsOrderList1,obsOrderList2,obsOrderList3,obsOrderList4,obsOrderList5);
	itemNameCol0.setCellValueFactory(new PropertyValueFactory<MenuItem, String>("name"));
	itemNameCol1.setCellValueFactory(new PropertyValueFactory<MenuItem, String>("name"));
	itemNameCol2.setCellValueFactory(new PropertyValueFactory<MenuItem, String>("name"));
	itemNameCol3.setCellValueFactory(new PropertyValueFactory<MenuItem, String>("name"));
	itemNameCol4.setCellValueFactory(new PropertyValueFactory<MenuItem, String>("name"));
	itemNameCol5.setCellValueFactory(new PropertyValueFactory<MenuItem, String>("name"));
	
	
}
public void getCurrentOrderObs(){
	
		updateLists();
		
		
		
		order0.setItems(obsOrderList.get(0));
		order1.setItems(obsOrderList.get(1));
		order2.setItems(obsOrderList.get(2));
		order3.setItems(obsOrderList.get(3));
		order4.setItems(obsOrderList.get(4));
		order5.setItems(obsOrderList.get(5));
		
		


}




public void updateLists() {
	
	obsOrderList0.clear();
	obsOrderList1.clear();
	obsOrderList2.clear();
	obsOrderList3.clear();
	obsOrderList4.clear();
	obsOrderList5.clear();
	text0.setText("Name");
	text1.setText("Name");
	text2.setText("Name");
	text3.setText("Name");
	text4.setText("Name");
	text5.setText("Name");
	
	int m = orderList2.size();
	if(m>0) {
		
		for(int i = 0; i <orderList2.get(0).getOrderItems().size();i++) {
			obsOrderList0.addAll(orderList2.get(0).getOrderItems().get(i));
		}text0.setText(orderList2.get(0).getName());
		
		if(m>1) {
			for(int i = 0; i <orderList2.get(1).getOrderItems().size();i++) {
				obsOrderList1.addAll(orderList2.get(1).getOrderItems().get(i));
			}text1.setText(orderList2.get(1).getName());
			if (m>2) {
				for(int i = 0; i <orderList2.get(2).getOrderItems().size();i++) {
					obsOrderList2.addAll(orderList2.get(2).getOrderItems().get(i));
				}text2.setText(orderList2.get(2).getName());
				if(m>3) {
					for(int i = 0; i <orderList2.get(3).getOrderItems().size();i++) {
						obsOrderList3.addAll(orderList2.get(3).getOrderItems().get(i));
					}text3.setText(orderList2.get(3).getName());
					if(m>4) {
						for(int i = 0; i <orderList2.get(4).getOrderItems().size();i++) {
							obsOrderList4.addAll(orderList2.get(4).getOrderItems().get(i));
						}	text4.setText(orderList2.get(4).getName());
						if (m>5) {
							for(int i = 0; i <orderList2.get(5).getOrderItems().size();i++) {
								obsOrderList5.addAll(orderList2.get(5).getOrderItems().get(i));
							}text5.setText(orderList2.get(5).getName());
						}
					}
				}
			}
		}
	}
	obsOrderList.clear();
	obsOrderList.addAll(obsOrderList0,obsOrderList1,obsOrderList2,obsOrderList3,obsOrderList4,obsOrderList5);
}



public void removeItemObs(){

	
}
}
