/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.image.ImageView;
import javafx.scene.text.TextAlignment;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;

/**
 *
 * @author reyta
 */
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
public class GUIID extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        StackPane pane = new StackPane();
        
        // setting image to the background
        BackgroundImage bI= new BackgroundImage(new Image("Image/download.jpg",300,300,false,true),
        BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
          BackgroundSize.DEFAULT);
        pane.setBackground(new Background(bI));
        
        // heading
        Text text2 = new Text();
        text2.setStyle("-fx-font-size: 25px;");
        text2.setText("Game Engine Programming");
        StackPane.setAlignment(text2, Pos.TOP_CENTER);
        
        // informative paragraph
        Text text = new Text();
        text.setText("Different from video game design and development in the fact that this is on the more programming orientated side of things a a game engine programmer will "
                + "spend most of the time creating the systems that game developers and designers will use to build a world that they think people would enjoy playing.");
        text.setStyle("-fx-fill:red");
        StackPane.setAlignment(text, Pos.CENTER);
        text.textAlignmentProperty().setValue(TextAlignment.CENTER);
        text.wrappingWidthProperty().bind(pane.widthProperty());
        
        // learn more button
        Button btn = new Button();
        btn.setText("Learn More");
        StackPane.setAlignment(btn, Pos.BOTTOM_CENTER);
        
        // first image attempt
        //ImageView img = new ImageView("Image/VGDevelop.jpg");
        //StackPane.setAlignment(img, Pos.CENTER);
        //StackPane.setAlignment(img, Pos.BASELINE_CENTER);
        //System.out.println(img.getLayoutX()+img.getLayoutY());
                
       
        
        pane.getChildren().addAll(btn,text,text2);
        
        
        
        Scene scene = new Scene(pane, 500,500);
        
        primaryStage.setTitle("VIdeo Game Development");
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
