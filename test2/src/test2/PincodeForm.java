package test2;


import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author scs
 */

public class PincodeForm{
        Stage stage;
        Scene scene;
        mainmenu menu;
        private int pin;
        private Account cust1;
        

   

   public  PincodeForm(Stage stage,Account cust1 ) {
     
        this.stage=stage;
          this.cust1=cust1;
    }

   
    

    
        
    public void  draw() {
         
 
        Image image = new Image("/test2/pp.jpg",1290, 1200, true, true);
        ImageView mv = new ImageView(image);
        Image image1 = new Image("/test2/visa.png",100, 100, true, true);
        ImageView mv1 = new ImageView(image1);
       
         
        Text pincode = new Text("Pin code:");
        
        Text wrongPin =new Text();
        pincode.setFont(Font.font("verdana", 20));
        Button submit = new Button("Enter");
        Button clear = new Button("clear");
        TextField cardField = new TextField();
        PasswordField pincodeField = new PasswordField();
        submit.setFont(Font.font("verdana", 15));
        submit.setTextFill(Color.web("purple"));
        clear.setFont(Font.font("verdana", 15));
        clear.setTextFill(Color.web("purple"));
        submit.setStyle("-fx-background-color: white");
        clear.setStyle("-fx-background-color: white");
        pincode.setFill(Color.WHITE);
        wrongPin.setFill(Color.WHITE);
        
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
        
        Group g = new Group();
        
        
        
        g.getChildren().addAll(mv);
        g.getChildren().addAll(mv1);
        g.getChildren().add(pincode);
        g.getChildren().add(submit);
        g.getChildren().add(clear);
        g.getChildren().add(wrongPin);
        g.getChildren().add(pincodeField);
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
        
      
        pincode.setLayoutX(81);
        pincode.setLayoutY(116);
        wrongPin.setLayoutX(172);
        wrongPin.setLayoutY(87);
        pincodeField.setLayoutX(175);
        pincodeField.setLayoutY(100);
        submit.setLayoutX(290);
        submit.setLayoutY(250);
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
        clear.setLayoutX(160);
        clear.setLayoutY(250);
        
        scene = new Scene(g,600,400);
        
        
         num0.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                
              cardField.appendText("0");
                
                pincodeField.appendText("0");             
            }
        });
          num1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                pincodeField.appendText("1");             
            }
        });
           num2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                pincodeField.appendText("2");             
            }
        });
            num3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                pincodeField.appendText("3");             
            }
        });
             num4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                pincodeField.appendText("4");             
            }
        });
              num5.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                pincodeField.appendText("5");             
            }
        });
               num6.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                pincodeField.appendText("6");             
            }
        });
                num7.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                pincodeField.appendText("7");             
            }
        });
                 num8.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                pincodeField.appendText("8");             
            }
        });
                   num9.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                pincodeField.appendText("9");             
            }
        });
        
         clear.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent e) {
                
                pincodeField.clear();
                wrongPin.setText(" ");
                
            }
        });
        
        submit.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent e) {
            
             
            if(pincodeField.getText()==null || pincodeField.getText().trim().isEmpty()){
            
            wrongPin.setText("WARNING: please enter pincode!!");
            
            }else{
                    setPin(Integer.parseInt(pincodeField.getText())) ;
            if (    getCust1().getPincode()==getPin()){
                stage.setScene(menu.getScene());
            }else{
            
                wrongPin.setText("WARNING: wrong pincode please try again!!");
                
            }
            }}
        });
        
    
    }    
    public Scene getScene() {
       return this.scene;
   }
    
    /**
     *
     * @param menu
     */
    public void setmainmenu(mainmenu menu){
            this.menu = menu;
        
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
     * @return the pin
     */
    public int getPin() {
        return pin;
    }

    /**
     * @param pin the pin to set
     */
    public void setPin(int pin) {
        this.pin = pin;
    }
    
}
