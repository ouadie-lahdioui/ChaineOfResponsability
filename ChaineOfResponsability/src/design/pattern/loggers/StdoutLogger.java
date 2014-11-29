package design.pattern.loggers;

/**
 * Journalisation sur la sortie standard.
 */
class StdoutLogger extends Logger {
	
	public StdoutLogger(int level) {
		super(level);
	}

	protected void writeMessage(String msg) {
		System.out.println("Writing to stdout: " + msg);
	}
	
}