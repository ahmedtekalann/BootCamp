package c_inheritance.b_homework.h1.c_polymorphismDemo;

public class EmailLogger extends BaseLogger{
	
	public void log(String message){
        System.out.println(message+"Logged to email.");
    }

}
