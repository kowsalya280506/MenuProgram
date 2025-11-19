import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentForm extends Application {
    public void start(Stage stage) {
        TextField nameField = new TextField();
        nameField.setPromptText("Enter Name");

        // Gender – RadioButtons
        ToggleGroup genderGroup = new ToggleGroup();
        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");
        male.setToggleGroup(genderGroup);
        female.setToggleGroup(genderGroup);

        // Department – ComboBox
        ComboBox<String> dept = new ComboBox<>();
        dept.getItems().addAll("CSE", "ECE", "EEE", "MECH", "CIVIL");

        Button submit = new Button("Submit");

        TextArea output = new TextArea();
        output.setPrefHeight(150);

        // Submit Action
        submit.setOnAction(e -> {
            String name = nameField.getText();
            String gender = ((RadioButton) genderGroup.getSelectedToggle()).getText();
            String department = dept.getValue();

            output.setText(
                "Student Information:\n" +
                "Name: " + name + "\n" +
                "Gender: " + gender + "\n" +
                "Department: " + department
            );
        });

        VBox root = new VBox(10, nameField, male, female, dept, submit, output);
        root.setPadding(new Insets(10));

        Scene scene = new Scene(root, 350, 350);
        stage.setTitle("Student Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}