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
public class CommissionCompensationModel extends CompensationModel{
    

	double commitionRate;
	double grossSales;
	
	public CommissionCompensationModel(double grossSales, double commitionRate) {
		
		this.commitionRate=commitionRate;
		this.grossSales=grossSales;
	}

          public double getCommitionRate() {
	return commitionRate;
        }
        
         public double getGrossSales() {
		return grossSales;
	}
         
           public double earnings(){
                return grossSales*commitionRate;
        }
        
           public void raise(double raisedamt){
               commitionRate=commitionRate+(commitionRate*raisedamt);
           }
	@Override
	public String toString() {
		return "\nCommission Compensation with: \nGross Sales " + grossSales + "\nCommisionRate " + commitionRate  
                        +"\nEarnings: "+earnings() +"\n";
	}

	
}
