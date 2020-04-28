public class EmployeeUseCase{

	public static void main(String[] args){
		int IS_PRESENT=1;
		double wagePerHour=20;
		double fullDay=8;
		double halfDay=4;
		double empWage;
		double monthDays=20;
		int days=1;

		double empCheck=Math.floor(Math.random() * 10 ) %2;
		System.out.println("Welcome to the Employee Use Case problem");

		switch ((int) empCheck){
		case 1:
			int IS_FULLTIME=1;
			double fullTimeCheck=Math.floor(Math.random()*10)%2;
			double totalMonthWage;
			System.out.println("Employee is present");

			switch ((int) fullTimeCheck){
			case 1:
				empWage=wagePerHour*fullDay;
				System.out.println("Employee works fulltime and Employee wage is: "+ empWage);
				while (days<21){
				totalMonthWage=empWage*days;
				System.out.println("Employee wage for "+days+" day is: "+ totalMonthWage);
				days++;
				}

			break;

			case 0:
				empWage=wagePerHour*halfDay;
				System.out.println("Employee works parttime and Employee wage is: "+ empWage);
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

