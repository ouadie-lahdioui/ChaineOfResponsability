package design.pattern.loggers;

/**
 * 
 * Classe de gestion de journalisation abstraite.
 * @author Ouadie LAHDIOUI <ouadiesoft@gmail.com>
 * 
 */
abstract class Logger {
	
	/**
	 * Le niveau de journalisation
	 */
	protected int level;

	/**
	 * L'élément suivant dans la chaîne de responsabilité. 
	 */
	protected Logger next;

	/**
	 * Constructeur
	 * @param level niveau de journalisation
	 */
	protected Logger(int level) {
		this.level = level;
		this.next = null;
	}

	/**
	 * Récupérer l'élément suivant dans la chaîne de responsabilité. 
	 * @param l
	 * @return
	 */
	public Logger setNext(Logger l) {
		next = l;
		return l;
	}

	public void message(String msg, int priority) {
		if (priority <= level)
			writeMessage(msg);

		if (next != null)
			next.message(msg, priority);
	}

	abstract protected void writeMessage(String msg);
}
