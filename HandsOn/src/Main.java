// update default comments

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
/**
 *
 * @author reyta
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Pane root = new Pane();
     // use methods for each logical component   
        Arc arc = new Arc();
        arc.setRadiusX(50.0f);
        arc.setRadiusY(25.0f);
        arc.setStartAngle(00.0f);
        arc.setLength(180.0f);
        arc.setType(ArcType.ROUND);
        arc.setFill(Color.WHITE);
        arc.setStroke(Color.BLACK);
        arc.relocate(0, 230);
        
        
        Line line = new Line();
        line.setStartX(50.0f);
        line.setStartY(50.0f);
        line.setEndX(50.0f);
        line.setEndY(230.0f);
        
        Line line2 = new Line();
        line2.setStartX(50.0f);
        line2.setStartY(50.0f);
        line2.setEndX(150.0f);
        line2.setEndY(50.0f);
        
        Line line3 = new Line();
        line3.setStartX(150.0f);
        line3.setStartY(50.0f);
        line3.setEndX(150.0f);
        line3.setEndY(200.0f);
        
        Circle circle = new Circle();
        circle.setRadius(25);
        circle.relocate(125, 75);
        
        Line arm = new Line();
        arm.setStartX(170);
        arm.setStartY(140);
        arm.setEndX(130);
        arm.setEndY(140);
        
        Line leg = new Line();
        leg.setStartX(150);
        leg.setStartY(200);
        leg.setEndX(135);
        leg.setEndY(220);
        
        Line leg2 = new Line();
        leg2.setStartX(150);
        leg2.setStartY(200);
        leg2.setEndX(165);
        leg2.setEndY(220);
        
        root.getChildren().addAll(arc,line,line2,line3,circle,arm,leg,leg2);
        
        
      
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hangman");
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
