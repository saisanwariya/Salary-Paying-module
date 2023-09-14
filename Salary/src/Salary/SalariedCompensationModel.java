/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author saisanwariya
 */
public class SalariedCompensationModel extends CompensationModel{
      private double weeklySalary;
 
      
      public double getWeeklySalary() {
         return weeklySalary;
     } 
      
       public void setWeeklySalary(double weeklySalary) { 
        this.weeklySalary = weeklySalary; 
     } 
     
      public SalariedCompensationModel(double weeklySalary) { 
       this.weeklySalary = weeklySalary;    
    }
     
     public double earnings() {
         return getWeeklySalary();
     }
     
     public void raise(double raisedamt){
         weeklySalary=weeklySalary+weeklySalary*raisedamt;  
     }

  
     @Override
   public String toString() {
       return "\nSalaried Compensation with:" + "\nWeekly Salary of:  "+getWeeklySalary() + "\nEarnings: "+earnings() + "\n"; 
   }
  }