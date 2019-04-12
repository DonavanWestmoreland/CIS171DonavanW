/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.LinkedList;
import javafx.application.Application;
import javafx.event.EventType;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

/**
 *View
 * @author reyta
 */
public class Main extends Application {
  public static LinkedList<Integer> list = new LinkedList<>();
  private static LinkedListView view = new LinkedList<>();
  private static  Button btSearch = new Button("Search");
  private static  Button btInsert = new Button("Insert");
  private static Button btDelete = new Button("Delete");
  private static TextField tfNumber = new TextField();
  private static TextField tfIndex = new TextField();    
    
    @Override
    public void start(Stage primaryStage) {
        btDelete.setOnAction(e->{
            remove();
        });
        btDelete.relocate(375, 450);
        btInsert.setOnAction(e->{
            insert();
        });
        btInsert.relocate(275, 450);
        btSearch.setOnAction(e->{
            search();
        });    
        btSearch.relocate(175, 450);
        
        //tfNumber.relocate(100, 200);
        tfNumber.setPrefWidth(40);
        Label lblNumber = new Label("Number",tfNumber);
        lblNumber.relocate(0, 450);
        
        //tfIndex.relocate(25, 200);
        tfIndex.setPrefWidth(40);
        Label lblIndex = new Label("Index",tfIndex);
        lblIndex.relocate(90, 450);
        
       
        Pane pane = new Pane();
        pane.getChildren().addAll(btDelete,btInsert,btSearch,lblNumber,lblIndex);
       
        

        Scene scene = new Scene(pane, 500, 500);

        primaryStage.setTitle("Exercise24_7");
        primaryStage.setScene(scene);
        primaryStage.show();
    }  
    
    public static void remove(){
        if (list.isEmpty() == false){            
            if (!tfIndex.getText().isEmpty()){
                list.remove(Integer.parseInt(tfIndex.getText()));
                tfIndex.clear();
            }                
            else if (!tfNumber.getText().isEmpty()){
                int thing = list.indexOf(Integer.parseInt(tfNumber.getText()));
                list.remove(thing);
                tfNumber.clear();
            }
        }
    }
  
  public static void insert(){
      if (!tfNumber.getText().isEmpty()&& !tfIndex.getText().isEmpty()){
          list.add(Integer.parseInt(tfIndex.getText()),Integer.parseInt(tfNumber.getText()));
          tfNumber.clear();
          tfIndex.clear();
      }
      else if (!tfNumber.getText().isEmpty()){
          list.add(Integer.parseInt(tfNumber.getText()));
          tfNumber.clear();
      }
  }
  public static void search(){
      if (list.contains(Integer.parseInt(tfNumber.getText()))){
          System.out.println("yay!");
      }
  }
public static class  LinkedListView  extends Pane {
    
    private int startingX = 20;
    private int startingY = 20;
    private int boxWidth = 50;
    private int boxHeight = 20;
    private int arrowLH = 30;
    private int hGap = 80;

    protected void repaint() {
      getChildren().clear();

      if (list.size() == 0 ) {
        getChildren().add(new Text(startingX,startingY,"head: null"));
        getChildren().add(new Text(startingX,startingY + 15, "tail: null"));
      }
      else {
        getChildren().add(new Text(startingX,startingY,"head"));
        int x = startingX +30;
        int y = startingY + 20;
        drawArrowLine(startingX+5,startingY,x,y);

        for (int i = 0; i < list.size(); i++){
          Rectangle rectangle = new Rectangle(x,y, boxWidth,boxHeight);
          rectangle.setFill(Color.WHITE);
          rectangle.setStroke(Color.BLACK);
          getChildren().add(rectangle);
          getChildren().add(new Line(x + arrowLH,y,x+arrowLH, y+boxHeight));

          if (i < list.size()-1){
            drawArrowLine(x+40, y+boxHeight/2, x + hGap, y+boxHeight/2);
          }
          getChildren().add(new Text(x + 10,y + 10,list.get(i) + ""));
          x = x + hGap;
        }//end of for
        getChildren().add(new Text(x,startingY, "tail"));
        drawArrowLine(x, startingY, x-hGap, y);
      }
    }

    public void drawArrowLine(double x1, double y1,double x2,double y2){
      getChildren().add(new Line(x1,y1,x2,y2));

      //find slope of the Line
      double slope = (y1-y2)/(x1-x2);

      double arctan = Math.atan(slope);

      //flip the arrow 45 off of a perpendicular line at point x2
      double set45 = 1.57 / 2;

      // arrow should always point toward i not i + 1

      if (x1 < x2){// add 90 degrees to arrow lines
        set45 = -1.57 *1.5;
      }

      int arrlen = 15;

      // draw arrows on the line
      getChildren().add(new Line(x2,y2,(x2+(Math.cos(arctan +set45)*arrlen)),
        ((y2)) + (Math.sin(arctan + set45)*arrlen)));

      getChildren().add(new Line(x2,y2,(x2+(Math.cos(arctan - set45)*arrlen)),
        ((y2)) + (Math.sin(arctan - set45)*arrlen)));

    }
}
    public static void main(String[] args) {
        launch(args);
    }
}


    
