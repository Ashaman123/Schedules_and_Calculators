import java.util.Scanner;

public class Class_schedule {

	 static String[] classes = new String[6];
	
	
    public static void main(String[] args) {
        // Display the welcome message
        showWelcomeMessage();

      
    }

    public static void showWelcomeMessage() {
        System.out.println("************************************");
        System.out.println("   WELCOME TO YOUR CLASS SCHEDULE   ");
        System.out.println("************************************");
        System.out.println("");
        System.out.println("");
        System.out.println("PLEASE SELECT YOUR NEXT STEP");
        System.out.println("1. Create a new class schedule");
        System.out.println("2. View your current schedule");
        System.out.println("3. Quit to the main screen");
        Scanner scanner = new Scanner(System.in);
        int nextstep = scanner.nextInt();

        if (nextstep == 1) {
             showClassCreator(scanner);	
        }
	        else if (nextstep == 2) {
	        	showFullSchedule();
	        }
        
		        else if (nextstep == 3) {
		        	quitToMain();
		        }
			        
			         else {
			            System.out.println("Invalid input. returning to main class schedule screen");
			            System.out.println("");
			            showWelcomeMessage();
			         }
    }
    
    public static void showClassCreator(Scanner scanner) {
        System.out.println("************************************");
        System.out.println("   NEW CLASS SCHEDULE CREATOR   ");
        System.out.println("************************************");
        System.out.println("");
        System.out.println("How many classes do you have?");
        System.out.println("Enter up to 6 classes");
        int classNum = scanner.nextInt();
        
        // Consume the newline character
        scanner.nextLine();

        if (classNum < 1 || classNum > 6) {
            System.out.println("Invalid number of classes. Please enter up to 6 classes:");
            showClassCreator(scanner);
            return;
        }
        String[] classNames = new String[classNum];
        for (int i = 0; i < classNum; i++) {
            System.out.println("Enter the title of class #" + (i + 1) + ":");
            classNames[i] = scanner.nextLine();
            System.out.println("Class " + classNum + ": " + classNames[i] + " added successfully!");
            System.out.println("");
        }
        System.out.println("Class schedule successfully created!");
        System.out.println("*************************************************");
        System.out.println("   Would you like to see your class schedule?");
        System.out.println("Yes or No?");

        String input = scanner.nextLine();
        if (input.toLowerCase().contains("y")) {
            showFullSchedule();
        } else {
            showWelcomeMessage();
        }
    }

    public static void showFullSchedule() {
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("     CURRENT CLASS SCHEDULE     ");
        System.out.println("------------------------------------");

        for (int i = 0; i < classes.length; i++) {
            if (classes[i] != null) {
                System.out.println("Class #" + (i + 1) + ": " + classes[i]);
            }
        }
    }
    
    public static void quitToMain () {
    	System.out.println("");
    	System.out.println("");
    	System.out.println("");
    	System.out.println("");
    	System.out.println("*****************************");
    	System.out.println("       Have a good day!");
    	System.out.println("*****************************");

    	System.out.println("This will go to main menu");
    }
    
    
    
}
