package e_nLayeredDemo.b_homework.business.utilities;

import java.util.Scanner;
import java.util.regex.Pattern;

import e_nLayeredDemo.b_homework.business.abstracts.UserService;
import e_nLayeredDemo.b_homework.core.abstracts.EmailVerificationService;
import e_nLayeredDemo.b_homework.entities.concretes.User;

public class Utility {
	
	private static EmailVerificationService emailVerificationService;
	
	private static UserService userService;

	private static boolean checkEmailFormat(String emailInput) {

		String emailPattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(emailPattern, Pattern.CASE_INSENSITIVE);

		return pattern.matcher(emailInput).find();
	}

	private static boolean checkFirstName(User user) {

		String firstName = user.getFirstName();
		if (firstName.isEmpty()) {
			System.out.println("First name can not be empty. ");
		} else if (firstName.length() < 2) {
			System.out.println("First name must contain at least two characters. ");
		}
		return false;
	}

	private static boolean checkLastName(User user) {

		String lastName = user.getLastName();
		if (lastName.isEmpty()) {
			System.out.println("Last name can not be empty");

		} else if (lastName.length() < 2) {
			System.out.println("Last name must contain at least two characters. ");
		}
		return false;
	}

	private static boolean checkPassword(User user) {

		String password = user.getPassword();
		if (password.isEmpty()) {
			System.out.println("Password can not be empty. ");
		} else if (password.length() < 6) {
			System.out.println("The password must be at least 6 characters. ");
		}
		return false;
	}

	private static boolean checkEmail(User user) {

		String email = user.getEmail();
		if (email.isEmpty()) {
			System.out.println("Email can not be empty. ");
		} else if (checkEmailFormat(email) == false) {
			System.out.println("Email must be in Email format. ");
		}
		return false;
	}

	private static boolean fillAllFields(User user) {
		String firstName = user.getFirstName();
		String lastName = user.getLastName();
		String password = user.getPassword();
		String email = user.getEmail();
		if(firstName.isEmpty()&&lastName.isEmpty()&&email.isEmpty()&&password.isEmpty()) {
			System.out.println("Fill all the fields!");
			return false;
		}
		return true;
	}
	
	public static void success(User user) {
		String messageSuccess = "Registeration is success. " + user.getFirstName() + " " + user.getLastName()
				+ "!";
		String messageFailure = "Registration failed ";
		String message = "";

		if (!checkFirstName(user) && !checkLastName(user) && !checkEmail(user) && !checkPassword(user)) {
			message = message.concat(messageSuccess);
			System.out.println(message);
		}

		if (checkFirstName(user) && checkLastName(user) && checkEmail(user) && checkPassword(user)) {
			message = message.concat(messageFailure);
			System.out.println(message);
		}

	}
	
	public static void deneme(User user) {
		
		if(fillAllFields(user)) {
			return;
		}
		if(!checkFirstName(user)) {
			return;
		}
		else if(!checkEmail(user)) {
			return;
		}
		else if(!checkPassword(user)) {
			return;
		}
		else {
			emailVerificationService.sendVerificationMail(user.getEmail());
			Scanner scanner = new Scanner(System.in);
			System.out.println("Type click to verify your email address.");
			String click = scanner.nextLine();
			
			if(emailVerificationService.isVerified(click)) {
				userService.register(user);
				System.out.println("Registeration successfull.");
			}
			else {
				System.out.println("Registeration failed.");
			}
			scanner.close();
		}
		
	} 

	public static void signup(User user) {

		String messageSuccess = "Login successfull. " + user.getFirstName() + " " + user.getLastName()
				+ "!";
		String messageFailure = "Login failed ";
		//String message = "";
		if (checkEmail(user)) {
			
		}
		if (checkPassword(user)) {
			
		}
		
	}
}