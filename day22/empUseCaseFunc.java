/**
* Calculate the employee wage of different employees using procedural method
* @ author Akshay
*/

public class empUseCaseFunc{

	//Declare the constant variables.
	public static final int IS_PRESENT=1;	
	public static final int IS_FULLTIME=1;
	
	//Define the function to calculate the wages.
	public static void wageCalculation(String name,double wagePerHour,double fullDay,double halfDay,double monthDays){
		//declare the local variables
		double empWage;
		int days=1;

		//calculate the random value to check if employee is present.
		double empCheck=Math.floor(Math.random() * 10 ) %2;
		System.out.println("Welcome to the Employee Use Case problem");
		System.out.println("Name of the company is "+name);

		//The case statement to identify if employee is present
		switch ((int) empCheck){
		case 1:
			//calculate the random value to check if employee is working parttime or full time..
			double fullTimeCheck=Math.floor(Math.random()*10)%2;
			double totalMonthWage;
			System.out.println("Employee is present");

			//Case statement to identify if employee is working part time or full time.
			switch ((int) fullTimeCheck){
			case 1:
				//Caclulate the employee wages for full time.
				empWage=wagePerHour*fullDay;
				System.out.println("Employee works fulltime and Employee wage is: "+ empWage);
				//Calculate the employee wage for 20 days for full time.
				while (days<21){
				totalMonthWage=empWage*days;
				System.out.println("Employee wage for "+days+" day is: "+ totalMonthWage);
				days++;
				}

			break;

			case 0:
				//Caclulate the employee wages for part time.
				empWage=wagePerHour*halfDay;
				System.out.println("Employee works parttime and Employee wage is: "+ empWage);
				//Calculate the employee wage for 20 days for part time.
				while (days<21){
				totalMonthWage=empWage*days;
				System.out.println("Employee wage for "+days+" day is: "+ totalMonthWage);
				days++;
				}
			break;
			}
		break;

		case 0:
			System.out.println("Employee is absent");
		}

	}

	public static void main(String args[]){
		wageCalculation("Amadeus",20.0,8.0,4.0,20.0);
	}
}

