package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Label lblMile = new Label("Mile");
			TextField txtMile = new TextField();
			txtMile.setAlignment(Pos.CENTER_RIGHT);
			
			
			Label lblKilometer = new Label("Kilometer");
			TextField txtKilometer = new TextField();
			txtKilometer.setAlignment(Pos.CENTER_RIGHT);
			
			txtMile.setOnAction(e -> {
				txtKilometer.setText("");
				try {
					double miles = Double.parseDouble(txtMile.getText());
					double kilometers = miles * 1.609344;
					txtKilometer.setText(Double.toString(kilometers));
				}
				catch(Exception e1){
					txtMile.setText("");
				}
				
				
				
			});
			
			txtKilometer.setOnAction(e2 -> {
				txtMile.setText("");
				try {
					double kilometers = Double.parseDouble(txtKilometer.getText());
					double miles = kilometers * 0.6213;
					txtMile.setText(Double.toString(miles));
				}
				catch(Exception e1){
					txtKilometer.setText("");
				}
				
			});
			
			GridPane assignment7pane = new GridPane();
			assignment7pane.add(lblMile, 0, 0);
			assignment7pane.add(txtMile, 1, 0);
			assignment7pane.add(lblKilometer, 0, 1);
			assignment7pane.add(txtKilometer, 1, 1);
			
			
			Scene scene = new Scene(assignment7pane,250,50);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
