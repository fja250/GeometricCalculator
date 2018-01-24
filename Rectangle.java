import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import java.util.Optional;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;

public class Rectangle extends Application {
	@Override
	public void start(Stage primaryStage) {
		TextInputDialog textInputDialog = new TextInputDialog("Enter height and width");
		Optional<String> result = textInputDialog.showAndWait();
		String widthInput = result.get();
		double width = Double.parseDouble(widthInput);

		
		String heightInput = result.get();
		double height = Double.parseDouble(heightInput);		
		
		Alert alert = new Alert(AlertType.INFORMATION);
		Alert.setContentText("Your perimeter is" + 2*height + 2*width);
		}
	public static void main(String [] args) {
		launch(args);	
	}
}

