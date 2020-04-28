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
		int fullTime=utils.isFullTime();
		//Check if the employee is present 
		switch(presence){
		case 1:
			//Check if the employee works fulltime or not
			switch(fullTime){
			case 1:
				//Display the wage calculated
				System.out.println("Employee wage for full time is "+ utils.FtWageCalculation());
			break;
			case 0:
				System.out.println("Employee wage for part time is "+ utils.PtWageCalculation());
			break;
			}
		break;

		case 0:
			System.out.println("Employee is absent");
		break;
		}
	}
}


