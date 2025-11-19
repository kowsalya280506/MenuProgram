import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ColorChoiceBox extends Application {
    public void start(Stage stage) {
        Label label = new Label("Select a color:");
        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        choiceBox.getItems().addAll("Red", "Blue", "Green", "Yellow");

        // When user selects a color, update label text
        choiceBox.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            label.setText("You selected: " + newVal);
        });

        VBox root = new VBox(10, choiceBox, label);

        Scene scene = new Scene(root, 300, 150);
        stage.setTitle("ChoiceBox Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}