/**
*Employee wage computation class
*@author Akshay
*/

public class EmpUsecase{
	/**
	*main method
	*@param args args
	*/

	public static void main(String[] args){
		System.out.println("Welcome to the employee usecase problem");

		//Declare an empUtils object
		empUtils utils=new empUtils();
		int presence=utils.isPresent();

		//Print if employee is present or absent
		if(presence==1){
			double wage=utils.wageCalculation();
			System.out.println("Employee wage is "+wage);
		}
		else{
			System.out.println("Employee is absent");
		}
	}
}


