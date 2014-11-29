package design.pattern.loggers;

/**
 * Journalisation sur l'erreur standard.
 */
class StderrLogger extends Logger {
	
	public StderrLogger(int level) {
		super(level);
	}

	protected void writeMessage(String msg) {
		System.err.println("Sending to stderr: " + msg);
	}
	
}