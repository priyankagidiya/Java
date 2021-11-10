package projects;

public class SwitchExample {

	public static void main(String[] args) {
		//declaring a variable for switch expression
		int day = 5;
		String daystring;
		
		//switch statement with int datatype
		switch(day){
			//case statements
			case 1:
				daystring = "Monday";
				break;
			case 2:
				daystring = "Tuesday";
				break;
			case 3:
				daystring = "Wednesday";
				break;
			case 4:
				daystring = "Thursday";
				break;
			case 5:
				daystring = "Friday";
				break;
			case 6:
				daystring = "Saturday";
				break;
			case 7:
				daystring = "Sunday";
				break;
				//Default case statement
				default:
					daystring = "Invalid day";
			
		}
		System.out.println("The day is : " +daystring);

	}

}
