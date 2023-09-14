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
public class HourlyCompensationModel extends CompensationModel { 
     private double wage; 
     private double hours; 

     public HourlyCompensationModel (double wage, double hours) { 
         
         this.wage = wage; 
         this.hours = hours; 
    } 

     public double getWage() {
         return wage;
        } 
  
     public void setWage(double wage) { 
         this.wage = wage; 
     } 
   
     public double getHours() {
         return hours;
     } 

     public void setHours(double hours) {  
         this.hours = hours;
     } 
   
    public double earnings() { 
        if (getHours() <= 40) { 
           return getWage() * getHours();
        } 
        else {
           return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
       }
     } 
    
    public void raise(double amountraised){
         wage=wage+wage*amountraised;
     }

  
    @Override
    public String toString() {
       return "\nHourly Compensation with:" + "\nWage of:"+getWage() + "\nHours Worked of:"+getHours() + "\nEarnings: "+earnings() + "\n";
  
        
   }
  }