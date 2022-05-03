package db_lecture;

import java.sql.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class DatabaseConnection extends Application{
	private Label lblOutput = new Label();
	private TextField tfId = new TextField();
	private TextField tfLastName = new TextField();
	private TextField tfFirstName = new TextField();
	private TextField tfMi = new TextField();
	private TextField tfAddress = new TextField();
	private TextField tfCity = new TextField();
	private TextField tfState = new TextField();
	private TextField tfPhone = new TextField();
	private TextField tfEmail = new TextField();
	private Button btView = new Button("View");
	private Button btInsert = new Button("Insert");
	private Button btUpdate = new Button("Update");
	private Button btClear = new Button("Clear");
	private Connection connection = null;
	
	public static void main(String[] args) {
		Application.launch(args);
	
	}
	public void start(Stage primaryStage) {
		tfLastName.setPrefColumnCount(13);
		tfFirstName.setPrefColumnCount(13);
		tfMi.setPrefColumnCount(1);
		tfAddress.setPrefColumnCount(40);
		tfCity.setPrefColumnCount(25);
		tfState.setPrefColumnCount(3);
		tfPhone.setPrefColumnCount(16);
		tfEmail.setPrefColumnCount(18);
		
		HBox hbId = new HBox(5, new Label("ID"), tfId);
		HBox hbName = new HBox(5);
		hbName.getChildren().addAll(new Label("Last Name"), 
		tfLastName, new Label("First Name"), tfFirstName,
		new Label("MI"), tfMi);
		HBox hbAddress = new HBox(5);
		hbAddress.getChildren().addAll(new Label("Address"), 
		tfAddress);
		HBox hbCityState = new HBox(5);
		hbCityState.getChildren().addAll(new Label("City"), tfCity, 
		new Label("State"), tfState);
		
		HBox hbPhoneEmail = new HBox(5);
		hbPhoneEmail.getChildren().addAll(new Label("Telephone"), 
		tfPhone, new Label("Email"), tfEmail);
		HBox hbButtons = new HBox(10);
		hbButtons.getChildren().addAll(btView, btInsert, btUpdate, 
		btClear);
		hbButtons.setAlignment(Pos.CENTER);
		VBox vbox = new VBox(5);
		vbox.getChildren().addAll(lblOutput, hbId, hbName, hbAddress, 
		hbCityState, hbPhoneEmail, hbButtons);
		vbox.setPadding(new Insets(10, 10, 10, 10));
		
		btView.setOnAction(e -> View());
		btInsert.setOnAction(e-> Insert());
		btUpdate.setOnAction(e-> Update());
		btClear.setOnAction(e-> Clear());
		Scene scene = new Scene(vbox, 540, 200);
		primaryStage.setTitle("Staff Lookup");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			lblOutput.setText("Driver loaded");
			connection = DriverManager.getConnection(
			"jdbc:mysql://localhost/Comp271", "root", "");
			lblOutput.setText("Connected to database");
			}
			catch(ClassNotFoundException e){
			lblOutput.setText("Driver not loaded");
			}
			catch(SQLException e){
			lblOutput.setText("Database connection failed");
			}
			}

	void View()
	{
	try{
	Statement stmt = connection.createStatement();
	String cmd = "select * from staff where id = " +
	tfId.getText();
	ResultSet results = stmt.executeQuery(cmd);
	results.next();
	tfLastName.setText(results.getString(2));
	tfFirstName.setText(results.getString(3));
	tfMi.setText(results.getString(4));
	tfAddress.setText(results.getString(5));
	tfCity.setText(results.getString(6));
	
	tfState.setText(results.getString(7));
	tfPhone.setText(results.getString(8));
	tfEmail.setText(results.getString(9));
	}
	catch(SQLException e) {
	lblOutput.setText("Record not found");
	}
	}
	
	void Insert()
	{
	try{
	Statement stmt = connection.createStatement();
	String id = tfId.getText();
	String firstName = tfFirstName.getText();
	String lastName = tfLastName.getText();
	String mi = tfMi.getText();
	String address = tfAddress.getText();
	String city = tfCity.getText();
	String state = tfState.getText();
	String phone = tfPhone.getText();
	String email = tfEmail.getText();
	
	String cmd ="insert into staff values ('" + id + "', '" + 
			lastName + "', '" + firstName + "', '" + mi  + "', '" +
			address + "', '" + city + "', '" + state + "', '" + phone 
			+ "', '" + email + "');";
			stmt.executeUpdate(cmd);
			}
			catch(SQLException e){
			lblOutput.setText("Record not Inserted");
			}
			}
	
	void Update()
	{
	try{
	Statement stmt = connection.createStatement();
	String id = tfId.getText();
	String lastName = tfLastName.getText();
	String firstName = tfFirstName.getText();
	String mi = tfMi.getText();
	String address = tfAddress.getText();
	String city = tfCity.getText();
	String state = tfState.getText();
	String phone = tfPhone.getText();
	String email = tfEmail.getText();
	
	if(!(lastName.isEmpty()))
		stmt.executeUpdate("update staff set lastName = '" + 
		lastName + "' where id = '" + id + "';");
		if(!(firstName.isEmpty()))
		stmt.executeUpdate("update staff set firstName = '" + 
		firstName + "' where id = '" + id + "';"); 
		if(!(mi.isEmpty()))
		stmt.executeUpdate("update staff set mi = '" + mi + 
		"' where id = '" + id + "';");
		if(!(address.isEmpty()))
		stmt.executeUpdate("update staff set address = '" + 
		address + "' where id = '" + id + "';");
		
		if(!(city.isEmpty()))
			stmt.executeUpdate("update staff set city = '" + city + 
			"' where id = '" + id + "';");
			if(!(state.isEmpty()))
			stmt.executeUpdate("update staff set state = '" + state + 
			"' where id = '" + id + "';");
			if(!(phone.isEmpty()))
			stmt.executeUpdate("update staff set telephone = '" + 
			phone + "' where id = '" + id + "';");
			if(!(email.isEmpty()))
			stmt.executeUpdate("update staff set email = '" + email + 
			"' where id = '" + id + "';");
			
			lblOutput.setText("Record updated");
	}
	catch(SQLException e) {
	lblOutput.setText("Record not updated");
	}
	}
	
	void Clear() {
		tfId.setText("");
		tfLastName.setText("");
		tfFirstName.setText("");
		tfMi.setText("");
		tfAddress.setText("");
		tfCity.setText("");
		tfState.setText("");
		tfPhone.setText("");
		tfEmail.setText("");
		lblOutput.setText("");
		}
		}