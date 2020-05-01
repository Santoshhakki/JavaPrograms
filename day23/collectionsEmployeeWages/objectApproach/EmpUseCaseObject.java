//import the required libraries.
import java.util.*;

/**
*Employee wage computation class
*@author Akshay
*/

public class EmpUseCaseObject{
	/**
	*main method
	*@param args args
	*/

	public static final double days=20.0;
	public static void main(String[] args){
		System.out.println("Welcome to the employee usecase problem");
		double totalWage;
		//Declare an Employee objects
		Employee Amadeus=new Employee("Amadeus",20.0,8.0,4.0);
		Employee Google=new Employee("google",30.0,9.0,5.0);
		Employee Facebook=new Employee("Facebook",30.0,10.0,4.0);

		//Declare the Array list to store employee objects
		ArrayList<Employee> companyArrays=new ArrayList<Employee>();

		companyArrays.add(Amadeus);
		companyArrays.add(Google);
		companyArrays.add(Facebook);

		//declare array for storing total wages.
		ArrayList<Double> totalWages=new ArrayList<Double>();

		//declare dictionary for storing values
		Map companyWagesMap = new HashMap();

		//Check if the employee is present 

		for(int i=0; i<companyArrays.size(); i++)
		{
			Employee companyEmpWage=companyArrays.get(i);
			int presence=companyEmpWage.isPresent();
                	int fullTime=companyEmpWage.isFullTime();
			switch(presence){
			case 1:
				//Check if the employee works fulltime or not
				switch(fullTime){
				case 1:
					//Display the wage calculated
					totalWage=days*companyEmpWage.FtWageCalculation();
					totalWages.add(totalWage);
					companyWagesMap.put(companyEmpWage.companyName,totalWage);

				break;
				case 0:
					//Display the wage calculated
                                	totalWage=days*companyEmpWage.PtWageCalculation();
					totalWages.add(totalWage);
					companyWagesMap.put(companyEmpWage.companyName,totalWage);
				break;
				}
			break;

			case 0:
				companyWagesMap.put(companyEmpWage.companyName,"Employee absent");
			break;
			}
		}

		System.out.println(companyWagesMap);

		System.out.println("Enter the company you want to query");
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		System.out.println(companyWagesMap.get(s));
	}
}


