package ro.ase.cts.chain.clase;

public abstract class Notificator {
	private Notificator notificator;
	
	public abstract void trimitereNotificare(Client client, String text);

	public void setNotificator(Notificator notificator) {
		this.notificator = notificator;
	}

	public Notificator getNotificator() {
		return notificator;
	}
	
}
