/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise14.pkg7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author Donavan Westmoreland
 */
public class Exercise147 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        int size =  10;
        //initializing gridpane
        GridPane gP = new GridPane();
        
        for (int y= 0;y<size;y++){
            for (int x=0;x<size;x++){
                //making random number
                int randomNum = ThreadLocalRandom.current().nextInt(0, 1+1 );
                TextField text = new TextField();
                //forceing them to be a certain size
                text.setPrefHeight(50);
                text.setPrefWidth(50);
                text.setText(Integer.toString(randomNum));
                //creating Gridpane
                gP.setRowIndex(text,y);
                gP.setColumnIndex(text,x);
                gP.getChildren().add(text);
            }
        }
        
        Scene scene = new Scene(gP,500,500);
        primaryStage.setTitle("Random number thing");
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
