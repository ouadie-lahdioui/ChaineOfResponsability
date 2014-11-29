package design.pattern.loggers;

public class ChainOfResponsibilityExample {

	public static void main(String[] args) {
		
		// Construire la chaîne de responsabilité
		// StdoutLogger -> EmailLogger -> StderrLogger
		Logger logger, logger1;
		logger1 = logger = new StdoutLogger(Tools.DEBUG);
		logger1 = logger1.setNext(new EmailLogger(Tools.NOTICE));
		logger1 = logger1.setNext(new StderrLogger(Tools.ERR));
		
		// Traité par StdoutLogger
		logger.message("Entering function y.", Tools.DEBUG);

		// Traité par StdoutLogger et EmailLogger
		logger.message("Step1 completed.", Tools.NOTICE);

		// Traité par les trois loggers
		logger.message("An error has occurred.", Tools.ERR);
	}

}
