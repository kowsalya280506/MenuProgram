import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {
    public void start(Stage stage) {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");

        Label msg = new Label("Hello, JavaFX!");
        Label java = new Label("Java Version: " + javaVersion);
        Label javafx = new Label("JavaFX Version: " + javafxVersion);

        VBox root = new VBox(10, msg, java, javafx);

        Scene scene = new Scene(root, 300, 150);
        stage.setTitle("JavaFX Version Info");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}