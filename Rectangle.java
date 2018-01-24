import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import java.util.Optional;

public class Rectangle extends Application {
	@Override
	public void start(Stage primaryStage) {
		TextInputDialog textInputDialog = new TextInputDialog("Geometric Calculator");
		Optional<String> result = textInputDialog.showAndWait();
		String widthInput = result.get();
		double width = Double.parseDouble(widthInput);

		String heightInput = result.get();
		double height = Double.parseDouble(heightInput);		

		}
	public static void main(String [] args) {
		launch(args);	
	}
}

