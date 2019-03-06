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
import javafx.scene.layout.HBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
/**
 *
 * @author reyta
 */
public class Main extends Application {
    double loanAmount;
    int numYears;
    
    
    protected HBox getPaneForTextField(){
        HBox paneForTextFields = new HBox(50);
        
        TextField tfLoanAmount = new TextField();
        Label lblLoanAmount = new Label("Loan Amount",tfLoanAmount);
        tfLoanAmount.textProperty().addListener((obs, oldText, newText) -> {
        loanAmount = Double.parseDouble(newText);
        });
        TextField tfYears = new TextField();
        Label lblYears = new Label("Years",tfYears);
        tfYears.textProperty().addListener((obs, oldText, newText) -> {
        numYears = Integer.parseInt(newText);
        });
        
        paneForTextFields.getChildren().addAll(tfLoanAmount,lblLoanAmount,tfYears,lblYears);
        return paneForTextFields;
    }
    
    protected Pane paneForTextArea(){
        Pane paneForTextArea = new Pane();
        
        TextArea ta = new TextArea();
        ta.setPrefColumnCount(50);
        ta.setEditable(false);
        
        
        Button btnCalculate = new Button("Calculate");
        btnCalculate.relocate(200, 200);
        btnCalculate.setOnAction(e -> {
          String output;
          double interestRate = 5.0;
          while (interestRate <8.125){
              double monthlyInterestRate = interestRate / 1200;
              double monthlyPayment = loanAmount * monthlyInterestRate / (1
                - 1 / Math.pow(1 + monthlyInterestRate, numYears * 12));
              double totalPayment = monthlyPayment * numYears * 12;
              output = interestRate+"\t\t\t\t\t"+(monthlyPayment * 100) / 100.0+"\t\t\t\t\t"+(totalPayment * 100) / 100.0+"\n";
              ta.appendText(output);
              interestRate +=.125;
          }
        });
        
        paneForTextArea.getChildren().addAll(ta,btnCalculate);
        return paneForTextArea;
    }
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        root.setBottom(getPaneForTextField());
        root.setTop(paneForTextArea());
        
        Scene scene = new Scene(root);
        primaryStage.setTitle("Loan Calculator");
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
