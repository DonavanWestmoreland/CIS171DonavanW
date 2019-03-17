/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.TextAlignment;
import javafx.geometry.Insets;
import javafx.scene.text.Text;
import javafx.event.EventHandler;

/**
 *
 * @author reyta
 */
public class Main extends Application {
    //initializing text field
    
    TextField tf = new TextField("JavaFx");
    HBox thing = new HBox(20);
    
    
    protected HBox radioPane(){
                //Creating radio button pane
        HBox paneForRB = new HBox(20);
        //creating radio buttons
        RadioButton rbLeft = new RadioButton("Left");
        RadioButton rbRight = new RadioButton("Right");
        RadioButton rbCenter = new RadioButton("Center");
        paneForRB.getChildren().addAll(rbLeft, rbRight, rbCenter);
        
        //creating toggle group to hold radio buttons
        ToggleGroup group = new ToggleGroup();
        rbLeft.setToggleGroup(group);
        rbRight.setToggleGroup(group);
        rbCenter.setToggleGroup(group);
        
        //action setting
        rbLeft.setOnAction(e -> {
          if (rbLeft.isSelected()) {
            tf.setAlignment(Pos.CENTER_LEFT);
          }
        });

        rbRight.setOnAction(e -> {
          if (rbRight.isSelected()) {
            tf.setAlignment(Pos.CENTER_RIGHT);
          }
        });

        rbCenter.setOnAction(e -> {
          if (rbCenter.isSelected()) {
            tf.setAlignment(Pos.CENTER);
          }
        });
        return paneForRB;
    }
    
    protected HBox widthPane(){
        HBox paneForCW = new HBox(20);
        //initializing width text field
        TextField tfForWidth = new TextField();
       
        
        //settign action event for width text field
        tfForWidth.textProperty().addListener((obs, oldText, newText) -> {
        int num = Integer.parseInt(newText);
        tf.setPrefColumnCount(num);
        // ...
        });
        
        paneForCW.getChildren().add(tfForWidth);
        return paneForCW;
    }
    
    
    @Override
    public void start(Stage primaryStage) {
        
       
        //creating root pane
        thing.getChildren().add(tf);
        BorderPane pane = new BorderPane(); 
        
        //setting locations
        pane.setTop(thing);
        pane.setBottom(radioPane());  
        pane.setCenter(widthPane());
        
        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
