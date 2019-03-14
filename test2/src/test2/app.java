package test2;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage; 

public class app extends Application {
 public static void main(String[] args) {
    
 
     
     launch(args);
    
     
    
       
    }
    
    Stage window;
    mainmenu menu;
    
    
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
  
        
        Image image = new Image("/test2/logo.png");
        primaryStage.getIcons().add(image);
       Account cust1 =new Account();
        window = primaryStage;
        window.setTitle("ATM"); 
        PincodeForm pincodeForm;
        pincodeForm = new PincodeForm(window,cust1);
     
       
        menu =new mainmenu(window,cust1);
        pincodeForm.draw();
        menu.draw();
        withdraw withdrawing = new withdraw(window,cust1);
        withdrawing.draw();
        Deposit depositing;
        depositing =new Deposit(window,cust1);
        depositing.Draw();
        
        
        pincodeForm.setmainmenu(menu);
        menu.setpincode(pincodeForm);
        menu.setwithdraw(withdrawing);
        withdrawing.setmainmenu(menu);
        menu.setdeposit(depositing);
        depositing.setmainmenu(menu);
        
      window.setScene(pincodeForm.getScene());
     
      window.show();
    }
    
    
    
    
    
    
}