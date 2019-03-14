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
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class mainmenu {
    private Scene scene;
    private PincodeForm pincodeForm;
    private Stage stage;
    private withdraw withdrawing;
    private Deposit depositing;
    private Account cust1;
    int i=0;
    
   
   
   
public    mainmenu(Stage stage,Account cust1) {
        this.stage = stage;
        this.cust1=cust1;
      
    }

 

    
    public void draw(){
       
        Image image = new Image("/test2/pp.jpg",750, 700, true, true);
        ImageView mv = new ImageView(image);
        Image image1 = new Image("/test2/visa.png",100, 100, true, true);
        ImageView mv1 = new ImageView(image1);
      //  Image image2 = new Image("/test2/p.png",100, 120, true, true);
      //  ImageView mv2 = new ImageView(image2);
        
        Button balance = new Button();
        Button withdraw = new Button("Withdraw");
        Button deposit = new Button("Deposit");
        balance.setText("balance inquiry");
        Button prev = new Button("Previous");
        Button next = new Button("Next");
        Text atmlabel = new Text("ATM");
        atmlabel.setFont(Font.font("verdana", 40));
        Text output1=new Text();
        Text output2=new Text();
        output1.setFont(Font.font("verdana",15));
        output2.setFont(Font.font("verdana",15));
        balance.setStyle("-fx-background-color: white");
        balance.setTextFill(Color.web("purple"));
        withdraw.setStyle("-fx-background-color: white");
        withdraw.setTextFill(Color.web("purple"));
        deposit.setStyle("-fx-background-color: white");
        deposit.setTextFill(Color.web("purple"));
        next.setStyle("-fx-background-color: white");
        next.setTextFill(Color.web("purple"));
        prev.setStyle("-fx-background-color: white");
        prev.setTextFill(Color.web("purple"));
        atmlabel.setFill(Color.WHITE);
        output1.setFill(Color.PURPLE);
        output2.setFill(Color.PURPLE);
        Rectangle rect = new Rectangle(170, 130, 260, 130);
        rect.setFill(Color.WHITE);
        rect.setArcHeight(17);
       rect.setArcWidth(17);
       rect.setStroke(Color.PURPLE);
        
        Group g= new Group();
        DropShadow sh = new DropShadow();
        sh.setOffsetY(3.0);
        sh.setColor(Color.color(0.3, 0.3, 0.3));
        rect.setEffect(sh);
        
        g.getChildren().addAll(mv);
        g.getChildren().addAll(mv1);
        g.getChildren().add(rect);
//        g.getChildren().addAll(mv2);
        g.getChildren().add(balance);
        g.getChildren().add(withdraw);
        g.getChildren().add(deposit);
        g.getChildren().add(prev);
        g.getChildren().add(next);
        g.getChildren().add(atmlabel);
        g.getChildren().add(output1);
        g.getChildren().add(output2);
        balance.setLayoutX(50);
        balance.setLayoutY(90);
        withdraw.setLayoutX(460);
        withdraw.setLayoutY(90);
        deposit.setLayoutX(50);
        deposit.setLayoutY(130);
        prev.setLayoutX(50);
        prev.setLayoutY(170);
        next.setLayoutX(475);
        next.setLayoutY(130);
        atmlabel.setLayoutX(245);
        atmlabel.setLayoutY(64);
        output1.setLayoutX(175);
        output1.setLayoutY(160);
        output2.setLayoutX(175);
        output2.setLayoutY(180);
        
 
        
        
        setScene(new Scene(g,600,400));
        
        prev.setOnAction(new EventHandler<ActionEvent>() {
                @Override
            public void handle(ActionEvent event) {
                 if(getCust1().getTransaction().isEmpty()){
                    output1.setText("There's no previous history");
                }
                 else if(i>=1){
                  output1.setText(String.valueOf(getCust1().getTransaction().get(i-1).getTransType()));
                  output2.setText(String.valueOf(getCust1().getTransaction().get(i-1).getWithdrawORdeposite()));
         
              --i;
           
                }
                
                } 
          
            
        });
        
        withdraw.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                output1.setText(" ");
                output2.setText(" ");
                getStage().setScene(getWithdrawing().getScene());
            }  
        });
          deposit.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                output1.setText(" ");
                output2.setText(" ");
                getStage().setScene(getDepositing().getScene());
            }  
        });
           balance.setOnAction(new EventHandler<ActionEvent>() {
            

          
            public void handle(ActionEvent event) {
                output2.setText(" ");
                double Output = getCust1().getbalance();
                output1.setText("current balance = L.E "+String.valueOf(Output));
                //System.out.println(cust1.getbalance());
            }  
        });
       //    if((i<4)){
            next.setOnAction(new EventHandler<ActionEvent>() {
                @Override
            public void handle(ActionEvent event) {
                if(getCust1().getTransaction().isEmpty()){
                    output1.setText("There's no history");
                }
                else if(i<5&&getCust1().getTransaction().size()>i){
                   
               output1.setText(String.valueOf(getCust1().getTransaction().get(i).getTransType()));
               output2.setText(String.valueOf(getCust1().getTransaction().get(i).getWithdrawORdeposite()));
        
                ++i;
          
                 }else {
                     output1.setText(" no more history");
                     output2.setText(" ");
           }
            }
        });
               
  //  }
           }
   
    public Scene getScene() {
       return this.scene;
   }
    public void setpincode(PincodeForm pincodeForm){
        this.setPincodeForm(pincodeForm);
        
    }
     public void setwithdraw(withdraw withdrawing){
         this.setWithdrawing(withdrawing);
        
    }
     public void setdeposit(Deposit depositing){
     
         this.setDepositing(depositing);
     }

    /**
     * @param scene the scene to set
     */
    public void setScene(Scene scene) {
        this.scene = scene;
    }

    /**
     * @return the pincodeForm
     */
    public PincodeForm getPincodeForm() {
        return pincodeForm;
    }

    /**
     * @param pincodeForm the pincodeForm to set
     */
    public void setPincodeForm(PincodeForm pincodeForm) {
        this.pincodeForm = pincodeForm;
    }

    /**
     * @return the stage
     */
    public Stage getStage() {
        return stage;
    }

    /**
     * @param stage the stage to set
     */
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    /**
     * @return the withdrawing
     */
    public withdraw getWithdrawing() {
        return withdrawing;
    }

    /**
     * @param withdrawing the withdrawing to set
     */
    public void setWithdrawing(withdraw withdrawing) {
        this.withdrawing = withdrawing;
    }

    /**
     * @return the depositing
     */
    public Deposit getDepositing() {
        return depositing;
    }

    /**
     * @param depositing the depositing to set
     */
    public void setDepositing(Deposit depositing) {
        this.depositing = depositing;
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
    
   
}
    
     
    

