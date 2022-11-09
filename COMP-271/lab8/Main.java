package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane root = new GridPane();
			
			Image flagUSA = new Image("flag0.gif");
			Image flagCanada = new Image("flag1.gif");
			Image flagUK = new Image("flag2.gif");
			Image flagChina = new Image("flag3.gif");
			
			
			/*root.getChildren().addAll(new ImageView(flagUSA), new ImageView(flagCanada), 
					new ImageView(flagUK), new ImageView(flagChina));
			*/
			
			root.add(new ImageView(flagUSA), 0, 0);
			root.add(new ImageView(flagCanada), 0, 1);
			root.add(new ImageView(flagUK), 1, 0);
			root.add(new ImageView(flagChina), 1, 1);
			
			
			Scene scene = new Scene(root,900,500);
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
