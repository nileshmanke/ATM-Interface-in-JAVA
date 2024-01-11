import java.util.*;

 interface BankingOperations {

	void createAccount();
    void miniStatement();
    void viewBalance();
    void moneyTransfer();
}



 class Bank implements BankingOperations{
	
	Scanner scanner = new Scanner(System.in);

	@Override
	public void createAccount() {
		System.out.println("Creating account...");

        // Gather additional user details
        System.out.println("Enter first name:");
        String firstName = scanner.next();

        System.out.println("Enter last name:");
        String lastName = scanner.next();

        System.out.println("Enter phone number:");
        String phoneNumber = scanner.next();

        // Process account creation with entered details
        System.out.println("Account created for " + firstName + " " + lastName + " with phone number " + phoneNumber);
		
	}

	@Override
	public void miniStatement() {
		
		
		System.out.println("Enter your ATM PIN");
		long vatmpin=scanner.nextLong();
		System.out.println("Generating mini statement...");
		 String accountHolder = "NILESH RAVINDRA MANKE";
	        String accountNumber = "XXXX-XXXX-XXXX-22090";
	        System.out.println("2023-11-09\", \"Debit\", \"Grocery Store Purchase\", \"- $50.00");
	        System.out.println("2023-11-08\", \"Credit\", \"Salary Deposit\", \"+ $2,000.00");
	        System.out.println("2023-11-05\", \"Credit\", \"Online Transfer - Friend\", \"+ $75.00");
	        System.out.println("2023-11-05\", \"Credit\", \"Online Transfer - Friend\", \"+ $99.00");
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Account Number: " + accountNumber);
	        
        continueOrEnd();
	}

	@Override
	public void viewBalance() {
		
		System.out.println("Viewing account balance...");
		System.out.println("Enter your ATM PIN");
		long vatmpin=scanner.nextLong();
		System.out.println("Available Balance: 8500/-");
        continueOrEnd();
		
	}

	@Override
	public void moneyTransfer() {
		
		System.out.println("Initiating money transfer...");
		
		System.out.println("Enter Account Number");
		long accno=scanner.nextLong();
		System.out.println("Enter IFCS code");
		long ifcsno=scanner.nextLong();
		System.out.println("Enter Amount");
		long amt=scanner.nextLong();
		System.out.println("Enter Your ATM PIN");
		long pin=scanner.nextLong();
		System.out.println("Processing Transfer.....");
		System.out.println("Money tranfer to  Account Number"+" "+ accno );
		System.out.println("Payment succesful");
		
		
        continueOrEnd();
	}
	
	
	
	
	public void continueOrEnd() {
        System.out.println("Do you want to continue forward or end your session? (Enter 'continue' or 'end')");
        String choice = scanner.next().toLowerCase();

        if (choice.equals("continue")) {
            System.out.println("Continuing...\n");
            showMenu();
        } else if (choice.equals("end")) {
            System.out.println("Ending your session...");
            System.exit(0); // End the program
        } else {
            System.out.println("Invalid input. Ending your session...");
            System.exit(0); // End the program
        }
    }
	
	
	
	
	
	public void showMenu() {
		 System.out.println("WELCOME TO STATE BANK OF INDIA :");
        System.out.println("Choose an operation:");
        System.out.println("1. Create Account");
        System.out.println("2. Mini Statement");
        System.out.println("3. View Balance");
        System.out.println("4. Money Transfer");
        System.out.println("0. Exit");
    }

}


 class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
            Bank bank = new Bank();

            int choice;
            do {
                bank.showMenu();
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        bank.createAccount();
                        break;
                    case 2:
                        bank.miniStatement();
                        break;
                    case 3:
                        bank.viewBalance();
                        break;
                    case 4:
                        bank.moneyTransfer();
                        break;
                    case 0:
                        System.out.println("Ending your session...");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }

                if (choice != 0) {
                    bank.continueOrEnd();
                }
            } while (choice != 0);
        }
    }

	

}

