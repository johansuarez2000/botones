/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
import java.io.FileInputStream;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MyJavaFX extends Application {

@Override
public void start(Stage primaryStage)
throws Exception {
Label label1 = new Label();
Label label2 = new Label("         A       ");
Label label4 = new Label("         B       ");
Label label5 = new Label("      ");
FileInputStream input = new
FileInputStream("C:\\Users\\usuario\\Downloads/search_locate_find_6278.png");

Image image = new Image(input);
Label label3 = new Label("Search",new ImageView(image));
ToggleGroup group = new ToggleGroup();
RadioButton rb1 = new RadioButton("comer");
rb1.setToggleGroup(group);
rb1.setSelected(true);
RadioButton rb2 = new RadioButton("dormir");
rb2.setToggleGroup(group);
RadioButton rb3 = new RadioButton("beber");
rb3.setToggleGroup(group);

primaryStage.setTitle("HBox");
Button button1 = new Button("search", new ImageView(image));
Button button2 = new Button("        OK       ");
Button button3 = new Button("                  ");
Button button4 = new Button("                  ");
VBox vbox = new VBox();
HBox hbox= new HBox();
HBox hbox1= new HBox();
HBox hbox2= new HBox();
/*
vbox.getChildren().add(rb1);
vbox.getChildren().add(rb2);
vbox.getChildren().add(rb3);
hbox.getChildren().add(button1);
hbox.getChildren().add(vbox);*/
hbox.getChildren().add(label2);
hbox.getChildren().add(button3);
hbox1.getChildren().add(label4);
hbox1.getChildren().add(button4);
hbox2.getChildren().add(label5);
hbox2.getChildren().add(button2);

vbox.getChildren().add(hbox);
vbox.getChildren().add(hbox1);
vbox.getChildren().add(hbox2);
Scene scene = new Scene(vbox, 300, 300);
primaryStage.setScene(scene);
primaryStage.show();
}
public static void main(String[] args) {
Application.launch(args);
    
}
}
