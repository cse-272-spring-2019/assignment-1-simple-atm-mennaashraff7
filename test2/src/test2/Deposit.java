/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import static test2.withdraw.withdrawAmount;

/**
 *
 * @author scs
 */
public class Deposit {

    Stage stage;
    Scene scene;
    mainmenu menu;
   private static double depositAmount=0;
   private Account cust1 ;
    
    public Deposit(Stage stage,Account cust1){
        this.stage= stage;
        this.cust1=cust1;
       
    }
    
    
    public void Draw(){
        Image image = new Image("/test2/pp.jpg",1290, 1200, true, true);
        ImageView mv = new ImageView(image);
        Image image1 = new Image("/test2/visa.png",100, 100, true, true);
        ImageView mv1 = new ImageView(image1);
       
        Group g =new Group();
        scene=new Scene(g,600,400);
        TextField depositField = new TextField();
        Text amount = new Text("Amount:");
        amount.setFont(Font.font("verdana", 15));
        Button submit =new Button("Enter");
        submit.setFont(Font.font("verdana", 15));
        submit.setStyle("-fx-background-color: white");
        submit.setTextFill(Color.web("purple"));
        Button prev = new Button("Back");
        prev.setFont(Font.font("verdana", 15));
        prev.setTextFill(Color.web("purple"));
        prev.setStyle("-fx-background-color: white");
        Text depositcomment = new Text();
        depositcomment.setFill(Color.WHITE);
        amount.setFill(Color.WHITE);
  
        Button num0 = new Button("0");
        Button num1 = new Button("1");
        Button num2 = new Button("2");
        Button num3 = new Button("3");
        Button num4 = new Button("4");
        Button num5 = new Button("5");
        Button num6 = new Button("6");
        Button num7 = new Button("7");
        Button num8 = new Button("8");
        Button num9 = new Button("9");
        
        num0.setStyle("-fx-background-color: white");
        num1.setStyle("-fx-background-color: white");
        num2.setStyle("-fx-background-color: white");
        num3.setStyle("-fx-background-color: white");
        num4.setStyle("-fx-background-color: white");
        num5.setStyle("-fx-background-color: white");
        num6.setStyle("-fx-background-color: white");
        num7.setStyle("-fx-background-color: white");
        num8.setStyle("-fx-background-color: white");
        num9.setStyle("-fx-background-color: white");
        
        num0.setTextFill(Color.web("purple"));
        num1.setTextFill(Color.web("purple"));
        num2.setTextFill(Color.web("purple"));
        num3.setTextFill(Color.web("purple"));
        num4.setTextFill(Color.web("purple"));
        num5.setTextFill(Color.web("purple"));
        num6.setTextFill(Color.web("purple"));
        num7.setTextFill(Color.web("purple"));
        num8.setTextFill(Color.web("purple"));
        num9.setTextFill(Color.web("purple"));
        
        
        
        g.getChildren().add(mv);
        g.getChildren().add(mv1);
        g.getChildren().add(prev);
        g.getChildren().add(depositField);
      //  g.getChildren().add(output);
        g.getChildren().add(amount);
        g.getChildren().add(submit);
        g.getChildren().add(num9);
        g.getChildren().add(num8);
        g.getChildren().add(num7);
        g.getChildren().add(num6);
        g.getChildren().add(num5);
        g.getChildren().add(num4);
        g.getChildren().add(num3);
        g.getChildren().add(num2);
        g.getChildren().add(num1);
        g.getChildren().add(num0);
        g.getChildren().add(depositcomment);
        depositcomment.setLayoutX(175);
        depositcomment.setLayoutY(90);
        depositField.setLayoutX(175);
        depositField.setLayoutY(97);
        
        submit.setLayoutX(290);
        submit.setLayoutY(250);
        prev.setLayoutX(150);
        prev.setLayoutY(250);
        
        amount.setLayoutX(110);
        amount.setLayoutY(110);
        num9.setLayoutX(280);
        num9.setLayoutY(135);
        num8.setLayoutX(240);
        num8.setLayoutY(135);
        num7.setLayoutX(200);
        num7.setLayoutY(135);
        num6.setLayoutX(280);
        num6.setLayoutY(165);
        num5.setLayoutX(240);
        num5.setLayoutY(165);
        num4.setLayoutX(200);
        num4.setLayoutY(165);
        num3.setLayoutX(280);
        num3.setLayoutY(195);
        num2.setLayoutX(240);
        num2.setLayoutY(195);
        num1.setLayoutX(200);
        num1.setLayoutY(195);
        num0.setLayoutX(240);
        num0.setLayoutY(225);
    
            num0.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                
                depositField.appendText("0");
                
               
              //  pincodeField.appendText("0");             
            }
        });
          num1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                depositField.appendText("1");             
            }
        });
           num2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                depositField.appendText("2");             
            }
        });
            num3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                depositField.appendText("3");             
            }
        });
             num4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                depositField.appendText("4");             
            }
        });
              num5.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                depositField.appendText("5");             
            }
        });
               num6.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                depositField.appendText("6");             
            }
        });
                num7.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                depositField.appendText("7");             
            }
        });
                 num8.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                depositField.appendText("8");             
            }
        });
                   num9.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                depositField.appendText("9");             
            }
        });
                   submit.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent e) {
              
              if(depositField.getText()==null || depositField.getText().trim().isEmpty()){
                
                 depositcomment.setText("WARNING:please enter the deposit amount!!");
                 
                }else{
                     setDepositAmount(Double.parseDouble(depositField.getText()));
                     getCust1().deposit(getDepositAmount());
                     depositcomment.setText("deposit succeed!");
                     depositField.clear();
                }  
            }
            
        });
                    prev.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent e) {
                depositcomment.setText(" ");
                stage.setScene(menu.getScene());
            }
        });
        
        
    
    }
   public Scene getScene(){
      return this.scene;
   }
       public void setmainmenu(mainmenu menu){
           this.menu=menu;
           
       }

    /**
     * @return the cust1
     */
    public Account getCust1() {
        return cust1;
    }

    /**
     * @param cust1 the cust1 to set
     */
    public void setCust1(Account cust1) {
        this.cust1 = cust1;
    }
      
    /**
     * @return the depositAmount
     */
    public static double getDepositAmount() {
        return depositAmount;
    }

    /**
     * @param aDepositAmount the depositAmount to set
     */
    public static void setDepositAmount(double aDepositAmount) {
        depositAmount = aDepositAmount;
    }

    
}

