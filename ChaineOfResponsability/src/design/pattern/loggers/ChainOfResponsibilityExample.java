package design.pattern.loggers;

public class ChainOfResponsibilityExample {

	public static void main(String[] args) {
		
		// Construire la cha�ne de responsabilit�
		// StdoutLogger -> EmailLogger -> StderrLogger
		Logger logger, logger1;
		logger1 = logger = new StdoutLogger(Tools.DEBUG);
		logger1 = logger1.setNext(new EmailLogger(Tools.NOTICE));
		logger1 = logger1.setNext(new StderrLogger(Tools.ERR));
		
		// Trait� par StdoutLogger
		logger.message("Entering function y.", Tools.DEBUG);

		// Trait� par StdoutLogger et EmailLogger
		logger.message("Step1 completed.", Tools.NOTICE);

		// Trait� par les trois loggers
		logger.message("An error has occurred.", Tools.ERR);
	}

}
