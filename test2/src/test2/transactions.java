/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

/**
 *
 * @author scs
 */
public class transactions {
    
    private String transType;
    private double withdrawORdeposite;
  
    public transactions(String Ttype , double DorWamount){
    
       transType = Ttype;
       withdrawORdeposite = DorWamount;
    }

    public double getWithdrawORdeposite() {
        return withdrawORdeposite;
    }

   
    public void setWithdrawORdeposite(double withdrawORdeposite) {
        this.withdrawORdeposite = withdrawORdeposite;
    }

  
    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }
 
    
    
    
    
    
    
    
}
