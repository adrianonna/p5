package main;

import model.AbstractLogger;
import model.ConsoleLogger;
import model.ErrorLogger;
import model.FileLogger;

public class ChainPatternDemo {
	private static AbstractLogger getChainOfLoggers(){

		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		return errorLogger;	
	}

	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();

		loggerChain.logMessage(AbstractLogger.INFO, "Informacao Geral.");
		System.out.println();
		loggerChain.logMessage(AbstractLogger.DEBUG, "Informacao de Debug.");
		System.out.println();
		loggerChain.logMessage(AbstractLogger.ERROR, "Informacao de Erros.");
	}

}
