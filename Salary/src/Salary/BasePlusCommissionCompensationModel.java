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
class BasePlusCommissionCompensationModel extends CommissionCompensationModel {

        private double basicSalary;
        
	public BasePlusCommissionCompensationModel(double grossSales, double commitionRate, double baseSalary) {
		
             super(grossSales, commitionRate);
		this.commitionRate=commitionRate;
		this.grossSales=grossSales;
		this.basicSalary=baseSalary;
		// TODO Auto-generated constructor stub
	}

	public double getCommitionRate() {
		return commitionRate;
	}

	public void setCommitionRate(double commitionRate) {
		this.commitionRate = commitionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getBaseSalary() {
		return basicSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.basicSalary = baseSalary;
	}
        
         public double earnings(){
                 return (super.earnings() + basicSalary);
        }
         public void raise(double raisedamt){
             basicSalary=basicSalary+(basicSalary*raisedamt);
         }

	@Override
       
        public String toString() {
            
        return "\nBase Plus Commission Compensation with:\nGross Sales " + grossSales 
                + "\nCommisionRate " + commitionRate + "\nBasic Salary "+basicSalary+"\nEarnings "+earnings() +"\n";
        }
	
}

