/** 
* Emp utils class
* @ author Akshay
*/

public class empUtils{
	
	/** 
	*check if the employee is present
	* @ return isPresent or not
	*/

        public int isPresent(){
                int IS_PRESENT=1;
                double isPresentEmp=Math.floor(Math.random()*10)%2;
                if(isPresentEmp==IS_PRESENT){
                        return(1);
                }
                else{
                        return(0);
                }
        }
}
