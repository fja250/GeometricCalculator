import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import java.util.Optional;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;

public class Rectangle extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		TextInputDialog input = new TextInputDialog();
		input.setTitle("Rectangle Calc");
		input.setHeaderText("Perimeter of Rectangle");
		input.setContentText("Enter height & width");
		input.showAndWait();

		double height = Double.parseDouble(input.getResult());
		double width = Double.parseDouble(input.getResult());	
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Rectangle");
		alert.setHeaderText("Perimeter");
		alert.setContentText("Your perimeter is" + 2*height + 2*width);
		alert.showAndWait();

		}
	public static void main(String [] args) {
		launch(args);	
	}
}

