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
class Employee {
	
        private CompensationModel compensation;
	private String firstname,latname,socialSecurityNumber;
        
	public Employee(String FirstName, String LastName, String socialSecurityNumber, CompensationModel compensation) {
		this.firstname=FirstName;
		this.latname=LastName;
		this.socialSecurityNumber=socialSecurityNumber;
		this.compensation=compensation;	
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String FirstName) {
		this.firstname = FirstName;
	}

	public String getLatname() {
		return latname;
	}

	public void setLatname(String LastName) {
		this.latname = LastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
        public void setCompensation(CompensationModel compensation){
            this.compensation = (CompensationModel) compensation;
        }

	public CompensationModel getCompensation() {
		return compensation;
	}
        
        public double earnings() {
                return compensation.earnings();
        }
        
        public void raise(double raisedamt){
               compensation.raise(raisedamt);
           }
        
	@Override
    public String toString() {
       return  firstname + " " + latname + "\nSocial Security Number: " + socialSecurityNumber +compensation.toString();
            }
      
        }
