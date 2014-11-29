package design.pattern.loggers;

/**
 * Journalisation par courriel.
 */
class EmailLogger extends Logger {
	
	public EmailLogger(int level) {
		super(level);
	}

	protected void writeMessage(String msg) {
		System.out.println("Sending via email: " + msg);
	}
	
}