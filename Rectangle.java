import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import java.util.Optional;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;

public class Rectangle extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		TextInputDialog hInput = new TextInputDialog();
		hInput.setTitle("Rectangle Calc");
		hInput.setHeaderText("Perimeter of Rectangle");
		hInput.setContentText("Enter height");
		hInput.showAndWait();

		double height = Double.parseDouble(hInput.getResult());
		
		TextInputDialog wInput = new TextInputDialog();
		wInput.setTitle("Rectangle Calc");
		wInput.setHeaderText("Perimeter of Rectangle");
		wInput.setContentText("Enter Width");
		wInput.showAndWait();

		double width = Double.parseDouble(wInput.getResult());	
		
		double perim = 2*(height + width);		

		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Rectangle");
		alert.setHeaderText("Perimeter");
		alert.setContentText("Your perimeter is " + perim);
		alert.showAndWait();

		}
	public static void main(String [] args) {
		launch(args);	
	}
}

