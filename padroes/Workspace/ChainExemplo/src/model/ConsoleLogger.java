package model;

public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level){
		this.level = level;
	}

	public void write(String message) {		
		System.out.println("Console Padrao :: Logger: " + message);
	}
}
