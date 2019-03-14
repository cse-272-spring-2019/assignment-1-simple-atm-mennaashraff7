/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.util.ArrayList;

/**
 *
 * @author scs
 */

public class Account {

     private double balance;
     private ArrayList<transactions>transaction;
     private int pincode;
      int i=0;
   
   
      
    public Account() {
        double balance=0;
        this.balance=balance;
        ArrayList<transactions>transaction = null;
        transaction=new ArrayList<transactions>(5);
        this.transaction=transaction;
        int pincode=1234;
        this.pincode=pincode;
 
        }

   
    
       public void deposit(double depositamount){
        balance += depositamount;
        
           arraylist1(depositamount);
    
   }
    
     public void withdraw(double withdrawamount) {
         if(withdrawamount<=balance){
    
       balance -= withdrawamount;
            
             arraylist2(withdrawamount);
       
      
         }
     }

    public double getbalance() {
  
        return balance;
   
    }

  
    public ArrayList<transactions> getTransaction() {
       // arraylist();
        return transaction;
    }
     public void arraylist1(double depositamount){
         if(transaction.size()>=5){
             
             transaction.remove(0);
             transaction.add(new transactions("transaction type: deposit",depositamount));
            
         
         
         }else{
             transaction.add(new transactions("transaction type: deposit",depositamount));
             }}
         
    /**
     *
     * @param withdrawamount
     */
    public void arraylist2(double withdrawamount){
         if(transaction.size()>=5){
             
             transaction.remove(0);
             transaction.add(new transactions("transaction type: withdraw",withdrawamount));
            
         
         
         }else{
             transaction.add(new transactions("transaction type: withdraw",withdrawamount));
             }   
     
     
     }

    /**
     * @return the pincode
     */
    public int getPincode() {
        return pincode;
    }

    /**
     * @param pincode the pincode to set
     */
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
   
      
}


     
     
    
    
    

