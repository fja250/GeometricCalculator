public class Rectangle {
	@override
	public void start(Stage primaryStage) {
		TextInputDialog textInputDialog = new TextInputDialog("Geometric Calculator");
		Optional<String> result = texstInputDialog.showAndWait();
	}
	public static void main(String [] args) {
		launch(args);	
	}
}

