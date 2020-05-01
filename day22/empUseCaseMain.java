/**
* Calculate the employee wage of different employees using main method
* @ author Akshay
*/

public class empUseCaseMain{
	
	//Declare the constant variables;
	public static final int IS_PRESENT=1;
        private static final double wagePerHour=20;
        private final double monthDays=20;
	private static final double halfDay=4;
        private static final double fullDay=8;

	//Declare the main method
	public static void main(String[] args){
		//Declare the local variables
		int days=1;
		double empWage;
		//calculate the random value to check if employee is present.
		double empCheck=Math.floor(Math.random() * 10 ) %2;
		System.out.println("Welcome to the Employee Use Case problem");
	
		//The case statement to identify if employee is present
		switch ((int) empCheck){
		case 1:
			int IS_FULLTIME=1;
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
}

