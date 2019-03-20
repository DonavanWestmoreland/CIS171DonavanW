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
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
/**
 *
 * @author reyta
 */

public class main extends Application {
 //  public boolean hasChanged;
    

    
    @Override
    public void start(Stage primaryStage) {

        //creating text field for US dollars and labelling
        TextField usDollar = new TextField();
        usDollar.relocate(100, 10);
        usDollar.setText("0.0");
        //testing
//       usDollar.textProperty().addListener((obs, oldText, newText) -> {
//                if (newText != oldText){
//                    hasChanged = true;
//                }
//                else{
//                    hasChanged = false;
//                }
//        });
        Label lblUSD = new Label("US Dollars",usDollar);
        
        //creating text field for Canadian Dollars and lebelling
        TextField canDollar = new TextField();
        canDollar.relocate(100, 50);
        canDollar.setText("");
        canDollar.setEditable(false);

        Label lblCD = new Label("Canadian Dollar",canDollar);
        //creating pane to hold text fields and labels
        FlowPane pane = new FlowPane();
        
        
        //creating the conversion button
        Button btnConvert = new Button();
        btnConvert.setText("Convert");
        btnConvert.relocate(100, 80);
        btnConvert.setOnAction(e -> {
            double usD = Double.parseDouble(usDollar.getText());
            
            canDollar.setText(""+(usD*1.5));
            
        });
        pane.getChildren().addAll(usDollar,canDollar,lblUSD,lblCD);
        //pane for both text fields
        Pane tftPane = new Pane();
        

        //adding textfields to the pane
        tftPane.getChildren().addAll(pane,btnConvert);
        
        
        
        
        Scene scene = new Scene(tftPane, 300, 120);
        
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

