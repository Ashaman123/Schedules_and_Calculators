import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//import Schedule_and_Calcultors.Class_schedule;
public class MainMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LocalDateTime currentDateTime = LocalDateTime.now();
	        
	        // Define a format for the date and time
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy : HH:mm:ss");
	        
	        // Format and print the current date and time
	        String formattedDateTime = currentDateTime.format(formatter);
	        System.out.println("Current Date and Time: " + formattedDateTime);
	        System.out.println("");

	        	 //Class_schedule ClassSch = new Class_schedule();
	        	
	gotoMainMenu();
	}

	public static void gotoMainMenu() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("**********************************************************");
		System.out.println("   VARIOUS CALCULATORS, SCHEDULERS, AND RANDOM PROJECTS");
        System.out.println("**********************************************************");
		System.out.println("");
		System.out.println("Please input the number corresponding to the program you would like to access!");
        System.out.println("1. Class Scheduler");
        System.out.println("2. Paycheck Calculator");
        System.out.println("3. Remaining Money Calculator");
        System.out.println("4. To Do List");
        System.out.println("5. Weather App");
        System.out.println("6. Grocery List");
        System.out.println("7. Scratch Ticket Game");
        	int next = scanner.nextInt();
        		if(next == 1) {
        			gotoClassSchedule();
        		}
	        		else if(next == 2) {
	        			gotoPaycheckCalc();
	        		}
	        		
	        		else if(next == 3) {
	        			gotoMoneyRemaining();
	        		}
	        		
	        		else if(next == 4) {
	        			gotoToDoList();
	        		}
	        		
	        		else if(next == 5) {
	        			gotoWeatherApp();
	        		}
	        		
	        		else if(next == 6) {
	        			gotoGroceryList();
	        		}
	        		else if(next == 7) {
	        			gotoScratchGame();
	        		}
	        		else if(next == 8) {
	        			gotoMessageCipher();
	        		}
        		
        		
        		
        		
        		
        		
        		
        		
        		
		        		else {
		        			gotoMainMenu();
		        		}
	}
	public static void gotoClassSchedule() {
		
		System.out.println("STARTING CLASS SCHEDULE...");
		Class_schedule.showWelcomeMessage();
	}
	public static void gotoPaycheckCalc() {
		System.out.println("STARTING PAYCHECK CALCULATOR...");
		PaycheckCalculator.showWelcomeMessage();
	}
	public static void gotoMoneyRemaining() {
		System.out.println("STARTING REMAINING MONEY CALCULATOR...");
		MoneyRemaining.showWelcomeMessage();
	}
	public static void gotoToDoList() {
		System.out.println("STARTING TO DO LIST...");
		ToDoList.showWelcomeMessage();
	}
	public static void gotoWeatherApp() {
		System.out.println("STARTING WEATHER APP...");
		WeatherApp.showWelcomeMessage();
	}
	public static void gotoGroceryList() {
		System.out.println("STARTING GROCERY LIST...");
		GroceryList.showWelcomeMessage();
	}
	public static void gotoScratchGame() {
		System.out.println("STARTING REMAINING SCRATCH TICKET GAME...");
		ScratchTicketGame.showWelcomeMessage();
	}
	public static void gotoMessageCipher() {
		System.out.println("STARTING REMAINING SCRATCH TICKET GAME...");
		MessageCipher.showWelcomeMessage();
	}





}