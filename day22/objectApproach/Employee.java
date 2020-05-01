/**
* Employee class to create and pass objects
* @ author Akshay
*/

public class Employee{

	public static final int IS_PRESENT=1;
	public static final int IS_FULLTIME=1;
	//declare the default variables.
	String companyName;
	double wagePerHour;
	double fullTime;
	double partTime;

	public Employee(){
	//default constructor
	}

	//Perform constructor chaining.
	public Employee(String companyName){
		this.companyName=companyName;
	}

	public Employee(String companyName,double wagePerHour){
		this.companyName=companyName;
		this.wagePerHour=wagePerHour;
	}
	
	public Employee(String companyName,double wagePerHour,double fullTime){
		this.companyName=companyName;
		this.wagePerHour=wagePerHour;
		this.fullTime=fullTime;
	}

	public Employee(String companyName,double wagePerHour,double fullTime,double partTime){                                                       
		this.companyName=companyName;
                this.wagePerHour=wagePerHour;
                this.fullTime=fullTime;
		this.partTime=partTime;
        }

	//print the name of the company
	public void printName(){
		System.out.println("Name of the company is "+companyName);
	}

	//Check if the employee is present
	public int isPresent(){
		double isPresentEmp=Math.floor(Math.random()*10)%2;
		if(isPresentEmp==IS_PRESENT){
			return(1);
		}
		else{
			return(0);
		}
	}

	/**
        *Check if the employee works parttime or fulltime
        *@ return empWorks
        */

	public int isFullTime(){                                                                                                                                                                                                                                int IS_FULLTIME=1;
                double isFulltime=Math.floor(Math.random()*10)%2;
		if(isFulltime==IS_FULLTIME){
			return(1);
		}
		else{
			return(0);
		}
	}

	/**
	Calculate the fulltime employee wage
	* @ retrun employee wage
	*/

	public double FtWageCalculation(){
		double empWage;
		empWage=wagePerHour*fullTime;
		return(empWage);
	}

	/**
	*Calculate the parttime employee wage
	* @return employee wage
	*/

	public double PtWageCalculation(){
		double empWage;
		empWage=wagePerHour*partTime;
		return(empWage);
	}

}
